import java.util.Scanner;

public class Main
{
    static final int CONTAINERS_IN_TRUCK = 12;
    static final int BOXES_IN_CONTAINER = 27;

    public static void main(String[] args)
    {
        System.out.print("Введите число ящиков: ");
        Scanner in = new Scanner(System.in);
        double countBox = in.nextInt();
        double countContainer = Math.ceil(countBox / BOXES_IN_CONTAINER);

        double countTruck = Math.ceil(countContainer / CONTAINERS_IN_TRUCK);

        int container = 0, box = 0;
        for ( int i = 1; i <= countTruck; i++)
        {
            System.out.println("\tГрузовик " + i);
            for (int j = 1; j <= CONTAINERS_IN_TRUCK; j++)
            {
                if(countContainer-- > 0) {
                    System.out.println("\t\tКонтейнер " + ++container);
                    for (int k = 1; k <= BOXES_IN_CONTAINER; ++k) {
                        if(countBox-- > 0) {
                            System.out.println("\t\t\tЯщик " + ++box);
                        }
                    }
                }
            }
        }
    }
}
