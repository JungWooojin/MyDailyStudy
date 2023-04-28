package com.green.java.ch04;

public class ForQuiz4 {
    public static void main(String[] args) {
        int star = 5;

        for (int i = 1; i <= star; i++) {
            for (int j = 0; j < star - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------");

        for (int i = 1; i <= star; i++) {
            for (int j = star; j >= 1; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}