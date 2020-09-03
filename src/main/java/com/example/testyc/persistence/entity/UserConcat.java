package com.example.testyc.persistence.entity;

public class UserConcat {

    private String name;

    private String code;

    private String PROVINCE;

    private String keyWord;

    public String getKeyWord(){
        return keyWord.concat("123".equals(name) ? name : "10" ).concat(code).concat(getPROVINCE());
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPROVINCE() {
        return PROVINCE;
    }

    public void setPROVINCE(String PROVINCE) {
        this.PROVINCE = PROVINCE;
    }
}
