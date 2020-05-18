public class Main
{
    public static void main(String[] args)
    {
        int i = (int)'A';
        int j = 1;
        System.out.println( "\n================ АНГЛИЙСКИЙ АЛФАВИТ ========================");

        while (i <= 122)
        {
            if(i <= 90 || i >= 97) {
                System.out.print(0 == (j % 15) ? (char) i + " " + i + "\n" : (char) i + " " + i + "\t");
                j++;
            }
            i++;
        }

        System.out.println( "\n\n================ РУССКИЙ АЛФАВИТ ========================");
        i = (int)'А';
        while (i <= 1103)
        {
            System.out.print(0 == ((i - 1039) % 15) ? ((char) i + " " + i + "\n") : (char) i + " " + i + "\t");
            i++;
        }
    }
}
