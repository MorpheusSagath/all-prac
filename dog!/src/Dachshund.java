public class Dachshund extends Dog{
    public float lengthDog;

    public Dachshund(String name, String breed, char gender, float lengthDog)
    {
        super(name, breed, gender);
        this.lengthDog = lengthDog;
    }

    public void setLengthDog(float lengthDog) {
        this.lengthDog = lengthDog;
    }

    public float getLengthDog() {
        return lengthDog;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Длина: " + lengthDog);
    }
}
