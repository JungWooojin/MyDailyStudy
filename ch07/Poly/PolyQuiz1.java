package com.green.java.ch07.Poly;

public class PolyQuiz1 {
    public static void main(String[] args) {
        Dog dog1 =new Dog();
        Dog dog2 =new Dog("뽀삐");
        Bulldog bd1 =new Bulldog();
        Cat cat1 = new Cat();
        Duck duck1 = new Duck();

        animalCryingCall(dog1);
        animalCryingCall(bd1);
        animalCryingCall(cat1);
        animalCryingCall(duck1);

    }
    public static void animalCryingCall(Animal name){
        name.crying();
        if (name instanceof Dog){
            ((Dog) name).jump();
        }

    }


}
