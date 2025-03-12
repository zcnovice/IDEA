package homework;

public enum ErrorEnum {

    PHONE_ERROR(101, "手机号码格式错误"),
    EMAIL_ERROR(102, "邮箱格式错误"),
    USER_NOT_FOUND(103, "用户不存在"),
    INVALID_PASSWORD(104, "密码错误");

    private final int code;
    private final String msg;

    ErrorEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


}
