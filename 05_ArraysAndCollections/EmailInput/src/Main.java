import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static TreeSet<String> listEmail = new TreeSet<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Введите E-mail: ");
            Scanner in = new Scanner(System.in);
            String[] command = in.nextLine().split("\\s+", 2);
            caseCommand(command);
        }
    }

    private static void caseCommand(String[] command) {
        switch (command[0]) {
            case ("ADD"):
                addEmail(command[1]);
                break;
            case ("LIST"):
                getListEmail();
                break;
            default:
                messageError("неверный формат.\nДля добавления: ADD email.com \n" +
                        "Для вывода всех email-ов: LIST ");
        }
    }

    private static boolean validationEmail(String email) {
        Pattern ptrn = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = ptrn.matcher(email);
        return matcher.find();
    }

    private static void addEmail(String email) {
        if (validationEmail(email) && !listEmail.contains(email)) {
            listEmail.add(email);
        } else {
            if (listEmail.contains(email)) {
                messageError("данный Email уже существует");
            } else {
                messageError("неверно введен Email");
            }
        }
    }

    private static void messageError(String error) {
        System.out.println("Повторите ввод команды. Ошибка: " + error);
    }

    private static void getListEmail() {
        Iterator<String> iterator = listEmail.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
