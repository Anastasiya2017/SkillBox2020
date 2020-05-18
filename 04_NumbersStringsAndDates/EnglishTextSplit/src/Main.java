public class Main
{
    public static void main(String[] args)
    {
        String text = "Many years ago, there lived a rich man who wished to do something for the people at his village.\n" +
                " First however, he wanted to find out whether they deserved his help.\n" +
                " In the center of the main road into the village, he placed a very large stone.\n" +
                " Then he hid nearby and waited to see what would happen.\n" +
                " Soon an old farmer passed with his cow.\n" +
                "\n" +
                "-‘’What fool put this big stone right in the center of the road?’\n" +
                "’  said the farmer \n" +
                " However, he made no effort to remove the stone \n" +
                " Instead, with some difficulty he passed around the stone and continued on his way \n" +
                " Another man came along, and the same thing happened \n" +
                " then another came, and another, etc \n" +
                " All of them complained about the stone in the center of the road, but neither of them spent time or took trouble to remove it\n" +
                "\n" +
                "Towards evening, a young man came along.\n" +
                " He was honest and hard working.\n" +
                " He saw the stone and said to himself, \n" +
                "“The night will be dark.\n" +
                " Some stranger or a neighbour will come along in the dark, stumble on the stone, and perhaps hurt himself.”\n" +
                "\n" +
                "The young man began to remove the stone.\n" +
                " He pushed and pulled with all his strength, and moved it to one side.\n" +
                " But imagine his surprise when under the stone, he found a bag full of money and this message:\n" +
                " This money is for the thoughtful person who removes this stone from the road.\n" +
                " That person 234 deserves help!”";
        String[] words = text.split("\\s+|\\W+");
        for (int i = 1; i < words.length; i++)
        {
            System.out.println(words[i]);
        }
        System.out.println("Всего слов: " + words.length);
    }
}