package houserent;

import java.util.Scanner;

class HouseView {
    public void mainshow(){
        HouseData[] houseData = new HouseData[0];


        boolean jud = true;
        Scanner myScanner = new Scanner(System.in);


        do{
            menu();
            System.out.println("请输入（1-6）：");
            int select = myScanner.nextInt();
            switch (select){
                case 1:
                    System.out.println("-----新增房源-----");
                    AddHouse add = new AddHouse();
                    houseData = add.addHouse(houseData);
                    break;
                case 2:
                    System.out.println("-----查找房屋-----");
                    SelectHouse sel = new SelectHouse();
                    sel.selectHouse(houseData);
                    break;
                case 3:
                    System.out.println("-----删除房屋-----");
                    DeleteHouse del = new DeleteHouse();
                    houseData = del.deleteHouse(houseData);
                    break;
                case 4:
                    System.out.println("-----修改房屋信息-----");
                    ChangeHouse cha = new ChangeHouse();
                    houseData = cha.changeHouse(houseData);
                    break;
                case 5:
                    System.out.println("-----房屋列表-----");
                    InfoHouse inf = new InfoHouse();
                    inf.info(houseData);
                    break;
                case 6:
                    System.out.println("-----退出-----");
                    jud = false;
                    break;
            }
        }while(jud);
    }

    public void menu(){
        System.out.println("----------房屋出租系统----------");
        System.out.println("1 新增房源");
        System.out.println("2 查找房屋");
        System.out.println("3 删除房屋");
        System.out.println("4 修改房屋信息");
        System.out.println("5 房屋列表");
        System.out.println("6 退出");
    }
}
