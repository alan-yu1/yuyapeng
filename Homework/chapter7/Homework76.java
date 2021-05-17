public class Homework76 {
    public static void main(String[] args){
        Cale c1 = new Cale(1, 2);
        System.out.println("和为：" + c1.add(c1));
        System.out.println("差为：" + c1.sub(c1));
        System.out.println("积为：" + c1.mul(c1));
        System.out.println("商为：" + c1.div(c1));
        Cale c2 = new Cale(2.3, 4.5);
        System.out.println("和为：" + c2.add(c2));
        System.out.println("差为：" + c2.sub(c2));
        System.out.println("积为：" + c2.mul(c2));
        System.out.println("商为：" + c2.div(c2));
    }
}
class Cale{
    double n1;
    double n2;
    public Cale(double n1,double n2){
        this.n2 = n2;
        this.n1 = n1;
    }
    public double add(Cale c){
        return c.n1 + c.n2;
    }
    public double sub(Cale c){
        return c.n1 - c.n2;
    }
    public double mul(Cale c){
        return c.n2 * c.n1;
    }
    public double div(Cale c){
        return c.n1 / c.n2;
    }
}