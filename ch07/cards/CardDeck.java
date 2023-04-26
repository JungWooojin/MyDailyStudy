package com.green.java.ch07.cards;

import static com.green.java.ch07.cards.Card.KINDS;
import static com.green.java.ch07.cards.Card.NUM_MAX;

public class CardDeck {
    Card[] cards;
    int idx;
    CardDeck() {
        cards = new Card[52];
//                for (int i = 0; i < 52; i++) {
//                cards[i]= new Card("","");
//}
        int idx = 0;

        for (int i = 0; i < KINDS.length; i++) {
            for (int j = 0; j < NUM_MAX; j++) {
                String num = null;
                switch (j) {
                    case 0:
                        num = "A";
                        break;
                    case 10:
                        num = "J";
                        break;
                    case 11:
                        num = "Q";
                        break;
                    case 12:
                        num = "K";
                        break;
                    default:
                        num = String.valueOf(j);
                }
                cards[idx++] = new Card(Card.KINDS[i], num);
            }
        }

    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int[] Cards;
            int rIdx = (int) (Math.random() * cards.length);
          // if(i == rIdx){continue;} 상황마다 다름
            Card temp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = temp;
        }

    }

    void openCards() {
        for (Card c : cards) {
            System.out.println(c.kind + ", " + c.num);
        }
    }

    Card pick() {
        if(idx == cards.length){return null;} //카드가 52장을 모두 다 사용했을때 null값을 반환해주어라! 원리는 53넘으면 안되니까 ㅇㅇ
        Card c = cards[idx];
        cards[idx] = null;
        idx++;
        return c;//지역변수
    }
}

