import java.util.Random;

public class RandnSort {
    public static void main(String[] args) {

        int[] mas = new int[10];
        for (int i = 0; i < 10; i++)
        {
            mas[i] = (int) (Math.random() * 100);
        }
        String s = "";
        for (int i = 0; i < 10; i++)
        {
            s += mas[i] + " ";
        }
        System.out.println("Первый метод (через Math)");
        System.out.println(s);
        for (int i = 9 ; i > 0 ; i--)
        {
            for (int j = 0 ; j < i ; j++)
            {
                if (mas[j] > mas[j+1] ){
                    int temp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = temp;
                }
            }
        }
        s = "";
        for (int i = 0; i < 10; i++)
        {
            s += mas[i] + " ";
        }
        System.out.println(s);
        s = "";
        // 2 часть aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        byte[] mas2 = new byte[10];
        final Random random = new Random();
        random.nextBytes(mas2);
        for (int i = 0; i < 10; i++)
        {
            s += mas2[i] + " ";
        }
        System.out.println("Второй метод (через Random)");
        System.out.println(s);
        for (int i = 9 ; i > 0 ; i--)
        {
            for (int j = 0 ; j < i ; j++)
            {
                if (mas2[j] > mas2[j+1] ){
                    byte temp = mas2[j];
                    mas2[j] = mas2[j+1];
                    mas2[j+1] = temp;
                }
            }
        }
        s = "";
        for (int i = 0; i < 10; i++)
        {
            s += mas2[i] + " ";
        }
        System.out.println(s);
    }
}
