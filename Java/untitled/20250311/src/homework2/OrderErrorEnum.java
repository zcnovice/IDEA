package homework2;

public enum OrderErrorEnum {
    STOCK_NOT_ENOUGH(201, "库存不足"),
    INVALID_AMOUNT(202, "订单金额无效"),
    USER_NOT_LOGIN(203, "用户未登录");

    private int code;
    private String msg;

    OrderErrorEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
