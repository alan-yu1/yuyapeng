public class Homework56 {
    public static void main(String[] args){
        int num = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 5 != 0){
                num ++;
                System.out.print(i);
                System.out.print('\t');
                if (num % 5 == 0){
                    System.out.println();
                }
            }
        }

    }
}
