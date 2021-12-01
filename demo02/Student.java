package com.oop.demo02;
//学生类
public class Student {
    //属性：字段

    String name;
    int age;
    //抽象概念 不赋值

    public void study(){
        System.out.println(this.name+" is studying.");
    }


}

/*
//类是抽象的 需要实例化

        //实例化后会返回一个自己的对象
        //Student对象就是一个Student类的具体实例

        Student amy = new Student();
        Student aron = new Student();

        amy.name = "Amy";
        amy.age = 5;

        System.out.println(amy.name);
        System.out.println(amy.age);

        aron.name = "Aron";
        aron.age = 8;

        System.out.println(aron.name);
        System.out.println(aron.age);

        amy.study();
 */
