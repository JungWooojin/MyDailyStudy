package com.green.java.ch07.ArrayList;

import java.util.ArrayList;

public class ArrayListStudy1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();//정해준타입이 없으면 오브젝트타입이라 아무값이나 주입할수있다
        list.add(10);//0번방
        list.add(20);//1번방
        list.add("ddd");

        Object obj =10;

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));


        int n1 = (int)list.get(0);
        int n2 = (int)list.get(1);
        String str1 = (String) list.get(2);// 나중에 뺄때 형변환을 잘해줘야해서 사용하지 않음 복잡해짐
    }
}
