public class MainClDog {
    public static void main(String[] args) {
        nemecOvcharka nemka = new nemecOvcharka("Danny", "Немацкая овчарка",'m' , 31f, 5);
        nemka.display();
        nemka.aging();
        System.out.println();
        nemka.getAge();
        System.out.println();


        Dachshund dachshund = new Dachshund("Sweety", "Такса", 'f', 60.8f);
        dachshund.display();
        dachshund.setLengthDog(67.2f);
        System.out.println();
        System.out.println("Длина " + dachshund.name + ": " + dachshund.getLengthDog());
    }
}
