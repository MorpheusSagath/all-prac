public class Faktor {
    public int number;
    public int fakt(int number)
    {
        if (number > 1)
        {
            return number * fakt(number-1);
        }
        else
        {
            return 1;
        }
    }
}
