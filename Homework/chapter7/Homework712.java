public class Homework712 {
    public static void main(String[] args){
        Employee a = new Employee("栋",'男', 20, "学生", 800);
    }
}
class Employee{
    String name;
    char sex;
    int age;
    String posts;
    double salary;
    public Employee(String posts, double salary){
        this.posts = posts;
        this.salary = salary;
    }
    public Employee(String name, char sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Employee(String name, char sex, int age, String posts, double salary){
        this(name, sex, age); // 复用构造器只能在构造器的第一条语句中使用。
        this.posts = posts;
        this.salary = salary;
    }
    public Employee(){}
}
