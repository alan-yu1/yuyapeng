public class Homework71 {
    public static void main(String[] args){
        A01 a01 = new A01();
        double[] nums = {0.0, 1.1, 2.3, 5.4, 0.7, 10.3};
        double[] num = new double[0];
        System.out.println(a01.max(nums));
        System.out.println(num.length);
        System.out.println(a01.max(num));
    }
}
class A01{
    public Double max(double[] arrs){
        if (arrs.length > 0){
            double max_num = arrs[0];
            for (int i = 1; i < arrs.length; i++){
                if (max_num < arrs[i]){
                    max_num = arrs[i];
                }
            }
            return max_num;
        }
        else{
            return null;
        }
    }
}