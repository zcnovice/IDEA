package ATM.test;

import ATM.entity.User;
import ATM.service.Impl.ManagerServiceImpl;

public class Test {

    public void Test1()
    {
        ManagerServiceImpl msi = new ManagerServiceImpl();


        User admin1 = new User("周豪","zh.10086",0);
        User admin2 = new User("芮佳楠","rjn.10086",0);

        User user1 = new User("张三","ssow.3489920",1,1);
        User user2 = new User("李四","www.qq.com",1,1);

        User user3 = new User("李四","www.qq.com",1,1);
        User user5 = new User("网二","www.qq.com",1,1);
        User user6 = new User("小狗","www.qq.com",1,0);
        User user7 = new User("旺财","www.qq.com",1,1);

        msi.addUser(user5);
        msi.addUser(user6);
        msi.addUser(user7);

        boolean s = msi.addUser(user2);
        //System.out.println(s);

        boolean s2 = msi.addUser(user3);
        //System.out.println(s2);

        boolean s3 = msi.addUser(user1);
        //System.out.println(s3);
        boolean s4 = msi.addUser(admin1);
        boolean s5 = msi.addUser(admin2);

        boolean d1 = msi.deleteUser("李四");
        //System.out.println(d1);

        boolean d2 = msi.deleteUser("李一");
        //System.out.println(d2);

        msi.FreezingAccounts("张三");
        msi.showUser();
    }
}
