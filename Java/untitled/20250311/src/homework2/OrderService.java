package homework2;

public class OrderService {
    public void submitOrder(boolean isUserLogin, int stock, double amount) {
        // 校验逻辑，抛出 OrderException
        /*    抛出异常语法：throw new 异常类名（传入枚举类型）   */
        /* 具体抛出什么异常通过枚举类来定义 */
        if (!isUserLogin)
        {
            throw new OrderException(OrderErrorEnum.USER_NOT_LOGIN);
        }

        if(stock <= 0)
        {
            throw new OrderException(OrderErrorEnum.STOCK_NOT_ENOUGH);
        }

        if(amount < 0)
        {
            throw new OrderException(OrderErrorEnum.INVALID_AMOUNT);
        }
    }

    public static void main(String[] args) {
        OrderService service = new OrderService();
        try {
            // 测试用例：用户未登录、库存不足、金额无效等
            service.submitOrder(false, 100, 100);
        } catch (OrderException e) {
            System.out.println("错误码: " + e.getCode() + "，错误信息: " + e.getMessage());
        }
    }
}
