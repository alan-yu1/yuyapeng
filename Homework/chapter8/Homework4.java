package chapter8;

public class Homework4 {
    public static void main(String[] args) {
        Manager m = new Manager("刘", 2, 30, 1.2);
        Worker w = new Worker("栋", 2,30, 1.0);
        System.out.println("管理者的工资为：" + m.salary());
        System.out.println("员工的工资为：" + w.salary());
    }
}

class Employee{
    private String name;
    private double salaryDay;
    private int day;
    private double grade;
    public Employee(String name, double salaryDay, int day, double grade){
        this.name = name;
        this.salaryDay = salaryDay;
        this.day = day;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalaryDay(double salaryDay) {
        this.salaryDay = salaryDay;
    }

    public double getSalaryDay() {
        return salaryDay;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public double salary(){
        return this.salaryDay * this.day * this.grade;
    }
}

class Manager extends Employee{
    public Manager(String name, double salaryDay, int day, double grade){
        super(name, salaryDay, day, grade);
    }
    public double salary(){
        return super.salary() + 1000;
    }
}

class Worker extends Employee{
    public Worker(String name, double salaryDay, int day, double grade){
        super(name, salaryDay, day, grade);
    }
    public double salary(){
        return super.salary();
    }
}