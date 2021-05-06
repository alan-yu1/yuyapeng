import java.util.Scanner;

public class Homework64 {
    public static void main(String[] args){
        int list[] = {10, 12, 45, 90};
        int newList[] = new int[list.length + 1];
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入您想要插入的数：");
        int num = myScanner.nextInt();
        int j = 0;
        for (int i = 0; i < newList.length; i++){
            if (num < list[j]){
                newList[i] = num;
                num = 10000000;
            }else{
                newList[i] = list[j];
                j++;
            }
        }
        for (int i = 0; i < newList.length; i++){
            System.out.print(newList[i]);
            System.out.print("\t");
        }
    }
}
