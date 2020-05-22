package com.example.testyc.persistence.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UsersCopy {
    private double code;

    private int name;

    private Integer age;

    private BigDecimal PROVINCE;

    private int CITY;
}
