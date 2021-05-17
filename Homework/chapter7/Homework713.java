import javax.swing.plaf.ComponentInputMapUIResource;

public class Homework713 {
    public static void main(String[] args){
        Circle1 c1 = new Circle1();
        new PassObject().printAreas(c1, 5);
    }
}
class Circle1{
    double radius;
    public double findArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
class PassObject{
    public void printAreas(Circle1 c, int times){
        for (int i = 1; i <= times; i++){
            c.radius = i;
            System.out.println("r为：" + i + "\t面积为:" + c.findArea());
        }
    }
}
