abstract class Dish {
    public String type;
    //public float size;

    public Dish(String type)
    {
        this.type = type;
        //this.size = size;
    }
    public void displayInfo()
    {
        System.out.println("Тип посуды: " + type);
    }
}
