public class Homework79 {
    public static void main(String[] args){
        Music mymusic = new Music("笑傲江湖",4321);
        mymusic.paly();
        System.out.println(mymusic.getInfo());
    }
}
class Music{
    String name;
    int time;
    public Music(String name, int time){
        this.name = name;
        this.time = time;
    }
    public void paly(){
        System.out.println("音乐：" + name + "\t" + "时长为：" + time);
    }
    public String getInfo(){
        String info = "音乐：" + name + "\t" + "时长为：" + time;
        return info;
    }
}