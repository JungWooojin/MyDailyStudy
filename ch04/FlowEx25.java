package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. (예12345) > ");
        String temp = scan.nextLine();
        num = Integer.parseInt(temp);

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("각 자리수의 합 : " + sum);
    }
}
