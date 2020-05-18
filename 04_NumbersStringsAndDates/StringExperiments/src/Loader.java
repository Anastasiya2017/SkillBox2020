public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);
        sumSalary(text);
    }

    public static void sumSalary(String str)
    {
        int salary = 0;
        String[] numbers = str.split("\\D+");
        for(String number : numbers){
            if (!number.equals("")) {
                salary += Integer.parseInt(number.trim());
            }
        }
        System.out.println("Сумма заработка Васи, Пети и Маши: " + salary);
    }
}