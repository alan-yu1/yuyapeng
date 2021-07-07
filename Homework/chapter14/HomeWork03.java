package chapter14;

import java.util.*;

public class HomeWork03 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack", 650);
        m.put("tome", 1200);
        m.put("smith", 2900);
        System.out.println(m);
        m.put("jack", 2600);
        Set set = m.keySet();
        for (Object key : set) {
            m.put(key, (Integer)m.get(key) + 100);
        }
        System.out.println(m);
        for (Object key : m.keySet()) {
            System.out.println("Key = " + key);
        }
        for (Object value : m.values()) {
            System.out.println("Value = " + value);
        }

    }
}
