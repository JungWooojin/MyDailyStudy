package com.green.java.ch04;

public class FlowEx18Method {
    public static void main(String[] args) {
//        gugudan(5);
        //arguments 아규먼츠,인수값
        /*
        4 x 1 = 4
        ..
        4 x 9 = 36(개행)
         */
        gugudan(2, 8);//단이 바뀌면 개행 한번 더
    }
    public static void gugudan(int sDan, int eDan){//파라미터,매개변수,인자 타입중요
        for (int i = sDan; i<=eDan; i++) {
            gugudan(i);

        }

    }
    public static void gugudan(int a){
        for (int i = 1; i <= 9; i++) {
                System.out.printf("%d x %d = %d\n",a,i,a*i );
            }
        System.out.println();
    }


}