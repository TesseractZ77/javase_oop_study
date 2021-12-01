package com.oop.demo06;

public class Person {
    public void run(){
        System.out.println("run!");
    }
}
//多态是方法的多态，属性么有多态
//父类和子类， 有联系 类型转换异常！ClassCastException!
//存在条件： 继承关系  方法需要重写 父类引用指向子类对象
//Father f1 = new Son();
/*
1.static 方法 属于类 不属于实例
2。 final常量
3. private私有 修饰的方法不能重写
 */