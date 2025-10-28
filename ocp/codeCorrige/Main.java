public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(4, 3);   // largeur = 4, hauteur = 3
        Shape circ = new Circle(2);         // rayon = 2

        AreaCalculator2 calculator = new AreaCalculator2();

        System.out.println("Rectangle Area = " + calculator.calculateArea(rect));
        System.out.println("Circle Area = " + calculator.calculateArea(circ));
    }
}