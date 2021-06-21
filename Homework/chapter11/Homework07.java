package chapter11;

public class Homework07 {
    public static void main(String[] args) {
        Car1 car1 = new Car1(2);
        car1.getAir().flow();
        Car1 car2 = new Car1(60);
        car2.getAir().flow();
        Car1 car3 = new Car1(-1);
        car3.getAir().flow();
    }
}

class Car1{
    private double temperature;

    Car1(double temperature){
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if (Car1.this.temperature > 40){
                System.out.println("吹冷气");
            }
            else if (Car1.this.temperature < 0){
                System.out.println("吹暖气");
            }
            else{
                System.out.println("关闭空调");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }
}