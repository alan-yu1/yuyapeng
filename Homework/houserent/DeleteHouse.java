package houserent;

import java.util.Scanner;

class DeleteHouse {
    public HouseData[] deleteHouse(HouseData[] houseData){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("请选择待删除的房屋编号：");
        int id = myScanner.nextInt();
        System.out.println("确认是否删除（Y/N），请小心选择：");
        String boo = myScanner.next();
        if (boo.equals("Y")){
            HouseData[] deleteData = new HouseData[houseData.length-1];
            for (int i = 0; i < houseData.length; i++) {
                if (i < id){
                    deleteData[i] = houseData[i];
                    deleteData[i].id = i;
                }
                else if(i > id){
                    deleteData[i-1] = houseData[i];
                    deleteData[i-1].id = i - 1;
                }
            }
            System.out.println("请确认删除的房屋编号" + id +"!\t 确认是否删除（Y/N）");
            String bool = myScanner.next();
            if (bool.equals("Y")){
                houseData = deleteData;
                System.out.println("-----删除完成-----");
            }
        }
        return houseData;
    }
}
