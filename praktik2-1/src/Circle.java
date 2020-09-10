public class Circle {
    public float radius;
    public float lenCirc;

    public void setRadius(float radius)
    {
        this.radius = radius;
        lenCirc = (float) (2 * 3.14 * radius);
    }
    public void setLenCircus(float lenCircus)
    {
        lenCirc = lenCircus;
        radius = (float)(lenCirc/(2 * 3.14));
    }

    public String toString()
    {
        String f = "Радиус: " + radius + "\n" + "Длина окружности: " + lenCirc;
        return f;
    }
}
