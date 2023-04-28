package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        String squre = "squre";
        String squreRoot = "squre root";
        String squreLog = "log";

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.printf("(1) %s \n(2) %s\n(3) %s\n", squre, squreRoot, squreLog);
            System.out.print("원하는 메뉴 (1~3)를 선택하세요. (종료: 0 ) > ");
            int list = scan.nextInt();
            if (list == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (list >= 1 && list <= 3) {
                System.out.printf("선택하신 메뉴는 %d번 입니다.\n", list);
            } else {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료: 0)");
            }
        }


    }
}