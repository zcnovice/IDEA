package test2.entity.user;

public class VIPUser extends User{

    //累计消费金额(VIP才有消费金额统计)
    private int cumulativeSpending;
    //VIP等级
    private int VIPGrade;

    //TODO
    //VIP生日

    public VIPUser(String name, int age ,int cumulativeSpending) {
        super(name, age);
        this.cumulativeSpending = cumulativeSpending;
    }

    public int getCumulativeSpending() {
        return cumulativeSpending;
    }

    public void setCumulativeSpending(int cumulativeSpending) {
        this.cumulativeSpending = cumulativeSpending;
    }
}
