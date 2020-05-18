import java.util.*;

public class Main {
    public static void main(String[] args) {
        //АВЕКМНОРСТУХ
        //А777ОР134 01-199
        ArrayList<String> list = generateNumber();
//        System.out.println(list.get(list.size()/2));
        System.out.println("Введите номер для поиска: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        //поиск прямым перебором по ArrayList
        searchNumberBruteForce(list, number);

        //бинарный поиск по сортированному ArrayList
        searchNumberBinary(list, number);

        //поиск в HashSet
        HashSet<String> set = new HashSet<>(list);
        searchNumberHashSet(set, number);

        //поиск в TreeSet
        TreeSet<String> treeSet = new TreeSet<>(list);
        searchNumberTreeSet(treeSet, number);
    }

    private static void searchNumberBinary(ArrayList<String> list, String number) {
        list.sort(String::compareTo);
        long start = System.nanoTime();
        int numberExist = Collections.binarySearch(list, number);
        long time = System.nanoTime() - start;
        System.out.println("Бинарный поиск:\t\t номер " + number + (numberExist >= 0 ? " найден " : " не найден \t\t") + " поиск занял: " + time + "нс");

    }

    private static void searchNumberTreeSet(TreeSet<String> list, String number) {
        long start = System.nanoTime();
        boolean numberExist = list.contains(number);
        long time = System.nanoTime() - start;
        System.out.println("Поиск в TreeSet:\t номер " + number + (numberExist ? " найден " : " не найден \t") + " поиск занял: " + time + "нс");
    }

    private static void searchNumberHashSet(HashSet<String> list, String number) {
        long start = System.nanoTime();
        boolean numberExist = list.contains(number);
        long time = System.nanoTime() - start;
        System.out.println("Поиск в HashSet:\t номер " + number + (numberExist ? " найден " : " не найден \t") + " поиск занял: " + time + "нс");
    }

    private static void searchNumberBruteForce(ArrayList<String> list, String number) {
        long start = System.nanoTime();
        boolean numberExist = list.contains(number);
        long time = System.nanoTime() - start;
        System.out.println("Поиск перебором:\t номер " + number + (numberExist ? " найден " : " не найден \t\t") + " поиск занял: " + time + "нс");
    }

    private static ArrayList<String> generateNumber() {
        ArrayList<String> numbers = new ArrayList<>();
        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        for (int i = 1; i <= 9; i++) {
            String numeral = String.format("%1$s%1$s%1$s", i);
            for (int j = 1; j <= 199; j++) {
                String code;
                    code =  String.format("%02d", j);
                for (String l1 : letters) {
                    for (String l2 : letters) {
                        for (String l3 : letters) {
                            String letters2 = l2 + l3;
                            numbers.add(l1 + numeral + letters2 + code);
//                            System.out.println(" : " + l1 + "_" + numeral  + "_" + letters2 + "_" + code);
                        }
                    }
                }
            }
        }
        return numbers;
    }
}