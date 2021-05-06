public class Homework67 {
    public static void main(String[] args){
        int list[] = {3, 2, 5, 8, -1, 29, 1};
        int temp;
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length - i - 1; j++){
                if (list[j+1] < list[j]){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + "\t");
        }
    }
}
