package com.green.java.ch04;

import java.util.Scanner;

public class WhileStudy3 {
    public static void main(String[] args) {
        int input, answer;
        Scanner scan = new Scanner(System.in);
        answer = (int) (Math.random() * 100) + 1;
        System.out.println(answer);

        while (true) {
            System.out.print("1~100 :");
            input = scan.nextInt();

            if (input == answer) {
                break;
            }
            if (input > answer) {
                System.out.println("down");
            } else if (input < answer) {
                System.out.println("up");
            }
        }
        System.out.println("good");
    }
}
