package chapter14;

import java.util.*;

public class HomeWork02 {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<Car>();
        List<Car> list1 = new ArrayList<Car>();
        Car car = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);
        Car car3 = new Car("法拉利", 6000000);
        list.add(car);
        list.add(car2);
        list1.addAll(list);
        System.out.println(list);
        list.remove(0);
        System.out.println(list.contains(car));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        list.addAll(list1);
        list.add(car3);
        System.out.println(list.containsAll(list1));
        System.out.println(list);
        list.removeAll(list1);
        System.out.println(list);
        list.add(car);
        for (Car c : list) {
            System.out.println(c);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}