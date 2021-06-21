package chapter11;

public class Homework05 {
    public static void main(String[] args) {
        new A().f1();
    }
}

class A{
    private String name = "刘恩琪";
    public void f1() {
        class B{
            private final String NAME = "刘云栋";
            public void show(){
                System.out.println("内部类" + this.NAME);
                System.out.println("外部类" + A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}
