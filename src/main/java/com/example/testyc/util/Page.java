package com.example.testyc.util;

public class Page {
    private int pageNum;
    private int length;
    private int begin;
    private int end;
    private int total;
    private int pages;
    private String orderBy;
    private String asc;

    private void calculateStartAndEndRow() {
        this.begin = this.pageNum > 0 ? (this.pageNum - 1) * this.length : 0;
        this.end = this.begin + this.length * (this.pageNum > 0 ? 1 : 0);
    }

    public Page(int pageNum, int length, int total) {
        this.pageNum = pageNum;
        this.length = length;
        this.total = total;
        this.calculateStartAndEndRow();
    }

    public Page(int pageNum, int length) {
        this.pageNum = pageNum;
        this.length = length;
        this.total = 0;
        this.calculateStartAndEndRow();
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBegin() {
        return this.begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return this.end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
        if (this.length > 0) {
            this.pages = total / this.length + (total % this.length == 0 ? 0 : 1);
        } else {
            this.pages = 0;
        }

    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getAsc() {
        return this.asc;
    }

    public void setAsc(String asc) {
        this.asc = asc;
    }
}
