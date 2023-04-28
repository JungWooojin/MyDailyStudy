package com.green.java.ch03;

public class OperatorEx32 {             //삼항식
    public static void main(String[] args) {
        int x = 10, y = -5, z = 0;
        int absX, absY, absZ;

        absX = x >= 0 ? x : -x;         //T
        //1   //2  //3
        System.out.println(absX);

        absY = y >= 0 ? y : -y;         //F
        System.out.println(absY);

        absZ = z >= 0 ? z : -z;         //T
        System.out.println(absZ);
    }
}
