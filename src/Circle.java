public class Circle extends Figures {
    protected int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    /*@Override
    public double figuresArea() {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }*/
}
