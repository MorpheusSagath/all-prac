import java.util.Scanner;

public class FurnitureShop {
    Table[] tables;
    Chair[] chairs;

    public FurnitureShop(Table[] tables, Chair[] chairs)
    {
        this.tables = tables;
        this.chairs = chairs;
    }
    public void mainMenu(){
        System.out.println("Вещи в магазине:\n" + "Столы [1]\nCтулья [2]\n\nВыход [0]");
    }
/*    public void showTables(){
        for(int i = 0; i< tables.length; i++)
        {
            System.out.println(tables[i] + "\n" + "[" + (i + 1) + "]");
        }
        System.out.println("\n" + "Выход[0]\n");
    }
    public void showChairs(){
        for(int i = 0; i< chairs.length; i++)
        {
            System.out.println(chairs[i]);
        }
    }*/
    public void ShowObject(int type)
    {
        Scanner in = new Scanner(System.in);
        Furniture[] obj = new Furniture[0];
        switch (type) {
            case 1:
                obj = tables;
                break;
            case 2:
                obj = chairs;
                break;
        }

        for (int i = 0; i < obj.length; i++)
        {
            System.out.println(obj[i] + "\n" + "[" + (i + 1) + "]");
        }
        System.out.println("\n" + "Выход[0]\n");

        int num = in.nextInt();
        if (num == 0) return;
        num--;
        if (num >= obj.length)
        {
            System.out.println("Ошибка ввода");
            return;
        }
        System.out.println("Вы купили " + obj[num].name );
        System.out.println("Стоимость: " + obj[num].cost );
        System.out.println("***** Спасибо за покупку *****\n\n");
    }
}
