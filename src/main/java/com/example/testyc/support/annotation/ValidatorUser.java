package com.example.testyc.support.annotation;

import com.example.testyc.persistence.entity.Vuser;
import com.example.testyc.util.ValidateUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = { ValidatorUser.StringChecker.class})
public @interface ValidatorUser {

    boolean require() default true;

    String message() default "用户信息必填";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    class StringChecker implements ConstraintValidator<ValidatorUser, Vuser>{

        boolean require = false;
        private Logger logger = LoggerFactory.getLogger(StringChecker.class);
        @Override
        public void initialize(ValidatorUser constraintAnnotation) {
            logger.info("这里是验证");
            require = constraintAnnotation.require();
        }

        @Override
        public boolean isValid(Vuser s, ConstraintValidatorContext constraintValidatorContext) {
            logger.info("进入StringChecker方法" + s);
            if(require){
                logger.info("进入领克");
                String pwd1 = s.getPwdA();
                String pwd2 = s.getPwdB();
                return pwd1.equals(pwd2);
            }
            return false;
        }


    }
}
