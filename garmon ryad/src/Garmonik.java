public class Garmonik {
    public static void main(String[] args) {
        float suGarmon = 0;
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%.2f", 1.0/i);
            System.out.println();
            suGarmon += 1.0/i;
        }
        System.out.println();
        System.out.println("Summa = ");
        System.out.printf("%.2f", suGarmon);
    }
}
