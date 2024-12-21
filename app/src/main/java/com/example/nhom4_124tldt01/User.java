package com.example.nhom4_124tldt01;

public class User {
    private int id;
    private String ten;
    private String lop;
    private String masv;

    public User() {
    }

    public User(int id, String ten, String lop, String masv) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.masv = masv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", lop='" + lop + '\'' +
                ", masv='" + masv + '\'' +
                '}';
    }
}
