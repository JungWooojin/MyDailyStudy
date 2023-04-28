package com.green.java.ch03;

public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi);

        System.out.println(Math.round(315.4));      // 반올림
        System.out.println(Math.round(315.5));
        System.out.println(Math.ceil(315.1));       // 올림
        System.out.println(Math.floor(315.9));      // 내림
    }
}