package chapter8;

public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("韩", 20, "牙医", "man", 4);
        Doctor doctor2 = new Doctor("刘", 20, "牙医", "man", 4);
        Doctor doctor3 = new Doctor("刘", 20, "牙医", "man", 4);
        System.out.println(doctor1.equals(doctor2));
        System.out.println(doctor2.equals(doctor3));
    }
}

class Doctor{
    private String name;
    private int age;
    private String job;
    private String gender;
    private double sal;
    public Doctor(String name, int age, String job, String gender, double sal){
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        else if (!(obj instanceof Doctor)){
            return false;
        }
        else{
            Doctor obj1 = (Doctor) obj;
            return obj1.name.equals(this.name) && obj1.age == this.age
                    && obj1.job.equals(this.job) && obj1.gender.equals(this.gender)
                    && obj1.sal == this.sal;
        }
    }
}