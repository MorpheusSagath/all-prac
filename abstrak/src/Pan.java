public class Pan extends Dish{
    public float height;
    public String status;
    public String manufacturer;

    public Pan(String type,float height, String manufacturer)
    {
        super(type);
        this.height = height;
        this.manufacturer = manufacturer;
        status = "Неизвестно";
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public void getStatus()
    {
        System.out.println("Статус кастрюли: " + status);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Производитель: " + manufacturer + "\n" + "Высота кастрюли: " + height);
    }
}
