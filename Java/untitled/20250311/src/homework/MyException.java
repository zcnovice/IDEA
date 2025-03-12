package homework;

public class MyException extends RuntimeException{
    private final int code;
    public MyException(ErrorEnum errorEnum) {
        super(errorEnum.getMsg());
        this.code = errorEnum.getCode();
    }

    public int getCode() {
        return code;
    }
}


