public class Human {
    public String name;
    //public String email;
    public String gender;
    public String race;
    Head infoHead = new Head();
    Leg infoLeg = new Leg();
    Hand infoHand = new Hand();

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
        String f = "" + name + "\n" + "" + gender + "\n" + "" + race + "\n";
        System.out.println(infoHead);
        System.out.println(infoHand);
        System.out.println(infoLeg);
        return f;
    }
}
