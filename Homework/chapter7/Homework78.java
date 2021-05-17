/*
输出结果为：10、9、10
 */
public class Homework78 {
    int count = 9;
    public void count1(){
        count = 10; //属性
        System.out.println("count1=" + count);
    }
    public void count2(){
        System.out.println("count2=" + count);
    }
    public static void main(String[] args){
        //匿名对象使用后，就不能使用。
        new Homework78().count1();
        Homework78 t1 = new Homework78();
        t1.count2();
        t1.count1();
    }
}
