import java.nio.file.LinkPermission;
import java.util.Scanner;

public class MainClNode {
    public static void main(String[] args) {
        Action act1 = new Action("create_object");
        Action act2 = new Action("add_library");
        Action act3 = new Action("restart");
        Action act4 = new Action("test");
        Action act5 = new Action("deploy");
        Action act6 = new Action("drop_bd");
        Action[] actions = {act1, act2, act3, act4, act5, act6};
        act1.setNextActions(act2, act5,1, 2);
        act2.setNextActions(act3, act4, 4, 6);
        act3.setNextActions(act4, act5, 6, 2);
        act4.setNextActions(act3, act5, 3, 5);
        act5.setNextActions(act1, act3, 5, 3);

        Scanner scanner = new Scanner(System.in);
        Action head = act1;
        while (true)
        {
            String tryInput = scanner.nextLine();
            try
            {
                int input = Integer.parseInt(tryInput);
                if (input == -1)
                {
                    break;
                }
                else if (input == 0 || input == 1) {
                    if (input == 0)
                    {
                        System.out.println(actions[head.getNumNameAct0() - 1].getNameAction());
                        head = head.getNextAction0();
                    }
                    else
                    {
                        System.out.println(actions[head.getNumNameAct1() - 1].getNameAction());
                        head = head.getNextAction1();
                    }
                }
                else
                {
                    System.out.println("Не буду работать. Число не в моей зоне действия.");
                }
            }
            catch (Exception ex)
            {
                System.out.println("Вводи число э. Притом целое.");
            }
        }
    }
}
