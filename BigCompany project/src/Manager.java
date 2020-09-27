import java.util.Random;

public class Manager implements EmployeePosition{
    final Random random = new Random();
    public String getJobTitle()
    {
        return "Manager";
    }
    public double calcSalary(double baseSalary)
    {
        return (random.nextInt(25000) + 115000) * 0.05 + baseSalary;
    }
}
