public class Human {
    private String name;
    //public String email;
    public String gender;
    public String race;
    Head infoHead = new Head();
    Leg infoLeg = new Leg();
    Hand infoHand = new Hand();

    public Human()
    {
        infoHead.setColorEyes("brown");
        infoHead.setColorHair("black");
        infoHand.setSize(1.1f);
        infoLeg.setSize(1.113f);
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public void setRace(String race)
    {
        this.race = race;
    }
    public String toString()
    {
        String f = "Информация о человеке" + "\n\n" + "Имя: " + name + "\n" + "Гендер: " + gender + "\n" + "Раса: " + race;
        f += "\n" + infoHead.toString();
        f += "\n" + infoHand.toString();
        f += "\n" + infoLeg.toString();
        return f;
    }
}
