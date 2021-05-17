import java.util.Arrays;

public class Homework74 {
    public static void main(String[] args){
        A03 a03 = new A03();
        int[] arr1 = {1, 3, 5, 6, 3};
        int[] arr2 = a03.copyArr(arr1);
        arr1[0] = 9;
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr1));
    }
}
class A03{
    public int[] copyArr(int[] arr){
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        return temp;
    }
}
