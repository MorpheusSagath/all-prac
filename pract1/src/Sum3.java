public class Sum3 {
    public static void main(String[] args) {
        int[] mass = {1, 1, 2, 7, 8, 4, 6, 0, 0, 3};
        int suFor = 0, suWhile = 0, suDoWh = 0;
        int i = 0;
        for (i = 0; i<10;i++)
        {
            suFor += mass[i];
        }
        i = 0;
        while (i < 10)
        {
            suWhile += mass[i];
            i += 1;
        }
        i = 0;
        do {
            suDoWh +=mass[i];
            i+=1;
        } while (i < 10);
        System.out.println(suFor);
        System.out.println(suWhile);
        System.out.println(suDoWh);
    }
}
