package chapter14;

import java.util.*;

public class HomeWork05 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Person());
        System.out.println(treeSet);
    }
}
class Person implements Comparable{
    private String name = "刘云栋";

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
