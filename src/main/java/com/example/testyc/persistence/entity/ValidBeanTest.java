package com.example.testyc.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;


@Setter
@Getter
public class ValidBeanTest {

    @NotEmpty(message = "code不能为空")
    private String code;

    @NotEmpty(message = "名称不能为空")
    private String name;

    private Long count;
}
