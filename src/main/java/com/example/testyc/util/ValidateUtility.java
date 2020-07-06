package com.example.testyc.util;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;

/**
 * @author zcw
 * @date 2018-08-25
 * @description JSR javaBean校验
 */
public class ValidateUtility {
    public static void judgeValidate(BindingResult result) {
        if(result.hasErrors()){
            List<ObjectError> list = result.getAllErrors();
            StringBuilder stringBuilder = new StringBuilder();
           /* for(ObjectError  error:list){
                stringBuilder.append("\n"+error.getDefaultMessage()+"\n");
            }*/
            list.forEach(ObjectError -> stringBuilder.append(ObjectError.getDefaultMessage()+"\n "));
            throw new RuntimeException(stringBuilder.toString());
        }
    }

}
