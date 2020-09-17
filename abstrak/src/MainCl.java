public class MainCl {
    public static void main(String[] args) {
        Spoon tea = new Spoon("Ложка", "Чайная");
        tea.displayInfo();
        System.out.println();
        Pan pan = new Pan("Кастрюля", 12f, "");
        pan.displayInfo();
        pan.setStatus("Пустая");
        pan.getStatus();
    }
}
