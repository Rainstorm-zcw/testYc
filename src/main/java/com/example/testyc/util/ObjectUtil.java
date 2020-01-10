package com.example.testyc.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.*;

/**
 * TODO(这里用一句话描述这个类的作用)<br>
 * @author Minh<br>
 */
@Slf4j
public class ObjectUtil {
	public static <T> T fullObject(Class<T> cl) {
		T t = null;
		try {
			t = cl.newInstance();
			Method methods[] = cl.getMethods();
			for (Method method : methods) {
				// 如果是set方法,进行随机数据的填充
				if (method.getName().indexOf("set") == 0) {
					Class<?> param = method.getParameterTypes()[0];
					if (param.equals(String.class)) {
						method.invoke(t, randomCodes(2));
					} else if (param.equals(Short.class)) {
						method.invoke(t, (short) new Random().nextInt(5));
					} else if (param.equals(Float.class)) {
						method.invoke(t, new Random().nextFloat());
					} else if (param.equals(Double.class)) {
						method.invoke(t, new Random().nextDouble());
					} else if (param.equals(Integer.class)) {
						method.invoke(t, new Random().nextInt(10));
					} else if (param.equals(Long.class)) {
						method.invoke(t, new Random().nextLong());
					} else if (param.equals(Date.class)) {
						method.invoke(t, new Date());
					} else if (param.equals(Timestamp.class)) {
						method.invoke(t, new Timestamp(System.currentTimeMillis()));
					} else if (param.equals(java.sql.Date.class)) {
						method.invoke(t, new java.sql.Date(System.currentTimeMillis()));
					}
				}
			}
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			log.error(e.getMessage(), e);
		}
		return t;
	}

	public static String randomCodes(int length) {// length表示生成字符串的长度
		String base = "abcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}

	public static <S, T> List<T> copyProperties(List<S> sources, Class<T> destinationClass) throws InstantiationException, IllegalAccessException {
		if (CollectionUtils.isEmpty(sources)) {
			return Collections.emptyList();
		}
		List<T> ts = new ArrayList<>();
		for (Object s : sources) {
			T t = destinationClass.newInstance();
			BeanUtils.copyProperties(s, t);
			ts.add(t);
		}
		return ts;
	}

	/**
	 * 半角字符串转换全角字符串<br>
	 * 说明：Character.MIN_VALUE Character.MAX_VALUE<br>
	 * 1、半角字符是从33开始到126结束<br>
	 * 2、与半角字符对应的全角字符是从65281开始到65374结束<br>
	 * 3、其中半角的空格是32，对应的全角空格是12288<br>
	 * 4、半角和全角的关系很明显，除空格外的字符偏移量是65248 (65281-33 = 65248)<br>
	 * @since 1.0 2016-12-30 上午10:51:28<br>
	 * @author Minh<br>
	 * @param halfWidthStr 半角字符串
	 * @return 全角字符串<br>
	 */
	public static String halfWidth2fullWidth(String halfWidthStr) {
		if (StringUtils.isEmpty(halfWidthStr)) {
			return halfWidthStr;
		}
		char[] charArray = halfWidthStr.toCharArray();
		for(int i = 0; i < charArray.length; i++){
			int charIntValue = (int) charArray[i];
			if(charIntValue >= 33 && charIntValue <= 126){
				charArray[i] = (char) (charIntValue + 65248);
			}else if(charIntValue == 32){
				charArray[i] = (char) 12288;
			}
		}
		return new String(charArray);
	}

	/**
	 * 全角字符串转换半角字符串<br>
	 * 说明：Character.MIN_VALUE Character.MAX_VALUE<br>
	 * 1、半角字符是从33开始到126结束<br>
	 * 2、与半角字符对应的全角字符是从65281开始到65374结束<br>
	 * 3、其中半角的空格是32，对应的全角空格是12288<br>
	 * 4、半角和全角的关系很明显，除空格外的字符偏移量是65248 (65281-33 = 65248)<br>
	 * @since 1.0 2016-12-30 上午10:51:28<br>
	 * @author Minh<br>
	 * @param fullWidthStr 全角字符串
	 * @return 半角字符串<br>
	 */
	public static String fullWidth2halfWidth(String fullWidthStr) {
		if (StringUtils.isEmpty(fullWidthStr)) {
			return fullWidthStr;
		}
		char[] charArray = fullWidthStr.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			int charIntValue = (int) charArray[i];
			if (charIntValue >= 65281 && charIntValue <= 65374) {
				charArray[i] = (char) (charIntValue - 65248);
			} else if (charIntValue == 12288) {
				charArray[i] = (char) 32;
			}
		}
		return new String(charArray);
	}

	/**
	 * 校验全角字符串<br>
	 * @since 1.0 2016-12-30<br>
	 * @author Minh<br>
	 * @param str 字符串
	 * @return 是否包含全角字符串<br>
	 */
	public static Boolean validateFullWidth(String str) {
		Boolean result = false;
		if (StringUtils.isEmpty(str)) {
			return result;
		}
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			int charIntValue = (int) charArray[i];
			if ((charIntValue >= 65281 && charIntValue <= 65374) || charIntValue == 12288) {
				result = true;
			}
		}
		return result;
	}
	
	/**
	 * 校验半角字符串<br>
	 * @since 1.0 2016-12-30<br>
	 * @author Minh<br>
	 * @param str 字符串
	 * @return 是否包含全角字符串<br>
	 */
	public static Boolean validateHalfWidth(String str) {
		Boolean result = false;
		if (StringUtils.isEmpty(str)) {
			return result;
		}
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			int charIntValue = (int) charArray[i];
			if ((charIntValue >= 33 && charIntValue <= 126) || charIntValue == 32) {
				result = true;
			}
		}
		return result;
	}
	
}
