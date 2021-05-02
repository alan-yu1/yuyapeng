import java.util.Scanner;

public class Homework54 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入三位的整数");
        int num = myScanner.nextInt();
        if (num >= 100 && num < 1000){
            int num1 = num % 10;
            int num2 = (num / 10) % 10;
            int num3 = num / 100;
            if (num == Math.pow(num1, 3) + Math.pow(num2, 3) + Math.pow(num3, 3)){
                System.out.println(num + "是水仙花数");
            }else{
                System.out.println(num + "不是水仙花数");
            }
        }else{
            System.out.println("请重新输入！");
        }
    }
}
