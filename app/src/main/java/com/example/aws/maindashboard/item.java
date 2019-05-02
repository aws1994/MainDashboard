package com.example.aws.maindashboard;

public class item {

    private int icon;
    private int code;
    private String name;

    public item(int icon, int code, String name) {
        this.icon = icon;
        this.code = code;
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
