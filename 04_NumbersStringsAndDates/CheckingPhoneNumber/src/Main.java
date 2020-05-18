import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер телефона: ");
            String phoneNumber = in.nextLine();
            phoneNumber = phoneNumber.replaceAll("\\W+", "");
            phoneNumber = phoneNumber.replaceAll("^7", "8");
            System.out.println("Ваш номер: " + phoneNumber.substring(0, 1) + " " +
                    phoneNumber.substring(1, 4) + " " + phoneNumber.substring(4));
        }
    }
}
