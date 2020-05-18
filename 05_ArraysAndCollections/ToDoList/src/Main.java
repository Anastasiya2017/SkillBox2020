import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    static ArrayList<String> toDoList = new ArrayList<>();

    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Введите команду или ознакомьтесь с ними набрав: HELP");
            Scanner in = new Scanner(System.in);
            String comand = in.nextLine();
            String details = parseDetailsFromCommand(comand);
            int index = parseIndexFromCommand(comand);

            String[] detailsComand = comand.split("\\s+", 2);
            caseComand(detailsComand[0], details, index);
        }
    }

    private static int parseIndexFromCommand(String comand)
    {
        Pattern ptrn = Pattern.compile("^[A-Z]+\\s+(\\d+)");
        Matcher matcher = ptrn.matcher(comand);
        if (matcher.find())
        {
            return Integer.parseInt(matcher.group(1));
        }
        return -123;
    }

    private static String parseDetailsFromCommand(String comand)
    {
        Pattern ptrn = Pattern.compile("^[A-Z]+[\\s+]?[\\d+]?\\s+(.+)");
        Matcher matcher = ptrn.matcher(comand);
        if (matcher.find())
        {
            return matcher.group(1);
        }
        return null;
    }

    private static void caseComand(String comand, String details, int index)
    {
        switch (comand)
        {
            case ("HELP"):
                getToHelp();
                break;
            case ("LIST"):
                getToDoList();
                break;
            case ("ADD"):
                addToDoList(details, index);
                break;
            case ("EDIT"):
                editToDoList(details, index);
                break;
            case ("DELETE"):
                deleteToDoList(index);
                break;
            default:
                errorList();
                break;
        }
    }

    private static void getToHelp()
    {
        System.out.println(
                "===========================================================================\n" +
                        "Вы можете вызвать несколько команд: \n" +
                        "\tLIST\n" +
                        "\tADD TEXT(или ADD N TEXT)\n" +
                        "\tEDIT N TEXT\n" +
                        "\tDELETE N\n" +
                        "\tгде N - номер дела, TEXT - название дела\n" +
                        "===========================================================================");
    }

    public static void getToDoList()
    {
        for (int i = 0; i < toDoList.size(); i++)
        {
            System.out.println(i + 1 + ") " + toDoList.get(i));
        }
    }

    private static void addToDoList(String comand, int index)
    {
        if (index >= 0 && index <= toDoList.size() && comand.length() > 0)
        {
            toDoList.add(index, comand);
        } else if (comand.length() > 0)
        {
            toDoList.add(comand);
        } else
        {
            errorList();
        }
    }

    private static void editToDoList(String comand, int index)
    {
        if (comand.length() > 0 && index <= toDoList.size())
        {
            toDoList.set(index, comand);
        } else
        {
            errorList();
        }
    }

    private static void deleteToDoList(int index)
    {
        if (index <= toDoList.size())
        {
            toDoList.remove(index);
        } else
        {
            errorList();
        }
    }

    private static void errorList()
    {
        System.out.println("Вы ввели неверную команду.");
    }
}