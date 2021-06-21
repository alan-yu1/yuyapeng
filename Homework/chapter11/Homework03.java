package chapter11;

public class Homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();
    }
}

abstract class Animal{
    abstract public void shout();
}

class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}

class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}