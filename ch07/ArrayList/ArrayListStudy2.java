package com.green.java.ch07.ArrayList;

import java.util.ArrayList;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        int a =10;
        Integer a2 = a;


        double d =10.2;
        double d2 =d;
        //generic 제네릭
        ArrayList<Integer> list=new ArrayList<>();
        //list.add("11"); //모든방이 인트형
        list.add(10);
        list.add(13);

        int n1 = list.get(0);
        System.out.println(list); //Tostring이 오버라이딩 되어 있음



    }
}
