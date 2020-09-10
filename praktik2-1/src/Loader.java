public class Loader {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setLenCircus(17);
        circle1.setColor("Красный");
        System.out.println(circle1);
        System.out.println();
        Circle circle2 = new Circle();
        circle2.setRadius(6);
        circle2.setColor("Белый");
        System.out.println(circle2);
    }
}
