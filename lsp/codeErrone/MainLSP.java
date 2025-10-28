public class MainLSP {
    public static void main(String[] args) {
        lsp rectangle = new lsp();
        rectangle.setWidth(5);
        rectangle.setHeight(4); 
        System.out.println("Aire du Rectangle = " + rectangle.getArea());

        lsp rectangle1 = new Square();
        rectangle1.setWidth(5);
        rectangle1.setHeight(4); 
        System.out.println("Aire du Carré (via Rectangle) = " + rectangle1.getArea());
    }
}