package ATM.service;

import ATM.entity.User;

public interface ManagerService {


    /**
     * 添加用户
     * @param user 用户
     */
    boolean addUser(User user);

    /**
     * 删除用户
     * @param userName 用户名
     */
    boolean deleteUser(String userName);

    /**
     * 冻结账户
     * @param userName 用户名
     */
    boolean FreezingAccounts(String userName);

    /**
     * 展示用户
     */
    void showUser();

    /**
     * 根据用户名查询用户
     * @param name 用户名
     * @return 数据库里面是否有
     */
    boolean NameQueryUser_b(String name);

    /**
     * 根据用户名查询用户
     * @param name 用户名
     * @return 返回用户
     */
    User NameQueryUser_U(String name);
}
