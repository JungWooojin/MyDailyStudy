package com.green.java.ch03;

public class OperatorStudy7 {
    public static void main(String[] args) {
//        미만, 초과 <>
//        이하, 이상 <=, >=

        System.out.println("2 < 2 : " + (2 < 2));//f
        System.out.println("1 < 2 : " + (1 < 2));//t
        System.out.println("2 <= 2 : " + (2 <= 2));//t
        System.out.println("1 <= 2 : " + (2 <= 2));//t
        System.out.println("2 > 2 : " + (2 > 2));//f
        System.out.println("2 >= 2 : " + (2 >= 2));//t
        System.out.println("2 == 2 : " + (2 == 2));//t
        System.out.println("2 == 3 : " + (2 == 3));//f
        System.out.println("2 != 3 : " + (2 != 3));   //t      //boolean
        System.out.println("2 != 2 : " + (2 != 2));//f
        System.out.println("!(2 != 2) : " + !(2 != 2));//t
    }
}
