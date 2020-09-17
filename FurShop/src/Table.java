public class Table extends Furniture{
    public float ox;
    public float oy;
    public float oz;
    public Table(String name, String material, float cost, float ox, float oy, float oz)
    {
        super(name, material, cost);
        this.ox = ox;
        this.oy = oy;
        this.oz = oz;
    }

    public void setOx(float ox) {
        this.ox = ox;
    }

    public void setOy(float oy) {
        this.oy = oy;
    }

    public void setOz(float oz) {
        this.oz = oz;
    }

    @Override
    public String toString() {
        //sout(super.toString());
        System.out.println(super.toString());
        return "Размеры: ox=" + ox +
                ", oy=" + oy +
                ", oz=" + oz;
    }
}
