package chapter13;

public class Homework01 {
    public static void main(String[] args) {
        String str = "aedcbf";
        int start = 1;
        int end = 4;
        String strNew = reverse(str, start, end);
        System.out.println(strNew);
    }
    public static String reverse(String str, int start, int end){
        String strReverse = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < start; i++) {
            strReverse += chars[i];
        }
        for (int i = end; i >= start ; i--) {
            strReverse += chars[i];
        }
        for (int i = end + 1; i < chars.length; i++) {
            strReverse += chars[i];
        }
        return strReverse;
    }
}
