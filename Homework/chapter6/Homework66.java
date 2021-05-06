/*
a,a
韩,韩
b,b
c,c
 */
public class Homework66 {
    public static void main(String[] args){
        char[] arr1 = {'a', 'z', 'b', 'c'};
        char[] arr2 = arr1;
        arr2[2] = '韩';
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i] + "," + arr2[i]);
        }
    }
}
