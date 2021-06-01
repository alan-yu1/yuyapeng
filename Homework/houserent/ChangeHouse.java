package houserent;

import java.util.Scanner;

class ChangeHouse {
    public HouseData[] changeHouse(HouseData[] houseData){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请选择待修改房屋编号（-1退出）：");
        int id = myScanner.nextInt();
        if(id >= 0 && id <= houseData.length){
            System.out.print("姓名(" + houseData[id].name + "):");
            String name = myScanner.next();
            houseData[id].name = name;
            System.out.print("电话(" + houseData[id].phoneNum + "):");
            String phoneNum = myScanner.next();
            houseData[id].phoneNum = phoneNum;
            System.out.print("地址(" + houseData[id].address + "):" );
            String address = myScanner.next();
            houseData[id].address = address;
            System.out.print("月租(" + houseData[id].moneyMonthRent + "):");
            double money = myScanner.nextDouble();
            houseData[id].moneyMonthRent = money;
            System.out.print("状态(" + houseData[id].state + "):");
            String state = myScanner.next();
            houseData[id].state = state;
        }
        System.out.println("-----修改完成-----");
        return houseData;
    }
}
