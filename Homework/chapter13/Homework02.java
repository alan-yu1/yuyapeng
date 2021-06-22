package chapter13;

public class Homework02 {
    public static void main(String[] args) {
        String name = "刘云栋";
        String pwd = "123456";
        String email = "liu@qq.com";
        try {
            submit(name,pwd,email);
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
    public static void submit(String name, String pwd, String email){
        if (!(name.length() >= 2 && name.length() <=4)){
            throw new RuntimeException("用户名长度不符合要求");
        }
        if (!(pwd.length() == 6 && isDigital(pwd))){
            throw new RuntimeException("密码不符合要求");
        }
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i < j && i > 0)){
            throw new RuntimeException("邮箱不正确");
        }
    }
    public static boolean isDigital(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9'){
                return false;
            }
        }
        return true;
    }
}
