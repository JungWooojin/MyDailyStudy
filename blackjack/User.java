package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private static List<Card> cardList;

    public User(){
        cardList=new ArrayList<>();
    }
    public void receiveCard(Card c){
        cardList.add(c);
    }

    public List<Card> openCards() {
        return cardList;
    }
    protected static int getPointSum(){
//        int sum = 0;
//        for(Card c : cardList) {
//            sum += getDenominationToNum(c);
//        }
        return Rule.getScore(cardList); //sum;
    }

    public void showCards(){
        /*
        [현재 보유 카드 목록 ]
        Card { ♠, 10}
        Card { ♠, 5}
        Card { ♠, 2}
         */
        System.out.println("현재 보유 카드 목록");
        for(Card c:cardList){
            System.out.println(c);
        }
    }



    private int getDenominationToNum(Card c){
        switch (c.getDenomination()){
            case "A":return 1;
            case "J":
            case "Q":
            case "K":
                return 10;
            default:
                return Integer.parseInt(c.getDenomination());
        }
    }

}
