public class Square extends Figures {
    protected int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

/*    @Override
    public double figuresArea() {
        area = Math.pow(side, 2);
        return area;
    }*/
}
