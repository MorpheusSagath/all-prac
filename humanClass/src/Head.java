public class Head {
    public String colorHair;
    public String colorEyes;

    public void setColorHair(String colorHair)
    {
        this.colorHair = colorHair;
    }
    public void setColorEyes(String colorEyes)
    {
        this.colorEyes = colorEyes;
    }

    public String toString()
    {
        String f = "Цвет волос: " + colorHair + "\n" + "Цвет глаз" + colorEyes;
        return f;
    }
}
