package com.green.java.ch03;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j = 0;
        j = i++;    //5복사 i++은 i를 복사한 후에 ++한다.
        System.out.printf("j = i++; 실행 후 i = %d, j = %d\n", i, j);

        int i2 = 5, j2 = 0;
        j2 = ++i2;        //먼저 값을 ++하고 j2에 복사한다.
        System.out.printf("j2 = ++i2; 실행 후 i2 = %d, j2 = %d\n", i2, j2);
    }
}
