package houserent;

import java.util.Scanner;

class AddHouse {
    public HouseData[] addHouse(HouseData[] houseData){
        HouseData[] addData = new HouseData[houseData.length+1];
        for (int i = 0; i < houseData.length; i++) {
            addData[i] = houseData[i];
        }
        addData[houseData.length] = new HouseData();
        Scanner myScanner = new Scanner(System.in);
        System.out.print("姓名：");
        String name = myScanner.next();
        addData[houseData.length].setName(name);
        System.out.print("电话：");
        String phoneNum = myScanner.next();
        addData[houseData.length].setPhoneNum(phoneNum);
        System.out.print("地址:");
        String address = myScanner.next();
        addData[houseData.length].setAddress(address);
        System.out.print("月租:");
        double money = myScanner.nextDouble();
        addData[houseData.length].setMoneyMonthRent(money);
        System.out.print("状态：");
        String state = myScanner.next();
        addData[houseData.length].setState(state);
        addData[houseData.length].setId(houseData.length);
        System.out.println("-----添加完成-----");
        return addData;
    }
}
