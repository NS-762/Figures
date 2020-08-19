public class HomeWork {

    public static void main(String[] args) {

        Figures figure1 = new Circle(10);
        figure1.figuresArea(figure1);

        Figures figure2 = new Square(12);
        figure2.figuresArea(figure2);

        Figures figure3 = new Triangle(5, 8);
        figure3.figuresArea(figure3);
    }
}
