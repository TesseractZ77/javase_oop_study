package com.oop.demo10;

public class Outer {

    private  int id = 100;
    public void out(){
        System.out.println("外部类方法");
    }

    public class Inner{
        public void in(){
            System.out.println("内部类方法");
        }

        public void getId(){
            System.out.println(id);
        }
    }
}
