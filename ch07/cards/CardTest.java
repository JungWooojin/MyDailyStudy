package com.green.java.ch07.cards;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.openCards();
        System.out.println("----");
        cd.shuffle();
        cd.openCards();
        System.out.println("----");
        Card c1 = cd.pick();
        System.out.println(c1.kind + ", "+ c1.num);
        Card c2 = cd.pick();
        System.out.println(c2.kind + ", "+ c2.num);
        cd.openCards();
        Card c3 = cd.pick();
        System.out.println(c2.kind + ", "+ c3.num);

    }


}
