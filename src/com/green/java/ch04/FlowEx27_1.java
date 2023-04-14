package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx27_1 {
    public static void main(String[] args) {
    int num= 0;
    int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0)");


        while(true){
            num = scan.nextInt();
            sum +=num;
                if (num!=0){
                    System.out.printf(">>%d\n",sum);
                }else break;
        }
        System.out.println("합계: "+sum);
    }
}
