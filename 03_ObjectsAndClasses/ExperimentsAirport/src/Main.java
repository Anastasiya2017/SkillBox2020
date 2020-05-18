import com.skillbox.airport.Airport;

public class Main
{
    public static void main(String[] args)
    {
        Airport airport = Airport.getInstance();
        System.out.println("Число самолётов в аэропорту = " + airport.getAllAircrafts().size());
    }
}