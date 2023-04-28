package com.green.java.ch04;

import java.util.Scanner;

public class IfStudy3 {                               //스트링 비교는 .equals
    public static void main(String[] args) {
        final int WOMAN_HEIGHT_STAND = 158;
        final int MAN_HEIGHT_STAND = 171;

        Scanner scan = new Scanner(System.in);
        System.out.println("성별 입력 (w, m): ");
        String gender = scan.nextLine();

        System.out.print("키 입력 (cm):");
        int height = scan.nextInt();

        if (gender.equals("m")) {
            if (height == MAN_HEIGHT_STAND) {
                System.out.println("평균");
            } else if (height > MAN_HEIGHT_STAND) {
                System.out.println("평균 초과");
            } else if (height <= MAN_HEIGHT_STAND) {
                System.out.println("평균 미만");
            }
        } else if (gender.equals("w")) {
            if (height == WOMAN_HEIGHT_STAND) {
                System.out.println("평균");
            } else if (height > WOMAN_HEIGHT_STAND) {
                System.out.println("평균 초과");
            } else if (height <= WOMAN_HEIGHT_STAND) {
                System.out.println("평균 미만");
            }
        }
    }
}
