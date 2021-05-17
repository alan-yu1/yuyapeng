public class Homework72 {
    public static void main(String[] args){
        char c1 = '一';
        char[] cs = {'二', '一', '无', '三', '四'};
        A02 a02 = new A02();
        System.out.println(a02.find(c1, cs));
    }
}
class A02{
    public int find(char c, char...cs){
        int index = -1;
        for (int i = 0; i < cs.length; i++){
            if (c == cs[i]){
                index = i;
            }
        }
        return index;
    }
}