package chapter13;

public class Homework03 {
    public static void main(String[] args) {
        String name = "Liu Yun Dong";
        System.out.println(personName(name));

    }
    public static String personName(String name){
        String newName = "";
        String[] Names = name.split(" ");
        if (Names.length == 3){
            char[] chars = Names[1].toCharArray();
            newName += Names[2] + "," + Names[0] + "," + chars[0];
        }
        else{
            System.out.println("姓名格式不对");
        }
        return newName;
    }
}
