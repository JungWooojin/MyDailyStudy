package com.green.java.ch07;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        b.buy(new Tv3());
        b.buy(new Computer3());
        b.buy(new Audio3());
        b.buy(new Audio3());
        b.summary();

        //b.printState();


    }
}
class  Buyer3{
    private int money;
    private int bonusPoint;
    private Product3[] items;
    private int idx;
    Buyer3(){
        this.money = 1000;
        this.bonusPoint = 0;
        this.items=new Product3[10];
        this.idx=0;
    }
    public void buy(Product3 p){
        items[idx++] = p;// items[0]=주소값; 따라서 아이템즈 타입에 맞춤으로 들어가야 하므로 Product3타입의 객체주소값인 p를 주면 입력한대로 순서대로 저장된다.
        money-=p.getPrice();
        bonusPoint +=p.getBonusPoint();
        System.out.printf("%s를 %d만원에 구매하였습니다.\n",p.toString(),p.price);
    }
    public void printState(){
        System.out.printf("나의 남은 돈은 %d만원입니다.보너스 점수는 %d점입니다.",money,bonusPoint);
    }
    public void summary(){
        System.out.print("구입하신 제품은");
//        for (int i = 0; i < idx; i++) {
//            if(i!= 0){
//                System.out.print(" ");
//            }
//            System.out.print(items[i]);
//        }
//        System.out.printf("이고 총 %d개 입니다.",idx);
//    }

    if(idx>0){
        System.out.printf("%s ",items[0]);
        for (int i = 1; i <idx ; i++) {
            System.out.printf(", %s",items[i]);
        }
        System.out.printf("이고 총 %d개입니다.",idx);
    }
    }

}
class Product3 {
    protected int price;
    protected int bonusPoint;

    Product3(int price){
        this.price=price;
        this.bonusPoint=(int)(price*0.1);

    }

    public int getPrice() {
        return price;
    }
    public int getBonusPoint(){
        return bonusPoint;
    }
}


class Computer3 extends Product3{
    public Computer3(){
        super(200);
    }
    public String toString(){
        return "Computer";
    } // 오브젝트 ToString 을 오버라이딩한거


}

class Tv3 extends Product3{
    public Tv3(){
        super(100);
    }

    @Override
    public String toString(){
        return "Tv";

    }
}

class Audio3 extends Product3{
    public Audio3(){super(50);}

    @Override
    public String toString(){
        return "Audio";
    }
}