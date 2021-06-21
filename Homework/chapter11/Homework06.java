package chapter11;

public class Homework06 {
    public static void main(String[] args) {
        Person person = new Person("唐僧", new Horse());
        person.passRiver();
        person.common();


    }
}

interface Vehicles{
    public void work();
}

class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("一般情况下使用马作为交通工具");
    }
}

class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("遇到大河时用船作为交通工具");
    }
}

class VehiclesIndustry{
    public static Horse getHorse(){
        return new Horse();
    }

    public static Boat getBoat(){
        return new Boat();
    }
}


class Person{
    private String name;
    private Vehicles vehicles;

    Person(String name, Vehicles vehicles){
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver(){
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesIndustry.getBoat();
        }
        vehicles.work();
    }

    public void common(){
        if(!(vehicles instanceof Horse)) {
            vehicles = VehiclesIndustry.getHorse();
        }
        vehicles.work();
    }
}