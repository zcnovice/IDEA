package homework2;

public class OrderException extends RuntimeException{

    private int code = 0;
    public OrderException(OrderErrorEnum orderErrorEnum) {

        super(orderErrorEnum.getMsg());
        /* 为什么不可以把code一起传入进去
        *   因为super()  RuntimeException构造里面只有msg
        *   因此要对多余的变量重新传*/
        this.code = orderErrorEnum.getCode();
    }

    public int getCode() {
        return code;
    }
}
