public class Homework77 {
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.name = "栋";
        dog1.color = "红";
        dog1.age = 22;
        dog1.show();
    }
}
class Dog{
    String name;
    String color;
    int age;
    public void show(){
        System.out.println("姓名为：" + this.name);
        System.out.println("颜色为：" + this.color);
        System.out.println("年龄为：" + this.age);
    }
}
