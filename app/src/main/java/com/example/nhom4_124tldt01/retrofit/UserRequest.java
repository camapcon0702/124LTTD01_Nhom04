package com.example.nhom4_124tldt01.retrofit;

public class UserRequest {
    private String ten;
    private String lop;
    private String masv;

    public UserRequest() {
    }

    public UserRequest(String ten, String lop, String masv) {
        this.ten = ten;
        this.lop = lop;
        this.masv = masv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }
}
