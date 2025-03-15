package ATM.view;

import ATM.DataUtils;
import ATM.entity.User;
import ATM.service.Impl.CommonServiceImpl;
import ATM.service.Impl.ManagerServiceImpl;

import java.util.Scanner;

public class View {
    public static boolean INTERION = true;

    public  void star() {
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.println("选择你的身份: 1,管理员  2，普通用户  3,退出系统");
            int num = in.nextInt();
            DetermineIdentity(num);
        }
    }

    /**
     * 判断用户身份
     * @param num 判断变量
     */
    public  void  DetermineIdentity(int num)
    {
        ManagerServiceImpl msi = new ManagerServiceImpl();
        while(true)
        {
            if(num == 1)
            {
                // 1,管理员
                User adminUser = Login();
                if(adminUser != null)
                {
                    //进入管理员页面
                    System.out.println("尊敬的"+adminUser.getUserName()+"，美好一天，欢迎进入ATM管理系统");
                    while(INTERION)
                    {
                        System.out.println("1.添加用户   2.删除用户   3.冻结用户   4.查看用户列表   5.回到主界面");
                        INTERION = interfaceAdmin();
                    }
                    INTERION = true;
                    num = -1;

                }
            }else if(num == 2)
            {
                //2，普通用户
                User  user = Login();
                if(user != null)
                {
                    //TODO
                    //进入用户页面
                    System.out.println("尊敬的"+user.getUserName()+"欢迎进入ATM用户页面");
                    while(INTERION)
                    {
                        System.out.println("1.查看当前登录用户余额     2.存钱     3.取钱    4.转账    5.回到主界面");
                        INTERION = interfaceUser(user);
                    }
                    INTERION = true;
                    num = -1;
                }
            }else if(num == 3)
            {
                //3,退出系统
                System.exit(0);
            }else{
                break;
            }
        }

    }

    /**
     * 用户登录
     * @return 返回用户对象
     */
    public User Login()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("输入用户名：");
        String name = in.nextLine();
        System.out.println("输入密码：");
        String password = in.nextLine();
        //判断用户密码，用户名是否正确
        User user = Judgement(name,password);
        if(user != null)
        {
            System.out.println("登录成功");
            return user;
        }
        System.out.println("用户名或密码错误，请重新输入");
        return null;
    }

    /**
     * //判断用户密码，用户名是否正确
     * @return 返回用户对象
     */
    public User Judgement(String name, String password)
    {
        for(int i = 0; i< DataUtils.users.size(); i++)
        {
            if(DataUtils.users.get(i).getUserName().equals(name) && DataUtils.users.get(i).getPassword().equals(password)) {
                return DataUtils.users.get(i);//登录成功 返回用户
            }
        }
        return null;
    }


    /*============================================管理员界面==========================================*/
    public boolean interfaceAdmin()
    {
        ManagerServiceImpl msi = new ManagerServiceImpl();
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if(i == 1)
        {
            //1.添加用户
            System.out.println("输入用户名：");
            String name = in.next();

            System.out.println("输入密码：");
            String password = in.next();
            int role = 1;
            System.out.println("输入账户状态：  (0 冻结 1 正常)");
            int state = in.nextInt();
            User user = new User(name,password,role,state);
            boolean s = msi.addUser(user);
            if(s)
            {
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }
        }else if(i == 2)
        {
            //2.删除用户
            System.out.println("输入待删除用户的用户名：");
            String name = in.next();
            boolean s = msi.deleteUser(name);
            if(s)
            {
                System.out.println("删除成功");
            } else{
                System.out.println("删除失败");
            }
        } else if (i ==3) {
            // 3.冻结用户
            System.out.println("输入待冻结账户的用户名：");
            String name = in.next();
            boolean s = msi.FreezingAccounts(name);
            if(s)
            {
                System.out.println("冻结成功");
            } else{
                System.out.println("冻结失败");
            }
        } else if (i == 4) {
            // 4.查看用户列表
            msi.showUser();
        }else if(i == 5){
            //5.回到主界面
            return false;
        }else{
            System.out.println("非法输入，请重新输入：");
        }
        return true;
    }


    /*============================================用户界面==========================================*/

    public boolean interfaceUser(User user){
        CommonServiceImpl csi = new CommonServiceImpl();
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

//1.查看当前登录用户余额     2.存钱     3.取钱    4.转账    5.回到主界面
        if(i == 1)
        {
            //1.查看当前登录用户余额
            csi.CheckBalance(user.getUserName());
        }else if(i == 2)
        {
            //2.存钱
            System.out.println("输入存款金额：");
            int balance = in.nextInt();
            csi.Saving(user.getUserName(),balance);
        } else if (i ==3) {
            //3.取钱
            System.out.println("输入取款金额：");
            int balance = in.nextInt();
            csi.Withdraw(user.getUserName(),balance);
        } else if (i == 4) {
            //4.转账
            System.out.println("输入转账用户：");
            String HeName = in.next();
            System.out.println("输入转账金额：");
            int balance = in.nextInt();
            csi.Transfer(user.getUserName(),HeName,balance);
        }else if(i == 5){
            //5.回到主界面
            return false;
        }else{
            System.out.println("非法输入，请重新输入：");
        }
        return true;
    }
}


























