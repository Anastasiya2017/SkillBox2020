import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите Фамилию Имя Отчество:");
            String fullName = in.nextLine();
            System.out.println(checkoutFullName(fullName));
        }
    }

    public static String checkoutFullName(String str) {
        Pattern p = Pattern.compile("^\\s*([а-яА-ЯЁё]+)\\s+([а-яА-ЯЁё]+)\\s+([а-яА-ЯЁё]+)\\s*$");
        Matcher m = p.matcher(str);
        if (m.find())
        {
            System.out.println("Фамилия:\t" + m.group(1));
            System.out.println("Имя:\t\t" + m.group(2));
            System.out.println("Отчество:\t" + m.group(3));
            return "Данные введены корректно!";
        }
        else {
            return ((char) 27 + "[33mНеверно введены данные!"+ (char)27 + "[0m");
        }
    }
}