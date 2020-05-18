package bank;

public class CardAccount extends SettlementAccount {
    public CardAccount() {
    }

    @Override
    public void withdraw(double withdrawMoney) {
        super.withdraw(withdrawMoney + withdrawMoney * 0.01);
    }
}
