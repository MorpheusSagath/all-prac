public class Author {
    public String name;
    public String email;
    public char gender;

    public Author(String name, String email, char gender)
    {
        this.email = email;
        this.gender = gender;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    public String toString()
    {
        String s = "Name: " + name + "\n" + "Genger: " + gender + "\n" + "Email: " + email;
        return s;
    }
}
