package bank;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends SettlementAccount {
    public DepositAccount() {
    }

    //    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//    public LocalDate dateLastDeposit = LocalDate.parse("05.05.2013", formatter);
    public LocalDate dateLastDeposit = null;

    @Override
    public void replenish(double money) {
        super.replenish(money);
        dateLastDeposit = LocalDate.now();
    }

    @Override
    public void withdraw(double withdrawMoney) {
        if (dateLastDeposit != null) {
            LocalDate dateNow = LocalDate.now();
            long monthsNum = ChronoUnit.MONTHS.between(dateLastDeposit, dateNow);

            if (monthsNum >= 1) {
                super.withdraw(withdrawMoney);
            } else {
                System.out.println("Вы можете снять деньги только через месяц после последнего пополнения" +
                        "(" + dateLastDeposit.plusMonths(1) + ")");
            }
        } else {
            System.out.println("счёт не был ни разу пополнен, снятие невозможно");
        }
    }
}
