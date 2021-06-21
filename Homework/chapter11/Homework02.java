package chapter11;

public class Homework02 {
    public static void main(String[] args) {
        System.out.println(Forck.getNextNum());
        System.out.println(Forck.getNextNum());
        Forck f1 = new Forck();
        Forck f2 = new Forck();
        Forck f3 = new Forck();
        System.out.println(f1.getSerialNumber());
        System.out.println(f2.getSerialNumber());
        System.out.println(f3.getSerialNumber());
    }
}

class Forck{

    static int currentNum = 100000;
    int serialNumber;

    Forck(){
        this.serialNumber = getNextNum();
    }
    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
