package com.green.java.ch07.abstract2;

public class Fighter implements Fightable{

    void jump(){
        System.out.println("점프");
    }
    @Override
    public void sum(int x, int y) {
        System.out.println((x+y));
    }

    @Override
    public void move(int x, int y) {
        System.out.printf("%d%d\n",x,y);
    }
}

class Fighter2 implements Fightable{

    @Override
    public void sum(int x, int y) {
        System.out.println((x+y));
    }

    @Override
    public void move(int x, int y) {
        System.out.printf("%d%d\n",x,y);
    }
}