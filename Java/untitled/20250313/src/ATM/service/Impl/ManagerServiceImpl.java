package ATM.service.Impl;

import ATM.DataUtils;
import ATM.entity.User;
import ATM.service.ManagerService;


public class ManagerServiceImpl implements ManagerService {
    @Override
    public boolean addUser(User user) {
        boolean s = NameQueryUser_b(user.getUserName());//s为true说明重名了
        if(s)
        {
            return false;//添加失败
        }else{
            DataUtils.users.add(user);
            return true;//添加成功
        }
    }

    @Override
    public boolean deleteUser(String userName) {
        User user = NameQueryUser_U(userName);
        if(user == null)
        {
            return false;//没有查询到待删除用户
        }
        else{
            DataUtils.users.remove(user);
            return true;//用户已删除
        }
    }

    @Override
    public boolean FreezingAccounts(String userName) {
        for(int i = 0;i<DataUtils.users.size();i++)
        {
            if(DataUtils.users.get(i).getUserName().equals(userName)) {
                DataUtils.users.get(i).setState(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public void showUser() {
        System.out.println("管理员：");
        for(int i = 0;i < DataUtils.users.size();i++)
        {
            if(DataUtils.users.get(i).getRole() == 0)//展示admin
            {
                System.out.println("管理员   用户名："+DataUtils.users.get(i).getUserName());
            }
        }

        System.out.println();
        System.out.println("用户：");
        for(int i = 0;i < DataUtils.users.size();i++)
        {
            if(DataUtils.users.get(i).getRole() == 1)//展示admin
            {
                if(DataUtils.users.get(i).getState() == 1)
                {
                    System.out.println("用户   用户名："+DataUtils.users.get(i).getUserName()+"    账户状态：正常"+"   用户余额："+DataUtils.users.get(i).getBalance());
                }else {
                    System.out.println("用户   用户名："+DataUtils.users.get(i).getUserName()+"    账户状态：冻结");
                }

            }
        }
    }

    @Override
    public boolean NameQueryUser_b(String name) {
        for(int i = 0;i<DataUtils.users.size();i++)
        {
            if(DataUtils.users.get(i).getUserName().equals(name))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public User NameQueryUser_U(String name) {
        for(int i = 0;i<DataUtils.users.size();i++)
        {
            if(DataUtils.users.get(i).getUserName().equals(name))
            {
                return DataUtils.users.get(i);
            }
        }
        return null;//未查询到返回空
    }
}
