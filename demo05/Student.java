package com.oop.demo05;

public class Student extends Person{

    public Student() {
        System.out.println("student无参构造执行");
    }

    private String name = "zhewang";

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public void print(){
        System.out.println("student111");
    }

    public void test1(){
        print();
        this.print();
        super.print();
    }

}
