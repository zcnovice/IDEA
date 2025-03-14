package ATM.service;

import ATM.entity.User;

public interface CommonService {

    /**
     * 查看当前登录用户余额
     * @param name 用户
     */
    void CheckBalance(String name);

    /**
     * 存钱
     * @param name 用户
     * @param balance 存款金额
     * @return 成功与否
     */
    boolean Saving(String name,int balance);

    /**
     *取钱
     * @param name 用户
     * @param balance 取款金额
     * @return 成功与否
     */
    boolean Withdraw(String name,int balance);

    /**
     *
     * @param MyName 转账用户
     * @param HeName 待转账用户
     * @param balance 转账金额
     * @return 成功与否
     */
    boolean Transfer(String MyName,String HeName,int balance);


    /**
     * 判断账户状态是否正常
     * @param user 待判断用户
     * @return 是否正常
     */
    boolean Check(User user);



    //查询账户返还User
    User Check_U(String name);
}
