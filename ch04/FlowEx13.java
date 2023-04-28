package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx13 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("sum: %d, i: %d\n", sum, i);
            sum += i;
        }
        System.out.println("total - sum : " + sum);
    }
}