import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Main {
    final static int COUNT_PATIENT = 30;
    final static int MIN_TEMPERATURE = 32;
    final static int MAX_TEMPERATURE = 40;
    final static double MIN_HEALTHY_TEMPERATURE = 36.2;
    final static double MAX_HEALTHY_TEMPERATURE = 39.9;

    public static void main(String[] args) {
        double[] temperaturePatients = new double[COUNT_PATIENT];
        System.out.println("\nТемпература " + COUNT_PATIENT + " пациентов в больнице: ");
        for (int i = 0; i < temperaturePatients.length; i++) {
            temperaturePatients[i] = (MIN_TEMPERATURE + Math.random() * (MAX_TEMPERATURE - MIN_TEMPERATURE));
            System.out.print(temperaturePatients[i] + "\t");
        }
        System.out.println("\n\nСредняя температура пациентов: " + getAveragePatientTemperature(temperaturePatients) + "%");
        System.out.println("\nКолличество здоровых пациентов: " + countHealthyPatients(temperaturePatients));
    }

    private static int countHealthyPatients(double[] temperaturePatients) {
        DoubleStream stream = Arrays.stream(temperaturePatients);
        return (int) stream.filter(x -> x < MAX_HEALTHY_TEMPERATURE && x > MIN_HEALTHY_TEMPERATURE).count();
    }

    private static double getAveragePatientTemperature(double[] temperaturePatients) {
        DoubleStream stream = Arrays.stream(temperaturePatients);
        return stream.average().orElse(0);
    }
}