package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx5_1 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.println("점수를 입력하세요 >");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        if (score > 100 || score < 0) {
            System.out.println("점수는 0~100점 사이입니다.");
        }

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        int num = score % 10;
        if (grade != 'D') {
            if (num >= 8 || score == 100) {
                opt = '+';
            } else if (num < 4) {
                opt = '-';
            } else {
                opt = '0';
            }
        }

        if (grade != 'D') {
            System.out.printf("%d점의 학점은 %c%c입니다.", score, grade, opt);
        } else {
            System.out.printf("%d점의 학점은 %c입니다.", score, grade);
        }
    }
}