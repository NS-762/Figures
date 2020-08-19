public class Maths extends Figures {

    protected double area;

    public void mathsArea(Figures figure) {
        if (figure instanceof Circle) {
            int radius = ((Circle) figure).getRadius();
            area = Math.PI * Math.pow(radius, 2);
        } else if (figure instanceof Square) {
            int side = ((Square) figure).getSide();
            area = Math.pow(side, 2);
        } else {
            int base = ((Triangle) figure).getBase();
            int height = ((Triangle) figure).getHeight();
            area = 0.5 * base * height;
        }
        System.out.println(area);
    }
}
