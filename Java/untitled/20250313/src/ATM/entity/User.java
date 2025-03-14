package ATM.entity;

public class SuperUser {

    private String UserName;
    private String password;


    private int role;

    private int balance;
    //状态
    private int state;


    public SuperUser() {
    }

    public SuperUser(String userName, String password) {
        UserName = userName;
        this.password = password;
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

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
