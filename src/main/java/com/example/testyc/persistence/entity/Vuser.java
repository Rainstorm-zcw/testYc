package com.example.testyc.persistence.entity;

import com.example.testyc.support.annotation.ValidatorUser;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ValidatorUser(require = false)
public class Vuser {

    private String name;

    private String code;

    private Integer age;

    private String pwdA;

    private String pwdB;
}
