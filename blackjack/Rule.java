package com.green.java.blackjack;

import java.util.List;

public class Rule {
    public int getScore(List<Card> c) {
        int sum=0;
//        for(Card b: )
//            sum+=getDenominationToNum();
        return sum;

    }

    public int getDenominationToNum(Card c){
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
