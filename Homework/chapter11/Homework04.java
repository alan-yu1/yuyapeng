package chapter11;

public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Computer(){
            @Override
            public int work(int n1, int n2) {
                return n1 + n2;
            }
        }, 10, 4);
    }
}

interface Computer{
    public int work(int n1, int n2);
}

class Cellphone{
    public void testWork(Computer com, int n1, int n2){
        System.out.println("调用了work方法");
        System.out.println(com.work(n1, n2));
    }
}