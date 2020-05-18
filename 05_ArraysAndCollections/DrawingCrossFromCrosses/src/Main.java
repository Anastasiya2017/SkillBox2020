public class Main
{
    final static int SIZE_CROSS = 7;

    public static void main(String[] args)
    {
        String[][] cross = new String[SIZE_CROSS][SIZE_CROSS];
        for (int i = 0; i < SIZE_CROSS / 2 + 1; i++)
        {
            for (int j = 0; j < SIZE_CROSS; j++)
            {
                if (i == j || i + j == SIZE_CROSS - 1)
                {
                    cross[i][j] = "X";
                    cross[SIZE_CROSS - i - 1][j] = "X";
                } else
                {
                    cross[i][j] = " ";
                    cross[SIZE_CROSS - i - 1][j] = " ";
                }
            }
        }

        for (int i = 0; i < SIZE_CROSS; i++)
        {
            for (int j = 0; j < SIZE_CROSS; j++)
            {
                System.out.print(cross[i][j]);
            }
            System.out.println();
        }
    }
}
