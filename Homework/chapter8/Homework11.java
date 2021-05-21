package chapter8;

public class Homework11 {
    public static void main(String[] args) {
        Person11 p1 = new Student11();
        p1.run();
        p1.eat();
        System.out.println();
        Student11 p2 = (Student11) p1;
        p2.eat();
        p2.run();
        p2.study();
    }
}

class Person11{
    public void run(){
        System.out.println("person run");
    }
    public void eat(){
        System.out.println("person eat");
    }
}

class Student11 extends Person11{
    public void run() {
        System.out.println("student run");
    }
    public void study(){
        System.out.println("student study");
    }
}