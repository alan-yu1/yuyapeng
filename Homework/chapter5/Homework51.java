public class Homework51 {
    public static void main(String[] args){
        int money = 100000;
        int i = 0;
        while (money > 0){
            if (money > 50000){
                money *= (1 - 0.05);
                i++;
            }else if (money >= 1000 && money <= 50000){
                money -= 1000;
                i++;
            }else {
                break;
            }
        }System.out.println(i);
    }
}
