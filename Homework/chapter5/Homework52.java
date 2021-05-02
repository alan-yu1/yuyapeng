import java.util.Scanner;

public class Homework52 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = myScanner.nextInt();
        if (n > 0){
            System.out.println(n + "大于0");
        }else if (n == 0){
            System.out.println(n + "等于0");
        }else{
            System.out.println(n + "小于0");
        }
    }
}
