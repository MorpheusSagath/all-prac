public class MainCl {
    public static void main(String[] args) {
        Table table1 = new Table("Стол <<Обожрешься>>", "дерево",
                1900f, 1200, 800, 800);
        //System.out.println(table1);
        Table table2 = new Table("Стол <<Мое величие>>", "лдсп",
                2199.9f, 1100, 1100, 750);
        /*System.out.println(table1);
        System.out.println();
        System.out.println(table2);*/
        Table[] tables = new Table[]{table1, table2};
        Chair chair1 = new Chair("Стул <<Седушка>>", "пластик", 649.99f);
        Chair chair2 = new Chair("Стул <<Сиди и не дергайся>>", "дерево", 999f);
        Chair chair3 = new Chair("Стул <<Игроман>>", "пластик, искусственная кожа", 14895.99f);
        Chair[] chairs = new Chair[]{chair1, chair2, chair3};
    }
}
