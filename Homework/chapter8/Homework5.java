package chapter8;

public class Homework5 {
    public static void main(String[] args) {
        Staff a = new Worker1("郭晓彤", 10);
        System.out.println(a.getName() + "薪资为" + a.salary());
        Staff b = new Scientist("刘云栋", 20, 10);
        System.out.println(b.getName() + "薪资为：" + b.salary());
        Staff c = new Teacher1("刘恩琪", 50,35, 100);
        System.out.println(c.getName() + "薪资为：" + c.salary());
    }
}

class Staff{
    private String name;
    private double sal;

    public Staff(String name, double sal){
        this.name = name;
        this.sal = sal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }

    public double salary(){
        return this.sal;
    }
}

class Worker1 extends Staff{

    public Worker1(String name, double sal){
        super(name, sal);
    }
     public double salary(){
        return super.salary();
     }
}

class Teacher1 extends Staff{
    private int classDay;
    private double classSal;
    public Teacher1(String name, double sal, int classDay, double classSal){
        super(name, sal);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public double getClassSal() {
        return classSal;
    }
     public double salary(){
        return super.salary() + this.classDay * this.classSal;
     }
}

class Scientist extends Staff{
    private double bonus;
    public Scientist(String name, double sal, double bonus){
        super(name, sal);
        this.bonus = bonus;
    }
    public double salary(){
        return super.salary() + this.bonus;
    }
}
