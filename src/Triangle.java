public class Triangle extends Figures {
    protected int base;
    protected int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

/*    @Override
    public double figuresArea() {
        area = 0.5 * base * height;
        return area;
    }*/
}
