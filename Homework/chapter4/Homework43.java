public class Homework43 {
    public static void main(String[] args){
        //(1)int num1 = (int)"18"; "18"为字符串故而用Integer.parseInt.
        int num1 = Integer.parseInt("18");
        //(2)int num2 = 18.0; 18.0为double类型
        double num2 = 18.0;
        //(3)true
        double num3 = 3d;
        //(4)true
        double num4 = 8;
        //(5)int不能赋给char
        int i = 48;
        char num5 = (char)(i + 1);
        //(6)int不能赋给short
        byte b = 19;
        short num6 = (short)(b + 2);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);



    }
}
