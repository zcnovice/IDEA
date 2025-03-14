package ATM.entity;

import java.util.UUID;

public class User {
    private UUID UUID;
    private String UserName;
    private String password;

    //角色  (0-admin,1-user)
    private int role;
    //余额
    private int balance;
    //状态   (0 冻结 1 正常)
    private int state;


    public User() {
    }


    //管理员不用添加    余额，状态
    public User(String userName, String password, int role) {
        UserName = userName;
        this.password = password;
        this.role = role;
    }


    //普通用户，都要添加
    public User(String userName, String password, int role, int state) {
        UserName = userName;
        this.password = password;
        this.role = role;
        //this.balance = balance;
        this.state = state;
    }

    public User(String userName, String password, int role,int balance, int state) {
        UserName = userName;
        this.password = password;
        this.role = role;
        this.balance = balance;
        this.state = state;
    }



    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
