package homework;

public class UserService {

    public static void main(String[] args) {
        UserService service = new UserService();
        try {
            service.validatePhone("12478780101"); // 错误手机号
        } catch (MyException e) {
            System.out.println("错误码: " + e.getCode() + ", 错误信息: " + e.getMessage());
        }

        try{
            service.validateEmail("qdfgesxfgww.cn");
        }catch (MyException e){
            System.out.println("错误码: " + e.getCode() + ", 错误信息: " + e.getMessage());
        }

    }

    public void validatePhone(String phone) {
        if (!phone.matches("^1[3-9]\\d{9}$")) {
            throw new MyException(ErrorEnum.PHONE_ERROR);
        }
    }

    public void validateEmail(String email)
    {
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new MyException(ErrorEnum.EMAIL_ERROR);
        }
    }
}
