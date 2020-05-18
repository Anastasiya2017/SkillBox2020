import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MyBirthday {
    public void getBirthday() {
        LocalDate birthday = LocalDate.of(1993, 7, 26);
        LocalDate today = birthday;
        DateTimeFormatter printFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE", new Locale("English"));

        for (int i = 0; i <= 26; i++) {
            Period numberOfYears = Period.between(birthday,today);
            System.out.println(numberOfYears.getYears() + " - " + today.format(printFormat));
            today = today.plusYears(1);
        }
    }



}
