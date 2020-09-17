abstract class Dog {
    public String breed;
    public String name;
    public char gender;

    public Dog(String name, String breed, char gender)
    {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
    }
    public void display()
    {
        System.out.println("Имя: " + name + "\n" + "Порода: " + breed + "\n" + "Пол: " + gender);
    }
}
