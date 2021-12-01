package com.oop.demo04;
// 类 private: 私有
public class Student {
    //属性私有
    //name
    private String name;

    //stuid
    private int id;

    //gender
    private char gender;

    private int age;

    //提供一些可以操作这个属性的方法
    //提供一些public的get set方法
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0){
            this.age = 3;
            System.out.println("invalid age!");
        }else {
            this.age = age;
        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
