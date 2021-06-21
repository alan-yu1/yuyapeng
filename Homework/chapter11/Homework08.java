package chapter11;

public class Homework08 {
    public static void main(String[] args) {
        Color a = Color.RED;
        a.show();
        switch (a){
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            case BLACK:
                System.out.println("黑色");
                break;
            case YELLOW:
                System.out.println("黄色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
        }
    }
}

interface IMyInterface {
    public void show();
}

enum Color implements IMyInterface{
    RED(255, 0, 0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue){
        this.redValue = redValue;
        this.blueValue = blueValue;
        this.greenValue = greenValue;
    }

    @Override
    public void show() {
        System.out.println("红色为:" + redValue + "\t" + "绿色为:" + "\t" + greenValue + "蓝色为:" + blueValue);
    }
}
