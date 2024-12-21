package com.example.nhom4_124tldt01.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("firstName")
    @Expose
    private String ten;
    @SerializedName("lastName")
    @Expose
    private String lop;
    @SerializedName("email")
    @Expose
    private String masv;

    @SerializedName("listUserExamSet")
    @Expose
    private Object listUserExamSet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Object getListUserExamSet() {
        return listUserExamSet;
    }

    public void setListUserExamSet(Object listUserExamSet) {
        this.listUserExamSet = listUserExamSet;
    }
}
