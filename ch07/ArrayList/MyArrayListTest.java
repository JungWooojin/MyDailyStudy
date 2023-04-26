package com.green.java.ch07.ArrayList;

import java.util.ArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
//        System.out.println(myList);

        myList.add(2,100);
        System.out.println(myList);
        //[10,20,30]


    }
}
