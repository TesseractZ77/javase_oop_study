package com.oop.demo02;

public class Person {


    String name;

    //实例化初始值
    //1。使用new关键字必须要有构造器
    //本质是在调用构造器
    //用来初始化值
    public Person(){
        //无参构造
    }

    //有参构造
    //有参构造一旦定义，无参必须显示定义
    public Person(String name){
        this.name = name;
    }

    //alt + insert自动生成构造器


}

/*
 //实例化了一个对象
        Person person = new Person("Zoe");
        System.out.println(person.name);
 */
