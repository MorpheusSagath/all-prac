abstract class Furniture {
    public float cost;
    public String material;
    public String name;

    public Furniture(String name, String material, float cost)
    {
        this.name = name;
        this.material = material;
        this.cost = cost;
    }

    public String toString() {
        return "Название: " + name + "\n" +
                "Материал: " + material + "\n" +
                "Стоимость: " + cost;
    }
}
