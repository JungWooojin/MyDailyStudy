package com.green.java.ch04;


public class FlowEx13Method {
    public static void main(String[] args) {






        //1~100사이의 값을 전부 더하고 출력
        //min값 ~ max값 sum= 값
        printAllSum(1,2);
        //1 ~ 100 sum =5050
    }




    public static void  printAllSum(int min, int max){
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }


        System.out.printf("min: %d ~ max: %d sum=%d",min,max,sum);
    }
}