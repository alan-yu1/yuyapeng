public class Homework75 {
    public static void main(String[] args){
        Circle c = new Circle();
        c.r = 5;
        System.out.println(c.d(c.r));
        System.out.println(c.s(c.r));
    }
}
class Circle{
    double r;
    public double d(double r){
        return 2 * Math.PI * r;
    }
    public double s(double r){
        return Math.PI * Math.pow(r, 2);
    }
}