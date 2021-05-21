package chapter8;

public class Homework1 {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        p[0] = new Person("刘", 1, 0.01);
        p[1] = new Person("云", 2, 0.05);
        p[2] = new Person("栋", 3, 0.04);
        for (int i = 0; i < p.length; i++){
            for (int j = 0; j < p.length-i-1; j++){
                if (p[j].age < p[j+1].age){
                    Person temp = p[j];
                    p[j] = p[j+1];
                    p[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < p.length; i++){
            p[i].info();
        }
    }
}

class Person{
    String name;
    int age;
    double salary;
    public Person(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void info(){
        System.out.println("第一个信息" + this.name + "\t" + this.age + "\t" + this.salary);
    }
}
