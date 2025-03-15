package ATM.service.Impl;

import ATM.DataUtils;
import ATM.entity.User;
import ATM.service.CommonService;

public class CommonServiceImpl implements CommonService {
    @Override
    public void CheckBalance(String name) {

        for(int i = 0;i<DataUtils.users.size();i++)
        {
            if(DataUtils.users.get(i).getUserName().equals(name))
            {
                System.out.println(DataUtils.users.get(i).getUserName()+"余额为："+ DataUtils.users.get(i).getBalance());
            }
        }
    }



    @Override
    public boolean Saving(String name,int balance) {
        for(int i = 0;i<DataUtils.users.size();i++)
        {
            if(DataUtils.users.get(i).getUserName().equals(name))
            {
                boolean s =  Check(DataUtils.users.get(i));//检查账户状态是否正常
                if(s)
                {
                    //账户状态正常
                    //存钱入对应账户
                    int total = DataUtils.users.get(i).getBalance()+balance;
                    DataUtils.users.get(i).setBalance(total);
                    System.out.println(DataUtils.users.get(i).getUserName()+"当前余额为："+ DataUtils.users.get(i).getBalance());
                    return true;
                }else{
                    System.out.println("账户状态异常");
                    return false;
                }

            }
        }
        return false;
    }

    @Override
    public boolean Withdraw(String name,int balance) {
        for(int i = 0;i<DataUtils.users.size();i++)
        {
            if(DataUtils.users.get(i).getUserName().equals(name))
            {//判断账户是否有钱
                boolean s =  Check(DataUtils.users.get(i));//检查账户状态是否正常
                if(s)
                {
                    if(DataUtils.users.get(i).getBalance() > 0){
                        //从对应账户取钱
                        int total = DataUtils.users.get(i).getBalance()-balance;
                        if(total > 0)
                        {
                            //取款金额是否大于账户剩余金额
                            DataUtils.users.get(i).setBalance(total);
                            System.out.println(DataUtils.users.get(i).getUserName()+"当前余额为："+ DataUtils.users.get(i).getBalance());
                            return true;
                        }
                        else{
                            //账户金额不足，要把减去的钱加回去
                            total = DataUtils.users.get(i).getBalance()+balance;
                            DataUtils.users.get(i).setBalance(total);
                            System.out.println("取款失败账户余额不足");
                            return false;
                        }
                    }
                }else{
                    System.out.println("账户状态异常");
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public boolean Transfer(String MyName, String HeName,int balance) {
        for(int i = 0;i<DataUtils.users.size();i++)
        {
            if(DataUtils.users.get(i).getUserName().equals(MyName))
            {//判断我的账户是否有钱

                boolean s =  Check(DataUtils.users.get(i));//检查我的账户状态是否正常
                //TODO
                //两个人的账户都要检查是否冻结
                boolean s1 = Check_U(HeName);

                if(s && s1)
                {
                    if(DataUtils.users.get(i).getBalance() > 0){
                        //从对应账户取钱
                        int total = DataUtils.users.get(i).getBalance()-balance;
                        if(total > 0)
                        {
                            //转账
                            DataUtils.users.get(i).setBalance(total);
                            Saving(HeName,balance);
                        }
                        else{
                            //账户金额不足，要把减去的钱加回去
                            total = DataUtils.users.get(i).getBalance()+balance;
                            DataUtils.users.get(i).setBalance(total);
                            System.out.println("取款失败账户余额不足");
                            return false;
                        }
                    }
                }else{
                    System.out.println("账户状态异常");
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public boolean Check(User user) {
        if(user.getState() == 1)
        {
            return  true;
        }
        return false;
    }

    @Override
    public boolean Check_U(String name) {
        //传入name 判断账户信息是否正常
        for(int i = 0;i<DataUtils.users.size();i++)
        {
            if(DataUtils.users.get(i).getUserName().equals(name))
            {
                if(DataUtils.users.get(i).getState() == 1)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
