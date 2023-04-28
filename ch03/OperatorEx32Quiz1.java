package com.green.java.ch03;

public class OperatorEx32Quiz1 {             //삼항식
    public static void main(String[] args) {
        int x = 10, y = -5, z = 0;
        int absX, absY, absZ;
        OperatorEx32Quiz1 n1 = new OperatorEx32Quiz1();
        absX = n1.getAbs(x);
        absY = n1.getAbs(y);
        absZ = n1.getAbs(z);

        System.out.println("absX: "+absX);
        System.out.println("absY: "+absY);
        System.out.println("absZ: "+absZ);
    }

    public int getAbs(int n){
        return n >=0 ? n:-n;
    }
}
