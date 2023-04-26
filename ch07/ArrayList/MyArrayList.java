package com.green.java.ch07.ArrayList;

import java.util.ArrayList;

public class MyArrayList {
    private int[] items;

    public MyArrayList() {
        items = new int[0];
        System.out.println(items.length);
    }

    public void add(int value) {
        int[] temp = new int[items.length + 1];// 아이템의 배열의 길이는 예를들어 3이고 그렇게되면 템프배열의 길이는 4가 된다.
        temp[items.length] = value;// 아이템 3의 값이 밸류값이고 템프의 3의 값도 밸류값이다. 4번째칸의 값이 비어있는상태
        for (int i = 0; i < items.length; i++) {//포문의 의미는 템프의 0,1,2의 값을 아이템의 0,1,2, 값으로 채워준다.
            temp[i] = items[i];
        }
        items = temp;// 템프배열와 아이템의 배열이 전체 길이가 다르므로 템프의 4번째 값에 값이 입력이 되었을경우 아이템배열또한 4번째칸을 만들어줌과 동시에 값을 입력해준다.
    }

    public String toString() { //오버라이딩이고 str은 [라는 문자의 뜻이고 이프문은 아이템이 4칸이라고 쳤을때 [ 더하기 아이템 0번의값 , 그리고 더있으면 아이템 1번의값 ,2번의값,을 그대로 붙여서 출력해준다.
        String str = "[";
        if (items.length > 0) {
            str = str + items[0];
            for (int i = 1; i < items.length; i++) {
                str = str + ", " + items[i];
            }
        }
        str += "]";
        return str;
    }


    public void add(int idx, int value) {//idx는 일단 넣어줄 값의 칸 ! 그니까 배열의 idx칸 이라는 뜻이고 밸류값은 값
        if (idx > items.length) {
            return;
        }
        int[] temp = new int[items.length + 1];// 템프의 칸은 일단 item 의 공간보다 1칸 더 늘려준다.
        temp[idx] = value; //idx번째값에 value값을 입력을해준다 나머지칸은 비어있는상태
        for (int i = 0; i < items.length; i++) {// 일단은 지금  idx값에 value값을 넣어준 상태임 그래서 나머지칸을 채워주려고 이걸쓰는거임 ㅇㅇ
            if (i < idx) {//i가 0번째 즉 0번째칸부터 이제 채워줄건데 idx를 1이라치고 0번째칸은 1보다 작으니까 고대로 temp[0]값에 item[0]값으로 채워준다 그리고 올라간다
                temp[i] = items[i];
            } else {// 지금 temp[1]의 값은 밸류값으로 채워진상태이다. i가 1의 값을 가질때 idx 가 1이므로 작지않기때문에 else로 넘어온거고 temp[2]의 값에 item[1]의 값을 대입해준다 나머지도 동일하다
                temp[i + 1] = items[i];
            }
            items = temp;
        }
    }
}
