public class nemecOvcharka extends Dog{
    public float weight;
    public int age;
    public nemecOvcharka(String name, String breed, char gender,float weight, int age)
    {
        super(name, breed, gender);
        this.weight = weight;
        this.age = age;
    }
    public void aging()
    {
        age += 1;
    }

    public void getAge()
    {
        System.out.println("Возраст " + name + ": " + age);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Возраст: " + age + "\n" + "Вес: " + weight);
    }
}
