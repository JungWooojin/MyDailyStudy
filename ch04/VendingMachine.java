package com.green.java.ch04;

public class VendingMachine {
    private int money = 0;


    public void insert(int money){
        this.money += money;// money=money+money
        System.out.println(this.money);
    }

    public void showMoney(){
        System.out.printf("현재 잔액은 %,d원입니다.\n",this.money);
    }

}
