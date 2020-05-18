package bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DepositAccount depositAccount = new DepositAccount();
        CardAccount cardAccount = new CardAccount();
        while (true) {
            System.out.println("___________________________________");
            System.out.println("Какую операцию вы хотите выполнить: \n" +
                    "ADD - для пополнения\n" +
                    "PUT - для вывода средств\n" +
                    "BAL - для проверки баланса");
            Scanner in = new Scanner(System.in);
            String command = in.nextLine();
            switch (command) {
                case ("ADD"):
                    System.out.println("Введите цифру счета, который хотите пополнить:\n" +
                            "1: депозитарный счёт\n" +
                            "2: карточный счёт");
                    int accountNum = in.nextInt();
                    switch (accountNum) {
                        case (1):
                            System.out.println("Введите сумму для пополнения: ");
                            double amount = in.nextInt();
                            depositAccount.replenish(amount);
                            break;
                        case (2):
                            System.out.println("Введите сумму для пополнения: ");
                            amount = in.nextInt();
                            cardAccount.replenish(amount);
                            break;
                        default:
                            System.out.println("Введите 1 или 2");
                            break;
                    }
                    break;
                case ("PUT"):
                    System.out.println("Введите цифру счета, с которого планируете снять деньги\n" +
                            "1: депозитарный счёт\n" +
                            "2: карточный счёт");
                    accountNum = in.nextInt();
                    switch (accountNum) {
                        case (1):
                            System.out.println("Введите сумму для снятия: ");
                            double amount = in.nextInt();
                            depositAccount.withdraw(amount);
                            break;
                        case (2):
                            System.out.println("Введите сумму для снятия: ");
                            amount = in.nextInt();
                            cardAccount.withdraw(amount);
                            break;
                        default:
                            System.out.println("Введите 1 или 2");
                            break;
                    }
                    break;
                case ("BAL"):
                    System.out.println("депозитарный счёт: " + depositAccount.getMoney() +
                            "\nкарточный счёт:\t" + cardAccount.getMoney()
                    );
                    break;
                default:
                    System.out.println("Вы ввели неверную команду");
                    break;
            }
        }
    }
}