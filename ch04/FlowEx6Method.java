package com.green.java.ch04;

import java.util.Scanner;

//345 봄 678여름 91011가을 12 1 2 겨울
//이외의값은 null리턴 return null;

 class  SeasonObj{
     String getSeason(int mon){
         switch (mon) {
             case 3:case 4:case 5:
                 return "봄";
             case 6:case 7:case 8:
                 return  "여름";
             case 9:case 10:case 11:
                 return  "가을";
             case 12:case 1:case 2:
                 return  "겨울";
         }
         return null;
     }
 }
public class FlowEx6Method {
    public static void main(String[] args) {
        System.out.println("현재 월을 입력하세요. (1~12)");
        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();
        SeasonObj so = new SeasonObj();
        String result = so.getSeason(mon);
        if(result==null){
            System.out.println("잘못된 입력입니다.");
            return;
        }
        System.out.printf("현재의 계절은 %s입니다.",result);
    }
}