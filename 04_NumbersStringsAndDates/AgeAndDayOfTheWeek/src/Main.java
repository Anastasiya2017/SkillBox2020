import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        /*SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy - EEE", Locale.ENGLISH);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1993,6,26);
        System.out.println(calendar.getTime());
        for (int i = 0; i <= 26; i++) {
            System.out.println(i + " - " + sdf.format(calendar.getTime()));
            calendar.add(Calendar.YEAR, 1);
        }*/
        MyBirthday myBirthday = new MyBirthday();
        myBirthday.getBirthday();
    }
}
