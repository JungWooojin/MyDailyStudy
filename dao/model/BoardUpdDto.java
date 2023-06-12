package com.green.java.dao.model;

public class BoardUpdDto {
    private String title;
    private String ctnt;
    private int iboard;
    private int iuser;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCtnt() {
        return ctnt;
    }

    public void setCtnt(String ctnt) {
        this.ctnt = ctnt;
    }

    public int getIboard() {
        return iboard;
    }

    public void setIboard(int iboard) {
        this.iboard = iboard;
    }

    public int getIuser() {
        return iuser;
    }

    public void setIuser(int iuser) {
        this.iuser = iuser;
    }
}
