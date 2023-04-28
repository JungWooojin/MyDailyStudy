package com.green.java.ch04;

import java.util.Scanner;

class ScoreObj{
    int score = 0;
    char grade = ' ';
    char getGrade(int score) {
        if (score >= 90) {
            return  'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return  'C';
        }
        return 'D';
    }
}
public class FlowEx4Method {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.println("점수를 입력하세요 >");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        ScoreObj so =new ScoreObj();
        grade = so.getGrade(score);

        System.out.printf("%d점의 학점은 %c입니다.", score, grade);
    }
}

