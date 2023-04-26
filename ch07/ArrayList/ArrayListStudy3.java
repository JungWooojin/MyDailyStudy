package com.green.java.ch07.ArrayList;

import java.util.ArrayList;

public class ArrayListStudy3 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1,100); // 1번자리에 100을 넣겠다.
        list.add(0,300); // 1번자리에 100을 넣겠다.
        System.out.println(list);

        int removeValue= list.remove(4);// 4번째방값을 지우기도하고 값을 리턴하기도한다
        System.out.println("removeValue : "+removeValue);

        System.out.println(list);
    }
}
