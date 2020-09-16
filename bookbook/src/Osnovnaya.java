public class Osnovnaya {
    public static void main(String[] args) {
        Book a = new Book();
        a.author = "K. Golden";
        a.name = "World of Warcraft: Arthas. Rise of the Lich King";
        a.numPages = 414;
        String s = a.author + "\n" + a.name + "\n" + a.numPages;
        System.out.print(s);
    }
}
