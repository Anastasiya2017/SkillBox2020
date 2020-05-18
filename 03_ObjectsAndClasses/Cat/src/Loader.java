
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Cat asya = new Cat();
        Cat mulya = new Cat();
        Cat milka = new Cat();
        Cat sonya = new Cat();
        Cat basya = new Cat();
        Cat marusya = new Cat();

        System.out.println("Вес кошки asya = " + asya.getWeight());

        System.out.println("Вес кошки mulya = " + mulya.getWeight());
        mulya.feed(123.200);
        System.out.println("Вес кошки mulya после еды = " + mulya.getWeight());

        System.out.println("Вес кошки milka = " + milka.getWeight());

        System.out.println("Вес кошки sonya = " + sonya.getWeight());
        sonya.feed(650.500);
        System.out.println("Вес кошки sonya после еды = " + sonya.getWeight());

        System.out.println("Вес кошки basya = " + basya.getWeight());
        while (!basya.getStatus().equals("Exploded")) {
            basya.feed(100.00);
        }
        System.out.println(basya.getWeight());
        System.out.println("Состояние кошки basya: " + basya.getStatus());

        System.out.println("Вес кошки marusya = " + marusya.getWeight());
        while (!marusya.getStatus().equals("Dead")) {
            marusya.meow();
        }
        System.out.println("Состояние кошки marusya: " + marusya.getStatus());

        System.out.println(cat.getStatus());

        /*урок 2*/
        System.out.println("============ урок 2 =================");
        Cat tishka = new Cat();
        tishka.feed(150.00);
        for (int i = 0; i < 5; i++) {
            tishka.pee();
        }
        System.out.println("Масса съеденого корма котом tishka = " + tishka.getFoodWeight());

        /*урок 3*/
        System.out.println("============ урок 3 =================");
        System.out.println("Количество кошек = " + Cat.getCount());

        /*создание котенка*/
        Cat kitten = getKitten();
        System.out.println("Вес котенка = " + kitten.getWeight());
        System.out.println("Окрас котенка = " + kitten.getColorCat());

        /*проверка копирования кошки*/
        Cat kitten2 = kitten.copy();
        System.out.println("Вес котенка = " + kitten2.getWeight());
    }

    private static Cat getKitten(){
        return new Cat(11000.00);
    }
}