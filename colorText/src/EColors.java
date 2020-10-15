public enum EColors {
    RED("\u001B[31m"),
    WHITE("\u001B[0m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    VIOLET("\u001B[35m"),
    BLUE("\u001B[34m"),
    //HIGHLIGHTED_WHITE("\u001B[40m"),
    GRAY("\u001B[37m");
    private String idColor;

    EColors(String idColor)
    {
        this.idColor = idColor;
    }

    public String getIdColor() {
        return idColor;
    }
}
