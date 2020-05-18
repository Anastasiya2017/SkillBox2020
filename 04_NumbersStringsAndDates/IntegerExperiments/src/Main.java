import static java.lang.Character.digit;

public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        System.out.println(sumDigits(container.count));

    }

    public static Integer sumDigits(Integer number)
    {
        Integer sumNumber = 0;
        for (int i = 0; i < number.toString().length(); i++)
        {
            /*задание со * с использованием метода digit() из класса Character*/
//            sumNumber += digit(number.toString().charAt(i), 10);
            sumNumber += Integer.parseInt(String.valueOf(number.toString().charAt(i)));
        }
        return sumNumber;
    }
}
