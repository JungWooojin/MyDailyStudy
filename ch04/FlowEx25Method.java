package com.green.java.ch04;

import java.util.Scanner;

//
//}
public class FlowEx25Method {
    public static void main(String[] args) {
        // 각자리수 더하기 1+2+3+4+5 12345

        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. (예12345) > ");
        String temp = scan.nextLine();
        int sum = sumStringNumber(temp);
        System.out.printf("각 자리수의 합 : %d\n" , sum);
//        num = Integer.parseInt(temp);
//
    }
 public static int sumStringNumber(String str) { //매개변수 1개 >> temp값 밖에 없으므로 ㅇㅇ 2개면 (temp, 2)
     int val = Integer.parseInt(str);
     int sum = 0;
     while (val > 0) {
         sum += val % 10;
         val /= 10;
     }
     return sum;
 }


 }

