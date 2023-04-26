package com.green.java.ch07;

public class ModifierTest {
    private int num1; //클래스를 벗어나면 사용불가능 내부안에서만 사용가능
    int num2;
    protected int num3;
    public int num4;

    public void printNum1() {
        System.out.println(num1);
    }
}
