public class Spoon extends Dish{
    public String typeSpoon;

    public Spoon(String type, String typeSpoon)
    {
        super(type);
        this.typeSpoon = typeSpoon;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип ложки: " + typeSpoon);
    }
}
