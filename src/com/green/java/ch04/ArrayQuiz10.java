package com.green.java.ch05;

import java.util.Arrays;

/*
    numArr 배열을 이용하여
    배열에서 가장 작은숫자를 찾아내여 출력해주세요.

    min:2
 */
public class ArrayQuiz10 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int min = numArr[1];
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] < min) {
                min = numArr[i];
            }
        } System.out.println("min: " + min);
    }
}

