import java.util.Scanner;
public class MainCl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Table table1 = new Table("Стол <<Обожрешься>>", "дерево",
                1900f, 1200, 800, 800);
        //System.out.println(table1);
        Table table2 = new Table("Стол <<Мое величие>>", "лдсп",
                2199.9f, 1100, 1100, 750);
        /*System.out.println(table1);
        System.out.println();
        System.out.println(table2);*/
        Table[] tables = new Table[]{table1, table2};
        Chair chair1 = new Chair("Стул <<Сидушка>>", "пластик", 649.99f);
        Chair chair2 = new Chair("Стул <<Сиди и не дергайся>>", "дерево", 999f);
        Chair chair3 = new Chair("Стул <<Игроман>>", "пластик, искусственная кожа", 14895.99f);
        Chair[] chairs = new Chair[]{chair1, chair2, chair3};
        FurnitureShop furnitureShop = new FurnitureShop(tables, chairs);
        while (true)
        {
            furnitureShop.mainMenu();
            int cmd = in.nextInt();
            if (cmd == 0)
                return;
            switch (cmd){
                case 1:
                    furnitureShop.ShowObject(1);
                    break;
                case 2:
                    furnitureShop.ShowObject(2);
                    break;
            }

        }
    }
    static void buy(int type)
    {

    }
}
