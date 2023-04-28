package com.green.java.ch03;

import java.util.Scanner;

public class OperatorStudy8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력:");
        int num = scan.nextInt();
        System.out.println("num : " + num);

        System.out.println(num % 2 == 0 ? "짝수" : "홀수");     //삼항연산자의 T,F시의 값은 서로 타입이 같아야 한다.
        //num값이 홀수면 "홀수"
        //num값이 짝수면 "짝수"
    }
}
