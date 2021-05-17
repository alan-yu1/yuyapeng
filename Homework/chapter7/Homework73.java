import java.util.Scanner;

public class Homework73 {
    public static void main(String[] args){
        Book book = new Book();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入价格");
        double price = myScanner.nextDouble();
        price = book.updatePrice(price);
        System.out.println("改变后的价格为"+price);
    }
}
class Book{
    public double updatePrice(double price){
        if (price > 150.0){
            return 150.0;
        }
        else if (price > 100.0){
            return 100.0;
        }
        else{
            return price;
        }
    }
}
