package com.green.java.ch07.Poly;
//p354, 다형성, 상속관계에서만 의미 있음
public class Poly {

        /*
          1. 부모타입은 자식 객체 주소값 저장할 수 있다.
          2. 자식타입은 부모 객체 주소값 저장할 수 없다.
          3. 타입은 (알고 있는 메소드만 호출할 수 있음)
          메소드를 호출할 수 있나없나만 결정
          >> 실제로 실행되는 건 객체 기준이다.
         */
        public static void main(String[] args) {
            Animal ani1 = new Dog();//1번 상속관계일때만 타입이 달라도 저장할수 있다.
            ani1.crying();
            //ani1.jump(); Animal클래스에는 jump메서드가없다
            //Dog dog1= new Animal(); 2번
            Dog dog1 =(Dog) ani1;// 불독으로 했을땐 2번을 위배하기 때문에 오류가 뜨고 도그로 했을땐 자기자신이라 가능함
            dog1.crying();
            dog1.jump();


        }
}
