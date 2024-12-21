package com.example.nhom4_124tldt01;

public class User {
    private int id;
    private int ten;
    private int lop;
    private int masv;

    public User() {
    }

    public User(int id, int ten, int lop, int masv) {
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

    public int getTen() {
        return ten;
    }

    public void setTen(int ten) {
        this.ten = ten;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", ten=" + ten +
                ", lop=" + lop +
                ", masv=" + masv +
                '}';
    }
}
