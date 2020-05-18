
public class Cat
{
    public static final int EYES_COUNT = 2;
    public static final double MIN_WEIGHT = 1000.00;
    public static final double MAX_WEIGHT = 9000.00;

    private double originWeight;
    private double weight;

    private double foodWeight;

    static int count;

    private ColorCat colorCat;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        colorCat = ColorCat.CAMEO;
        count++;

    }

    public Cat(double weight){
        this();
        this.weight = weight;
        this.originWeight = weight;
    }

    public Cat(double weight, double originWeight, double foodWeight, ColorCat colorCat){
        this();
        this.weight = weight;
        this.originWeight = originWeight;
        this.foodWeight = foodWeight;
        this.colorCat = colorCat;
    }

    public void meow()
    {
        if (isAlive())
        {
            weight -= 1;

            if (!isAlive()) {
                count--;
            }
        }
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        if (isAlive())
        {
            weight += amount;
            foodWeight += amount;

            if (!isAlive()) {
                count--;
            }
        }
        else {
            System.out.println("Кошка мертва, ее нельзя кормить!");
        }
    }

    public void drink(Double amount)
    {
        if (isAlive())
        {
            weight += amount;
            foodWeight += amount;

            if (!isAlive()) {
                count--;
            }
        }
        else {
            System.out.println("Кошка мертва, её нельзя поить!");
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public Double getFoodWeight()
    {
        return foodWeight;
    }

    public void pee()
    {
        if(isAlive())
        {
            weight -= 10.00 ;
            if (!isAlive()) {
                count--;
            }
        }
        else {
            System.out.println("Кошка мертва, ей не сходить в туалет!");
        }
    }

    static int getCount()
    {
        return count;
    }

    public boolean isAlive() {
        return weight >= MIN_WEIGHT && weight <= MAX_WEIGHT;
    }

    public Cat copy()
    {
        return new Cat(this.getWeight(), this.getOriginWeight(), this.getFoodWeight(), this.getColorCat());
    }

    public ColorCat getColorCat() {
        return colorCat;
    }

    public double getOriginWeight() {
        return originWeight;
    }
}