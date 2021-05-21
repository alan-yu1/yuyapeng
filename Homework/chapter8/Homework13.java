package chapter8;


public class Homework13 {
    public static void main(String[] args) {
        Student13 s13 = new Student13("小明", "男", 15, "00023102");
        Teacher13 t13 = new Teacher13("张飞", "男", 30, 5);
        System.out.println("老师的信息：");
        System.out.println("姓名：" + t13.getName());
        System.out.println("年龄：" + t13.getAge());
        System.out.println("性别：" + t13.getSex());
        System.out.println("工龄：" + t13.getWork_age());
        t13.teach();
        System.out.println(t13.play());
        System.out.println("--------------------");
        System.out.println("学生的信息：");
        System.out.println("姓名：" + s13.getName());
        System.out.println("年龄：" + s13.getAge());
        System.out.println("性别：" + s13.getSex());
        System.out.println("学号：" + s13.getStu_id());
        s13.study();
        System.out.println(s13.play());
        Person13[] p13s = new Person13[4];
        p13s[0] = s13;
        p13s[1] = new Student13("顺", "男", 4, "0909");
        p13s[2] = new Teacher13("栋", "男", 6, 3);
        p13s[3] = t13;
        for (int i = 0; i < p13s.length; i++) {
            for (int j = 0; j < p13s.length - i - 1; j++){
                if (p13s[j].getAge() < p13s[j+1].getAge()){
                    Person13 temp = p13s[j];
                    p13s[j] = p13s[j+1];
                    p13s[j+1] = temp;
                }
            }
            System.out.println(p13s[p13s.length-1-i].getName());
        }
    }
}
class Person13{
    private String name;
    private String sex;
    private int age;
    public Person13(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String play(String game){
        return name + "爱玩" + game;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
class Student13 extends Person13{
    private String stu_id;
    public Student13(String name, String sex, int age, String stu_id){
        super(name, sex, age);
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我承诺，我会好好学习。");
    }

    public String play() {
        return super.play("足球");
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }
}
class Teacher13 extends Person13{
    private int work_age;
    public Teacher13(String name, String sex, int age, int work_age){
        super(name, sex, age);
        this.work_age = work_age;
    }
    public void teach(){
        System.out.println("我承诺，我会认真教学。");
    }

    public String play() {
        return super.play("象棋");
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }
}
