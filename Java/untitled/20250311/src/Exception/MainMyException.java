package test;

public class MainMyException {
    public static void main(String[] args) {
        //输入一个手机号码
        String phone = "xxxx";
        checkPhone(phone);
    }

    public static void checkPhone(String phone){

        String regex ="^1[3-9][0-9]{9}";
        if(!phone.matches(regex)){
            throw  new MyException("手机号码格式不正确");
        }
    }
}
