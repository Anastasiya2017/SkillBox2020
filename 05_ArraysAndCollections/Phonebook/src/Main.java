import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>();
        System.out.println("Телефонная книга");
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println("__________________________________________________");
            System.out.println("Введите номер телефона, имя или получите все данные введя LIST:");
            String command = scanner.nextLine();
            if (command.equals("LIST")) {
                printMap(phoneBook);
                continue;
            }
            if (phoneBook.containsKey(command)) {
                System.out.println(command + "=" + phoneBook.get(command));
                continue;
            }
            if (phoneBook.containsValue(command)) {
                phoneBook
                        .entrySet()
                        .stream()
                        .filter(entry -> command.equals(entry.getValue()))
                        .forEach(System.out::println);
            } else {
                if (command.matches("^[A-Za-z]+")) {
                    String phone = "";
                    do {
                        System.out.println("Добавьте номер телефона: ");
                        phone = scanner.nextLine();
                        if (phone.matches("^[+]*[0-9]+$")) {
                            phoneBook.put(command, phone);
                        } else {
                            messageError("Неверный формат телефона");
                        }
                    } while (!phone.matches("^[+]*[0-9]+$"));
                } else if (command.matches("^[+]*[0-9]+$")) {
                    String name = "";
                    do {
                        System.out.println("Добавьте имя: ");
                        name = scanner.nextLine();
                        if (name.matches("^[A-Za-z]+")) {
                            phoneBook.put(name, command);
                        } else {
                            messageError("Неверный формат имени");
                        }
                    } while (!name.matches("^[A-Za-z]+"));
                } else {
                    messageError("Неверный формат");
                }
            }
        }
    }

    private static void messageError(String error) {
        System.out.println("Повторите ввод. " + error);
    }

    private static void printMap(TreeMap<String, String> phoneBook) {
        phoneBook.entrySet().forEach(System.out::println);
    }
}