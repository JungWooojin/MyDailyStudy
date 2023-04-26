package com.green.java.ch07.cards;

import com.green.java.ch06.Car;

public class Card {
    static final String[] KINDS ={"CLOVER","HEART","DIAMOND","SPADE"};//카드 무늬의 수
    static final int NUM_MAX =13;

    String kind; //무늬
    String num; //번호

    //외부에서 무늬와 번호 값을 받아서 나의 멤버필드 무늬와 번호에 대입하는 생성자 만들어주세요.
    Card(String kind, String num){
        this.kind=kind;
        this.num=num;
    }

    @Override
    public String toString(){
        return "kind: "+ kind + ", num: "+num;
    }
}
