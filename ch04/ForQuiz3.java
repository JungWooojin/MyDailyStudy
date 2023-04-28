package com.green.java.ch04;

public class ForQuiz3 {
    public static void main(String[] args) {
        int star = 5;

        for (int i = 1; i <= star; i++) {
            for (int z = 1; z <= star; z++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
