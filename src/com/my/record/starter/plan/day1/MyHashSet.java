package com.my.record.starter.plan.day1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Stream;

/**
 * @description
 * @author luojiyuan
 * @date 2022-03-10 20:55
 */
public class MyHashSet {

    private static final int BASE = 769;

    private LinkedList[] data;


    public MyHashSet() {
        data = new LinkedList[BASE];
        for (int i = 0; i < BASE; i++) {
            data[i] = new LinkedList<Integer>();
        }
    }

    public void add(int key) {
        int h = hash(key);
        Iterator<Integer> iterator = data[h].iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == h) {
                return;
            }
        }
        data[h].offerLast(key);
    }

    public void remove(int key) {
        int h = hash(key);
        Stream<Integer> stream = data[h].stream();
        stream.peek(value -> {
            if (value == h) {
                data[h].remove(value);
                return;
            }
        });

    }

    public boolean contains(int key) {
        int h = hash(key);
        Stream<Integer> stream = data[h].stream();
        stream.map(value -> {
            if (value == key) {
                return true;
            }
            return false;

        });
        return false;
    }

    private static int hash(int i) {
        return i % BASE;
    }

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();

        //["MyHashSet","add","add","contains","contains","add","contains","remove","contains"]
        //[[],[1],[2],[1],[3],[2],[2],[2],[2]]
        set.add(1);
        set.add(2);
        set.contains(1);
        boolean contains = set.contains(3);
        System.out.println(contains);
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

