package chapter13;

public class Homework04 {
    public static void main(String[] args) {
        String str = "dfadfkjhdjfhkj1233AJDHFJKAFUIDjfdkjf3875njfh8";
        int[] arr = count(str);
        System.out.println("大写字母个数为：" + arr[0]);
        System.out.println("小写字母个数为：" + arr[1]);
        System.out.println("数字个数为：" + arr[2]);
    }
    public static int[] count(String str){
        char[] chars = str.toCharArray();
        int[] count = new int[3];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z'){
                count[0] += 1;
            }
            else if (chars[i] >= 'a' && chars[i] <= 'z'){
                count[1] += 1;
            }
            else if (chars[i] >= '0' && chars[i] <= '9'){
                count[2] += 1;
            }
        }
        return count;
    }
}
