package com.green.java.ch04;

public class ForQuiz6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int z = 2; z <= 9; z++) {
                System.out.printf("%d X %d = %d\t", z, i, z * i);
            }
            System.out.println();
        }
    }
}