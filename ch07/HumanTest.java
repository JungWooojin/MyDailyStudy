package com.green.java.ch07;
/*
 private 멤버필드에 값을 대입하고 추출.
    <값 주입>
 1.생성자를 통해 값을 넣어줄수있다 .
 2. setter을 통해 값을 넣어줄수있다. 빼면 상수가 되어버린다

    <값 추출>
 1.getter 메소드 통해서 빼줄수없다
 */
public class HumanTest {
    public static void main(String[] args) {
        Human h1 = new Human("홍길동",24,"개발자");//생성자를 통해 값을넣었따ㅏ
        h1.setName("신사임당");
        h1.setAge(26);
        h1.setJob("개발자");

        String name =h1.getName();
        int age = h1.getAge();
        String job = h1.getJob();

        System.out.printf("이름: %s, 나이: %d 직업: %s\n",name,age,job);
    }
}
