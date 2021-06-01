package houserent;

class InfoHouse {
    public void info(HouseData[] houseData){
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态");
        for (int i = 0; i < houseData.length; i++) {
            System.out.println(houseData[i].id + "\t" + houseData[i].name + "\t" + houseData[i].phoneNum + "\t"
                    + houseData[i].address + "\t" + houseData[i].moneyMonthRent + "\t" + houseData[i].state);
        }
        System.out.println("-----房屋列表完成-----");
    }
}
