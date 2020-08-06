package com.example.testyc.persistence.vo;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReturnResult<T> {

    private String status;

    private String message;

    private T obj;

    public ReturnResult<T> SUCCESS(String message) {
        this.setStatus("1");
        this.setMessage(message);
        return this;
    }

    public ReturnResult<T> FAIL(String message) {
        this.setStatus("0");
        this.setMessage(message);
        return this;
    }
}
