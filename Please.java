package com.green.java.ch07;

public class Please {
    private int[] items;

    public void list2() {
        items = new int[0];
        System.out.println(items.length);
    }

    public void add(int value) {
        int[] temp = new int[items.length + 1];
        temp[items.length] = value;
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }

    public void add(int idx, int value) {
        int[] temp = new int[items.length + 1];
        temp[idx] = value;
        for (int i = 0; i < items.length; i++) {
            if (i < idx) {
                temp[i] = items[i];
            } else
                temp[i + 1] = items[i];
        }
        items = temp;
    }

    public String toString(String str) {
        str = "[";
        if(items.length>0) {
            str = str + items[0];
            for (int i = 1; i < items.length; i++) {
                str = str + ", " + items[i];
            }
        }
        str+="]";
        return str;
    }
}


