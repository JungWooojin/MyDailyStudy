package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz12 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int temp = 0;
//                11, 14, 2, 7, 36, 35
//                14, 11, 2, 7, 36, 35 [1]
//                14, 36, 2, 7, 11, 35 [4]
//                14, 36, 11, 7, 2, 35 [4]
//                7, 36, 11, 14, 2, 35 [0]
//                7, 36, 11, 2, 14, 35 [3]
//                7, 35, 11, 2, 14, 36 [1]

        System.out.print("랜덤 인덱스 ");
        for (int i = 0; i < numArr.length; i++) {   //0~5(인덱스 번호) //6개
            int random = (int) (Math.random() * numArr.length);
            temp = numArr[random];
            numArr[random] = numArr[i];
            numArr[i] = temp;
            System.out.print("[" + random + "] ");
        }
        System.out.print("\n");

        System.out.println(Arrays.toString(numArr));
    }
}
