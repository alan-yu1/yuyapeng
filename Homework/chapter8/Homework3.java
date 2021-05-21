package chapter8;

public class Homework3 {
    public static void main(String[] args) {
        Professor p = new Professor("刘",1,"教授", 0.3, 1.3);
        p.introduce();
        AssociateProfessor a = new AssociateProfessor("云", 2, "副教授", 0.2, 1.2);
        a.introduce();
        Lecturer l = new Lecturer("栋", 3, "讲师", 0.4, 1.1);
        l.introduce();
    }
}


class Teacher{
    private String name;
    private int age;
    private String post;
    private double salary;
    //这里我们再增加一个工资级别
    private double grade;

    public Teacher(){}

    public Teacher(String name, int age, String post, double salary, double grade){
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPost() {
        return post;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void introduce(){
        System.out.println("老师的信息为:" + this.name + "\t" + this.age + "\t" + this.post + "\t" + this.salary);
    }
}

class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary, double grade){
        super(name, age, post, salary, grade);
    }

    public void introduce(){
        super.introduce();
    }
}

class AssociateProfessor extends Teacher{
    public AssociateProfessor(String name, int age, String post, double salary, double grade){
        super(name, age, post, salary, grade);
    }

    public void introduce(){
        super.introduce();
    }
}

class Lecturer extends Teacher{
    public Lecturer(String name, int age, String post, double salary, double grade){
        super(name, age, post, salary, grade);
    }

    public void introduce(){
        super.introduce();
    }
}
