package com.green.java.ch08;

public class TryCatchStudy1 {
    public static void main(String[] args) {

        try {
            int r1 =10/0;
            System.out.println("다음줄");
            //예외가 발생될 가능성이 있는 로직(source)위치
        }catch (Exception e){
            //예외가 발생되었을 때 하고 싶은 작업(로직)을 위치
            //예외상황을 잡음
            e.printStackTrace();
            System.out.println("예외발생");
        }finally {
            System.out.println("파이널리");
            //옵션,예외가 발생이 되든 안되든 무조건 실행하고 싶은 로직 위치
        }
        System.out.println("끝!");
    }
}
