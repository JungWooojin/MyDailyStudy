package com.green.java.blackjack;

public class Card {
    private String PATTERN; //무늬
    private String DENOMINAUTION; //점수
    public Card(String PATTERN, String denomination) {
        this.PATTERN = PATTERN;
        this.DENOMINAUTION = denomination;
    }
    public String getPattern() {
        return PATTERN;
    }
    public String getDenomination() {
        return DENOMINAUTION;
    }
}













