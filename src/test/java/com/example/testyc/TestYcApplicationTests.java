package com.example.testyc;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.testyc.persistence.entity.StandardAddressConstants;
import com.example.testyc.persistence.entity.User;
import com.example.testyc.persistence.entity.UserConcat;
import com.example.testyc.persistence.entity.UsersCopy;
import com.example.testyc.persistence.vo.AccountCheckConstants;
import com.example.testyc.persistence.vo.CommResultAo;
import com.example.testyc.util.EhcacheConfig;
import com.example.testyc.util.TokenUtil;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.startup.UserConfig;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.formula.functions.T;
import org.assertj.core.util.Sets;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;


@Slf4j
@SpringBootTest
class TestYcApplicationTests {

    @Autowired
    private EhcacheConfig ehcacheConfig;

    private Logger logger = LoggerFactory.getLogger(TestYcApplicationTests.class);

    @Test
    void contextLoads() {
        int num = 02362;
        int count = 1;
        while (true) {
            num = num / 10;
            count++;
            if (num < 10) {
                break;
            }
        }
        logger.info("测试:{}", count);
    }

    @Test
    void decimalTest() {
        double value = 30314905.14142;
        /**
         * 强制转换为int
         */
        int num = (int) value;
        logger.info("输出转换结果:{}", num);
        int count = 1;
        while (true) {
            num = num / 10;
            count++;
            if (num < 10) {
                break;
            }
        }
        logger.info("输出位数：{}", count);
    }

    @Test
    void testDubbo() {
        ApplicationConfig application = new ApplicationConfig();
        application.setName("testHy");
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        ReferenceConfig<GenericService> rc = new ReferenceConfig<>();
        rc.setApplication(application);
        rc.setGeneric(true);
        rc.setInterface("com.ouyeel.wl.servicecenter.yc.api.ycputout.YcOutputQueryApi");
        rc.setId("ycOutputQueryApi");
        rc.setGroup("yc_wl_service_dev");
        rc.setRegistry(registryConfig);
        logger.info("输出配置信息:{}", rc);

        ReferenceConfigCache cache = ReferenceConfigCache.getCache();
        GenericService genericService = cache.get(rc);

        Map map = Maps.newHashMap();
        map.put("pageNum", 1);
        map.put("pageSize", 10);
        Object result = genericService.$invoke("queryAllCompany", new String[]{""}, new Object[]{map});

        logger.info("输出结果:{}", result);

    }

    @Test
    public void testCache() {
        String cacheName = "myCache";
        String key = "13333333333";
        String val = "测试缓存";
        //保存缓存
        ehcacheConfig.save(cacheName, key, val);
        //获取缓存
        Object object = ehcacheConfig.get(cacheName, key);
        log.info("输出缓存:{}", object.toString());
        //删除缓存
        ehcacheConfig.remove(cacheName, key);
        //获取缓存
        Object object2 = ehcacheConfig.get(cacheName, key);
        log.info("重新输出缓存:{}", object2);
    }

    @Test
    public void testAnnotationCache() {
        String key = "18888888888";
        String val = "注解方式测试缓存";
        //保存缓存
        ehcacheConfig.annotationSave(key, val);
        //获取缓存
        Object object = ehcacheConfig.cacheIng(key, val);
        log.info("注解方式输出缓存:{}", object.toString());
        //删除缓存
        ehcacheConfig.annotationRemove(key);
        //获取缓存
        Object object2 = ehcacheConfig.get("myCache", key);
        log.info("注解方式重新输出缓存:{}", object2);
    }

    @Test
    public void bubbleSort() {
        int[] n = {2, 4, 1, 13, 35, 12, 25};
        for (int i = 0; i < n.length - 1; i++) {
            log.info("输出n[i]:{}----------", n[i]);
            for (int j = 0; j < n.length - 1 - i; j++) {
                log.info("输出n[i][j]:{}-----{}", n[i], n[j]);
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
        log.info("输出结果:{}", JSON.toJSONString(n));
    }


    @Test
    public void testToken() throws Exception {
        TokenUtil token = new TokenUtil();
        token.setMillSecond(System.currentTimeMillis());
        token.setAt(AccountCheckConstants.BindCompanyActionTypeEnum.CREATE_COMPANY);
        token.setCompanyName("技术有限公司");
        token.setPhone("13737373777");
        String secret = TokenUtil.encrypt(token);
        log.info("当前请求时间");
        Thread.sleep(11 * 1000);
        CommResultAo<TokenUtil> tokenUtilCommResultAo = token.auditActionSecret(AccountCheckConstants.BindCompanyActionTypeEnum.CREATE_COMPANY, secret, token.getPhone(), token.getCompanyName());
        log.info("结果为:{}", JSON.toJSONString(tokenUtilCommResultAo));

    }


    @Test
    public void sortTest() {
        int[] num = {21, 32, 11, 5, 3, 87, 98};
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                }
            }
        }
        log.info("输出冒泡排序结果:{}", num);
    }

    @Test
    public void bigDecimal() {
        BigDecimal bigDecimal = new BigDecimal("10");
        log.info("输出结果 ：{}", bigDecimal);
    }

    @Test
    public void testTime() {
        String time = "20200303";
        //截取日期得到月和天
        String month = time.substring(4, 6);
        String day = time.substring(6);
        log.info("输出月:{},日:{}", month, day);
        //定义天的倍数
        Integer div = 5;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            Date date = simpleDateFormat.parse(time);
            Integer intDay = Integer.parseInt(day);
            //循环判断参数日期是否小于天的倍数（如果是月初1号，小于倍数5，则取下个月最近的倍数日期）
            while (intDay < div) {
                //当前日期减去1天
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                calendar.add(Calendar.DAY_OF_MONTH, -1);
                date = calendar.getTime();
                log.info("输出日期:{}", simpleDateFormat.format(date));
                intDay = date.getDay();
            }
            //得到新日期及获取对应年、月、日
            String newTime = simpleDateFormat.format(date);
            log.info("输出新日期：{}", newTime);
            String newYear = newTime.substring(0, 4);
            String newMonth = newTime.substring(4, 6);
            String newDay = newTime.substring(6);
            Integer days = Integer.parseInt(newDay);
            //判断新日期除倍数后取余是否为0
            for (int i = 1; i < days; i++) {
                if (days % div == 0) {
                    newDay = days.toString();
                    break;
                }
                days--;
            }
            if (Integer.parseInt(newDay) < 10) {
                newDay = "0" + newDay;
            }
            logger.info("输出最終日期:{}", newYear + newMonth + newDay);
        } catch (Exception ex) {
            log.error("异常输出:{}", ex);
        }
    }


    @Test
    public void testSort() {
        Map map = Maps.newHashMap();
        map.put(1000, "1");
        map.put(3000, "3");
        map.put(2000, "2");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()));
        log.info("輸出map：{}", JSON.toJSONString(map));
        log.info("输出多少个map:{}", map.size());

    }

    @Test
    public void testSubstring(){
        String code = "SHR1034821_WP22392";
        int index = code.indexOf("_");
        log.info("输出:{},{}",index, code.substring(index+1));
    }


    @Test
    public void testMapAll() {
        Map map = Maps.newHashMap();
        map.put("ee", "gg");
        try {
            if (!ObjectUtils.isEmpty(map.get("hha"))) {

            }
            log.info("输出map:{}", JSON.toJSONString(map));

        } catch (Exception ex) {
            log.error("异常了:{},{}", ex.getMessage(), ex);
        }

        if ("eq".equalsIgnoreCase("EQ")) {
            log.info("相等");
        } else {
            log.info("不相等");
        }

    }

    @Test
    public void testList() {
        List<User> userList = Lists.newArrayList();
        if (true) {
            User user = new User();
            user.setAge(0);
            user.setCode("零");
            user.setName("蚁人");
            user.setPROVINCE("上海");
            user.setCITY("宝山");
            userList.add(user);
        }
        if (true) {
            User user = new User();
            userList.add(user);
            user.setAge(1);
            user.setCode("壹");
            user.setName("美队");
            user.setPROVINCE("河南");
            user.setCITY("周口");
        }
        logger.info("输出结果:{}", JSON.toJSONString(userList));
    }

    @Test
    public void testCopy() {

        User user = new User();
        user.setAge(0);
        user.setCode("6.52");
        user.setName("9");
        user.setPROVINCE("0.1342");
        user.setCITY("5");

        UsersCopy usersCopy = new UsersCopy();

        usersCopy = JSONObject.parseObject(JSON.toJSONString(user), UsersCopy.class);

        log.info("输出:{}", JSON.toJSON(usersCopy));

    }

    @Test
    public void testMapList() {
        List<User> list = Lists.newLinkedList();
        User A = new User();
        A.setAge(0);
        A.setCode("零");
        A.setName("蚁人");
        A.setPROVINCE("上海");
        A.setCITY("宝山");
        User B = new User();
        B.setAge(1);
        B.setCode("壹");
        B.setName("美队");
        B.setPROVINCE("河南");
        B.setCITY("周口");
        User C = new User();
        C.setAge(1);
        C.setCode("壹");
        C.setName("美队");
        C.setPROVINCE("河南");
        C.setCITY("周口");
        list.add(A);
        list.add(B);
        list.add(C);
        Map<String, List<User>> collect = list.stream().collect(Collectors.groupingBy(d -> d.getCode()));
        logger.info("输出结果:{}", JSON.toJSONString(collect));
        Map<String, List<Map<String, Object>>> resultMap = Maps.newHashMap();
        collect.forEach((k, v) -> {
            List<Map<String, Object>> mapList = Lists.newArrayList();
            v.stream().forEach(dd -> {
                Map item = Maps.newHashMap();
                item.put("key", dd.getCode());
                item.put("value", dd.getName());
                mapList.add(item);
            });
            resultMap.put(k, mapList);
        });

        logger.info("输出结果:{}", JSON.toJSONString(resultMap));

    }

    @Test
    public void testConstants(){
        String value = "";
        try {
            assert !value.equals(""):"程序错误";

        }catch (Exception ex){
            log.info(ex.getMessage());
        }


        switch (StandardAddressConstants.SiteType.getValue("JHD")){
            case CK:
                log.info("输出CK");
                break;
            case JHD:
            case SHD:
                log.info("输出JHD");
                break;
            default:
                log.info("什么也不出");
                break;
        }
    }

@Test
    public static void useAssertExt2() {
        boolean isOk = 1 > 2;
        try {
            assert isOk : "程序错误";
            System.out.println("程序正常");
        } catch (AssertionError err) {
            System.out.println(err.getMessage());
        }
    }

    private static BigDecimal MAXIMUM = new BigDecimal(99999);
    private static BigDecimal REMAINDER = new BigDecimal(999);
    /**
     * 最大重量校验
     * @param maxNum 传的重量值  MAXIMUM 为 9999999999，   REMAINDER 为 999999
     * @return boolean
     */
    private boolean maxWeightCheck(String maxNum){
        if(StringUtils.isBlank(maxNum)){
            maxNum = "0";
        }
        if (maxNum.indexOf(".") > 0) {
            String[] str = maxNum.split("\\.");
            BigDecimal num = new BigDecimal(str[0]);
            BigDecimal remainder = new BigDecimal(str[1]);
            if ((num.compareTo(MAXIMUM) > 0) || (remainder.compareTo(REMAINDER) > 0)) {
                return false;
            }
        } else {
            BigDecimal num = new BigDecimal(maxNum);
            if (num.compareTo(MAXIMUM) > 0) {
                return false;
            }
        }
        return true;
    }


    @Test
    public void testNum(){
        String value = "10.330";

        try {
            boolean flag = maxWeightCheck(value);
            log.info("输出结果:{}", flag);
        }catch (Exception ex){
            log.error("异常",ex);
        }
    }

    /**
     * object 转换list
     */
    @Test
    public void testListFilter(){
        List list = Arrays.asList("JACK","ROSE","TOM","JOKER");
        log.info(JSON.toJSONString(list.stream().filter(a -> !a.equals("TOM")).collect(Collectors.toList())));
        Object object = list.stream().filter(a -> !a.equals("TOM")).collect(Collectors.toList());
        if(object instanceof List){
            list = Lists.newLinkedList();
            for (Object o : (List)object){
                list.add(o);
            }
        }
        log.info("输出结果:{}", list);

    }

    /**
     *     Object obj = getObj();
     *     List<String> list = castList(obj, String.class);
     *     list.forEach(System.out::println);
     * @param obj
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> castList(Object obj, Class<T> clazz)
    {
        List<T> result = new ArrayList<T>();
        if(obj instanceof List<?>)
        {
            for (Object o : (List<?>) obj)
            {
                result.add(clazz.cast(o));
            }
            return result;
        }
        return null;
    }


    @Test
    public void testSetConvertList(){
        Set<String> set = Sets.newHashSet();
        set.add("测试");
        set.add("UI吗");
        List<String> list = Lists.newLinkedList(set);
        log.info("输出:{}", JSON.toJSONString(list));
        list.add("测试");
        Set<String> set2 = Sets.newHashSet(list);
        log.info("输出结果:{}",  JSON.toJSONString(set2));
        BigDecimal bigDecimal = new BigDecimal(0);
        BigDecimal bigDecimal1 = new BigDecimal(0);
        List<Integer> listNum = Lists.newLinkedList();
        listNum.add(10);
        listNum.add(20);
        listNum.add(30);
        listNum.add(40);
        BigDecimal bigDecimal2 ;
        /*for (Integer integer : listNum) {
            bigDecimal = bigDecimal.add(new BigDecimal(integer));

        }*/
        BigDecimal reduce = listNum.stream().map(BigDecimal::new).reduce(BigDecimal.ZERO, BigDecimal::add);
        /*listNum.stream().forEach(a->{
            BigDecimal bigDecimal3 = new BigDecimal(0);
            bigDecimal = bigDecimal3.add(new BigDecimal(a));
        });*/

        bigDecimal1 =  bigDecimal1.add(reduce);
        bigDecimal1 = bigDecimal1.add(new BigDecimal("100"));
        log.info("输出结果:{},{}",bigDecimal,bigDecimal1);
    }

    /**
     * 验证lambda处理list
     */
    @Test
    public void testStreamSpeed(){
        List<UsersCopy> list = Lists.newArrayList();
        UsersCopy usersCopy = new UsersCopy();
        usersCopy.setCode(1001);
        usersCopy.setPROVINCE(new BigDecimal("29"));
        UsersCopy usersCopy1 = new UsersCopy();
        usersCopy1.setCode(1002);
        usersCopy1.setPROVINCE(new BigDecimal("30"));
        UsersCopy usersCopy2 = new UsersCopy();
        usersCopy2.setCode(1003);
        usersCopy2.setPROVINCE(new BigDecimal("39"));
        UsersCopy usersCopy4 = new UsersCopy();
        usersCopy4.setCode(1001);
        usersCopy4.setPROVINCE(new BigDecimal("39"));
        list.add(usersCopy);
        list.add(usersCopy1);
        list.add(usersCopy2);
        list.add(usersCopy4);

        Map<Double, List<UsersCopy>> collect = list.stream().collect(Collectors.groupingBy(UsersCopy::getCode));
        log.info("输出结果:{}", JSON.toJSONString(collect));
        List<BigDecimal> listAmount = Lists.newArrayList();
        collect.forEach((k, v) -> {

            v.forEach(a -> {
                BigDecimal amount = a.getPROVINCE().divide(new BigDecimal(2),2,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("10")).setScale(2,BigDecimal.ROUND_HALF_UP);
                listAmount.add(amount);
            });
        });

        log.info("输出结果:{}", JSON.toJSONString(listAmount));
        BigDecimal reduce = listAmount.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        log.info("输出最后结果:{}", JSON.toJSONString(reduce));
    }


    /**
     * 测试stream 和 parallelStream
     *
     * 100000 十万数据 (不加延迟)
     * stream耗时:7ms parallelStream耗时:6ms foreach耗时:1ms
     *
     * 10000 万级数据（加延迟）
     * stream耗时:16418ms
     * parallelStream耗时:2044ms
     * foreach耗时:16396ms
     */
    @Test
    public void testStreamAndParallelStream(){

        List<Integer> listStream = Lists.newArrayList();
        int num = 10000;
        long startTime = System.currentTimeMillis();
        log.info("list开始处理");
        for (int i = 0; i < num; i++) {
          /*  try {
                TimeUnit.MILLISECONDS.sleep(1);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }*/
            listStream.add(i);
        }
        log.info("list处理完毕+"+(System.currentTimeMillis() - startTime)+"ms");
        startTime = System.currentTimeMillis();
        listStream.stream().filter(Objects::nonNull).forEach(a -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });
        log.info("stream耗时:{}ms", (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        listStream.parallelStream().filter(Objects::nonNull).forEach(a -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });
        log.info("parallelStream耗时:{}ms", (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        for (int nums : listStream) {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        log.info("foreach耗时:{}ms", (System.currentTimeMillis() - startTime));
    }

    @Test
    public void testConcat(){
        UserConcat user = new UserConcat();
        user.setKeyWord("测试");
        user.setCode("hha ");
        user.setPROVINCE("ceh8ngshi");
        log.info(user.getKeyWord());
    }

    @Test
    public void testLock(){

    }

    private void lock(String key){
        Lock lock = new ReentrantLock();
        try {
            Thread.sleep(2000);
            lock.lock();
        }catch (Exception ex){

        }finally {
            lock.unlock();
        }
    }

    @Test
    public void test(){
        for(int i = 1 ; i<10 ;i ++){
            if (i % 2 == 0) {
                log.info("结果:{}", i);
                continue;
            }
            log.info("this is result:{}", i);
        }
    }
}

