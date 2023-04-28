package com.green.java.ch04;

import java.util.Scanner;


class ScoreObj2 {
    String getGrade(int score) {
        if (score > 100 || score < 0) {
            System.out.println("점수는 0~100점 사이입니다.");
        }else if(score<70){
            return "D";
        }
        String grade= "C";

        if(score==100){
            return "A+";
        }
        else if(score>=90){
            grade ="A";
        } else if (score>=80) {
            grade ="B";
        }
        int num =score %10;

        if(num>=8||score ==100){
            grade +="+";
        } else if (num<4) {
            grade+= "-";

        }else {
            grade+="0";
        }
        return String.format("%d점의 학점은 %s입니다.",score,grade);
    }
}
