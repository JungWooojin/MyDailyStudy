package com.green.java.ch07;

public class Child extends Parent{
    int age;

   public Child(){
   }
   public Child(int age){
        super();
        super.age=age;
        System.out.println("-- Child int age 생성자 --");
    }
    public int getsuperage(){
       return super.age;
    }
    public int getthisage(){
        return this.age;
    }
    void play(){
    System.out.printf("%d살인 아이가 논다",age);
    }
}
