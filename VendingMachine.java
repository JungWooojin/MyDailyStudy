package com.green.java.ch04;

import javax.swing.*;
import java.util.LinkedList;

public class VendingMachine {
    private int money = 0;//정수값 ㅂ유지
    private String[] menuArr = {"콜라", "사이다", "환타", "미란다"};
    private int[] priceArr = {1000, 1500, 2000, 2500};
    private LinkedList<Integer> purchaseList = new LinkedList<>();


    public void insert(int money) {
        this.money += money;// money=money+money 전역변수
    }

    public void showMoney() {
        System.out.printf("현재 잔액은 %,d원입니다.\n", this.money);
    }

    public void showMenus() {
        System.out.print("번호\t메뉴명\t가격\n");
        for (int i = 0; i < priceArr.length; i++) {
            System.out.printf("%d. \t%s \t %,d원\n", i + 1, menuArr[i], priceArr[i]);
        }
    }

    public void purchaseDrink(int num) {
        int idx = num - 1;
        String ddd = menuArr[idx];
        System.out.printf("%s를 구매하였습니다.\n", ddd);
        money -= priceArr[idx];
        System.out.printf("현재 잔액은 %,d원입니다.\n", money);
        purchaseList.add(idx);
    }

    public void showPurchaseList() {
        if (purchaseList.size() == 0) {
            System.out.println("제품을 구매하지 않았습니다.");
        }
        int idx = purchaseList.get(0);
        System.out.print(menuArr[idx]);

        for (int i = 1; i < purchaseList.size(); i++) {
            idx = purchaseList.get(i);
            System.out.printf(", %s", menuArr[idx]);
        }
        System.out.println("을(를) 구매하였습니다.");
    }
}

