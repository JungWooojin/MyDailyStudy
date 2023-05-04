package com.green.java.blackjack;

import java.util.List;

public class Rule {
    public static int getScore(List<Card> cardList) {
        int sum = 0;
        for(Card c : cardList) {
            sum += getDenominationToNum(c);
        }
        return sum;
    }




    private static int getDenominationToNum(Card c){
        switch (c.getDenomination()){
            case "A":return 1;
            case "J":
            case "Q":
            case "K":
                return 10;
            default:
                return Integer.parseInt(c.getDenomination());
        }
    }}
//    public static void whoIsWin(Gamer gamer,Dealer dealer){
////        int gpoint =gamer.getPointSum();
////        int dpoint =dealer.getPointSum();
////        if (gpoint <=21 && gpoint>dpoint||gpoint<=21&&dpoint>21){
////            System.out.println("게이머승리");} else if ((dpoint <=21 && dpoint>gpoint||dpoint<=21&&gpoint>21){
////            System.out.println("딜러승리");}
//        }
//
//    }
