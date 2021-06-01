package houserent;

class HouseData {
    int id;
    String name;
    String phoneNum;
    String address;
    double moneyMonthRent;
    String state;

    public HouseData(){}

    public HouseData(int id, String name, String phoneNum, String address, double moneyMonthRent, String state){
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.moneyMonthRent = moneyMonthRent;
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setMoneyMonthRent(double moneyMonthRent) {
        this.moneyMonthRent = moneyMonthRent;
    }

    public double getMoneyMonthRent() {
        return moneyMonthRent;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
