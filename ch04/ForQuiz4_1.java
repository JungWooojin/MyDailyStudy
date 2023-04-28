package com.green.java.ch04;

public class ForQuiz4_1 {
    public static void main(String[] args) {
        int star = 5;

        for (int i = 1; i <= star; i++) {
            for (int j = star; i < j; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------");

        for (int i = 1; i <= star; i++) {
            for (int j = star; j >= 1; j--) {
                if(i<j) {
                    System.out.print(" ");
                }
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}