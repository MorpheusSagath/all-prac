public class MainClColor {
    public static void main(String[] args) {
        printColorText(EColors.WHITE, "какой-то белый текст");
        printColorText(EColors.BLUE, "какой-то СиНиЙ текст");
        printColorText(EColors.RED, "апасный");
        printColorText(EColors.GREEN, "ну зеленый и зеленый");
        printColorText(EColors.YELLOW, "да");
        printColorText(EColors.VIOLET, "нет");
        printColorText(EColors.GRAY, "цвет жизни в россии");
        //printColorText(EColors.HIGHLIGHTED_WHITE, "hFUESZXZS");
    }
    public static void printColorText(EColors color, String text)
    {
        System.out.println(color.getIdColor() + text + EColors.WHITE.getIdColor());
    }
}