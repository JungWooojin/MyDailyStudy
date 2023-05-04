package com.green.java.blackjack;

import java.util.List;
import java.util.Scanner;

public class BlackjackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();

//        Card c =cd.getCard();
//        gamer.receiveCard(c);
        Card c1 = cd.getCard();
        System.out.println(c1);
        //Card{♥,K}
        System.out.println("--------");

        for (int i = 0; i < 2; i++) {
            gamer.receiveCard(cd.getCard());
            dealer.receiveCard(cd.getCard());
        }

        if (dealer.isReceieveCard()) {
            dealer.receiveCard(cd.getCard());
        }
        gamer.showCards();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (true) {
            System.out.print("Card More?(y/n) > ");
            input = sc.nextLine();
            if ("n".equals(input.trim().toLowerCase())) {
                break;
            }
            gamer.receiveCard(cd.getCard());
            gamer.showCards();
        }

        System.out.println("---- 딜러카드 ----");
        dealer.showCards();
//        Rule.whoIsWin(gamer, dealer);
    }


    //Card More ? (y/n) >

//        List<Card> cardList = gamer.openCards();
//        int score = rule.getScore(cardList);
//        int gamerScore =rule.getScore(gamer.openCards());
//        int dealerScore =rule.getScore(dealer.openCards());
}

