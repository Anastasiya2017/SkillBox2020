package bank;

public class SettlementAccount {
    private double money;

    public double getMoney() {
        return money;
    }

    public void replenish(double money) {
        this.money = money;
    }

    public void withdraw(double withdrawMoney) {
        if (withdrawMoney <= money) {
            this.money = money - withdrawMoney;
            System.out.println("снятие выполнено успешно");
        } else {
            System.out.println("недостаточно денежных средств");
        }
    }
}