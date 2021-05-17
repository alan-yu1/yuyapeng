import java.util.Random;
import java.util.Scanner;

public class Homework714 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        Tom t = new Tom();
        String result;
        int winNum = 0;
        int totalNum = 5;
        for (int i = 0; i < totalNum; i++){
            System.out.println("你出什么：");
            t.tomNumber = myScanner.nextInt();
            t.computerNumber = t.getComputerNumber();
            result = t.race();
            if ("赢".equals(result)){
                winNum++;
            }
        }
        System.out.println(winNum);
    }
}
class Tom{
    int tomNumber;
    int computerNumber;
    int frequency;
    public int getComputerNumber(){
        Random r = new Random();
        computerNumber = r.nextInt(3);
        return computerNumber;
    }
    public String race(){
        if (tomNumber == 0 && computerNumber == 1){
            return "赢";
        }
        else if (tomNumber == 1 && computerNumber == 2){
            return "赢";
        }
        else if (tomNumber == 2 && computerNumber == 0){
            return "赢";
        }
        else if (tomNumber == computerNumber){
            return "平";
        }
        else{
            return "输";
        }
    }
}

