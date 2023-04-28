package com.green.java.ch04;

public class BreakContinueStudy {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");

            if (i == 5) {
                System.out.printf("\n5에서 끝!");
                break;
            }
        }
        System.out.println("----------------------");
        for (int i = 0; i < 10; i++) {  //continue시 중지, i++하고 처음부터 루프
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}


