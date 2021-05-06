public class Homework61 {
    public static void main(String[] args){
        //String strs[] = {'a', 'b', 'c'};  //错误
        //String[] strs = {"a", "b", "c"};  //正确
        //String[] strs = new String{"a" "b" "c"};  //错误
        String strs[] = new String[]{"a", "b", "c"};  //正确
        //String[] strs = new String[3]{"a", "b", "c"};  //错误
        for (int i = 0; i < strs.length; i++){
            System.out.println(strs[i]);
        }


    }
}
