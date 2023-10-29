package com.集合.List练习.LinkedList;

import java.util.LinkedList;

class suitanglianxi01 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 1; i <= 2; i++) {
            linkedList.add(i);
        }
        linkedList.add(100);
        linkedList.add(100);
        for (Object object : linkedList) {
            System.out.println(object);
        }
        linkedList.remove(1);
        linkedList.remove("kk");
        linkedList.set(2, "kk");
        System.out.println("=====");
        for (Object object : linkedList) {
            System.out.println(object);
        }
        Object object=linkedList.get(0);
        System.out.println("object="+object);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
    }
}
