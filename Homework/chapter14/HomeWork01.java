package chapter14;

import java.util.*;

public class HomeWork01{
    public static void main(String[] args) {
        List<New> list = new ArrayList<>();
        New new1 = new New("新冠确诊病例超千万，数百万印度教信徒赴恒河'圣浴'引民众担忧");
        New new2 = new New("钓鱼");
        list.add(new1);
        list.add(new2);
        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i).getTitle().length() > 15){
                System.out.println(list.get(i).getTitle().substring(0,15) + "...");
            }
            else{
                System.out.println(list.get(i).getTitle());
            }
        }
    }
}


class New{
    private String title;
    private String content;

    public New(){}

    public New(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "New{" +
                "title='" + title + '\'' +
                '}';
    }
}
