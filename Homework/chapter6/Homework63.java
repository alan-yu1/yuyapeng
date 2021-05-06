/*
结果：
1
3
5
7
 */
public class Homework63 {
    public static void main(String[] args){
        int num = 1;
        while (num < 10){
            System.out.println(num);
            if (num > 5){
                break;
            }
            num += 2;
        }
    }
}
