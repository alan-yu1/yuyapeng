public class Homework65 {
    public static void main(String[] args){
        int list[] = new int[10];
        for (int i = 0; i < list.length; i++){
            list[i] = (int)(Math.random() * 100) + 1;
        }
        int sum = 0;
        int index = -1;
        int maxNum = list[0];
        boolean eight_have = false;
        for (int i = 0; i < list.length; i++){
            System.out.print(list[list.length-1-i] + "\t");
            sum += list[list.length-1-i];
            if (maxNum <= list[list.length-1-i]){
                index = list.length-1-i;
                maxNum = list[list.length-1-i];
            }
            if (list[list.length-1-i] == 8){
                eight_have = true;
            }
        }
        if (index == -1){
            index = 0;
        }
        double ave = (double)sum / list.length;
        System.out.println("平均值为：" + ave);
        System.out.println("最大值为：" + maxNum + "指标为" + index);
        System.out.println("列表是否有8：" + eight_have);
    }
}
