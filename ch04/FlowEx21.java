package com.green.java.ch04;

public class FlowEx21 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i==j) {
                    System.out.printf("[%d, %d] ",i,j);
                }
                else {
                    System.out.printf("         ",i,j);
                }
            }
            System.out.println();
        }
    }
}