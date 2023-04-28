package com.green.java.ch03;

public class OperatorEx24 {
    public static void main(String[] args) {
        // && and 연산자
        // || or 연산자
        // (2 > 1) && (3 > 2)       =   T
        //    T          T
        // (2 > 1) && (3 > 2) && (3 >= 5)       =   F
        //    T          T          F

        // (2 > 1) || (3 > 2) || (3 >= 5)       =   T
        //    T          T          F

        boolean r1 = (2 > 1) && (3 > 2);
        System.out.printf("r1 : %b\n", r1);

        boolean r2 = (2 > 1) && (3 > 2) && (3 >= 5);
        System.out.printf("r2 : %b\n", r2);

        boolean r3 = (2 > 1) || (3 > 2) || (3 >= 5) ;
        System.out.printf("r3 : %b\n", r3);

        //  &&연산자는 F가 날만한 것을 맨 앞에 두는 것이 좋다.
        //  ||연산자는 T가 날만한 것을 맨 앞에 두는 것이 좋다.
        //  (뒤의 식을 확인 안해도 결과를 알 수 있기 때문이다.)
    }
}