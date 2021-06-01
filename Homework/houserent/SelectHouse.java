package houserent;

import java.util.Scanner;

class SelectHouse {
    public void selectHouse(HouseData[] houseData){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("请输入你要查找的id:");
        int id = myScanner.nextInt();
        for (int i = 0; i < houseData.length; i++) {
            if (id == houseData[i].id){
                System.out.print(houseData[i].id + "\t" + houseData[i].name + "\t" + houseData[i].phoneNum + "\t"
                        + houseData[i].address + "\t" + houseData[i].moneyMonthRent + "\t" + houseData[i].state);
            }
        }
    }
}
