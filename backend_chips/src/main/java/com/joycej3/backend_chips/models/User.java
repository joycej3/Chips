package com.joycej3.backend_chips.models;

public class User {
    private String name;
    private int money;

    User(){}
    User(String name, int money){
        this.name = name;
        this.money = money;
    }

//    Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
}
