package com.green.java.ch05;

import com.green.java.ch07.cards.Card;

import java.util.Arrays;

public class ArrayQuiz13 {
    public static void main(String[] args) {
        int[] lottoArr = new int[6];
        setRandomValuArr1(lottoArr);


        sortArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));

    }

    public static int getRandomValueFromTo(int sVal, int eVal) {
        return (int) (Math.random() * (eVal - sVal + 1) + sVal);
    }
    public static void sortArr(int[] Arr){
        for (int i =Arr.length-1 ; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    int temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }
        }
    }

    public static void setRandomValueArr2(int[] lottoArr) {
        int i = 0;
        Loop:
        while (i < lottoArr.length) {
            int rVal = getRandomValueFromTo(1, 45);
            for (int z = 0; z < i; z++) {
                if (lottoArr[z] == rVal) {
                    continue Loop;
                }
            }
        lottoArr[i++] = rVal;
    }

}

   public static void setRandomValuArr1(int[] lottoArr){
        for (int i = 0; i <lottoArr.length ; i++) {
          int rVal = getRandomValueFromTo(1, 45);
            for (int j = 0; j < lottoArr.length; j++) {
                if(lottoArr[j]==0){
                    lottoArr[j]=rVal;
                    break;
                }else if(lottoArr[j]==rVal){
                    i--;
                    break;
                }
            }
        }


    }
}
