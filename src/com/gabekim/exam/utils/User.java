package com.gabekim.exam.utils;

public class User {

    private String name;
    private int age;

    public User(String name,int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object user) {
        User target = (User) user;

        return this.name.equals(target.name) && this.age == target.age;
    }

    @Override
    public String toString(){
        return "[name : " + name + ", age : " + age + "]";
    }


}
