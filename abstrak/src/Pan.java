public class Pan extends Dish{
    public float height;

    public Pan(String type,float height)
    {
        super(type);
        this.height = height;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Высота кастрюли: " + height);
    }
}
