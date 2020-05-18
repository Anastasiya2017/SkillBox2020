public class Main
{
    public static void main(String[] args)
    {
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] colors = text.split(",?\\s+");
        for (int i = 0; i < colors.length; i++)
        {
            System.out.print("[" + colors[i] + "]");
        }
        System.out.println();

        String bufColor;
        for (int i = 0; i < colors.length / 2; i++)
        {
            bufColor = colors[i];
            colors[i] = colors[colors.length - 1 - i];
            colors[colors.length - 1 - i] = bufColor;
        }

        for (int i = 0; i < colors.length; i++)
        {
            System.out.print("[" + colors[i] + "]");
        }
    }
}
