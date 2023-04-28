package com.green.java.ch04;

import java.util.Scanner;

public class WhileQuiz1 {
    public static void main(String[] args) {
        int input, answer;

        Scanner scan = new Scanner(System.in);
        answer = (int) (Math.random() * 100) + 1;

        System.out.print("1 ~ 100 사이의 정수를 입력 : ");
        input = scan.nextInt();

        while (input != answer) {
            if (input > answer) {
                System.out.println("down");
            } else {
                System.out.println("up");
            }
            System.out.print("1 ~ 100 사이의 정수를 입력 : ");
            input = scan.nextInt();
        }
        System.out.println("good!");
    }
}
