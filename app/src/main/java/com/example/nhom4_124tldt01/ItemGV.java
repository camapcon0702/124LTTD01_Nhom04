package com.example.nhom4_124tldt01;

public class ItemGV {
    private int id;
    private String name;
    private String msv;

    public ItemGV(int id, String name, String msv) {
        this.id = id;
        this.name = name;
        this.msv = msv;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }
}
