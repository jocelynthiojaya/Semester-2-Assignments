public class Main {
    public static void main(String[] args) {
        //Shape Class
        Shape shape1 = new Shape();
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        shape1.setColor("blue");
        shape1.setFilled(false);
        System.out.println(shape1.toString());

        System.out.println();

        //Circle Class
        Circle circle1 = new Circle();
        System.out.println(circle1.getColor());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius());
        circle1.setColor("blue");
        circle1.setFilled(false);
        circle1.setRadius(4.0);
        System.out.println("Area: " + circle1.getArea() + ", Perimeter: "
                + circle1.getPerimeter());
        System.out.println(circle1.toString());

        System.out.println();

        //Rectangle Class
        Rectangle rect1 = new Rectangle();
        System.out.println(rect1.getColor());
        System.out.println(rect1.isFilled());
        System.out.println(rect1.getLength());
        System.out.println(rect1.getWidth());
        rect1.setColor("blue");
        rect1.setFilled(false);
        rect1.setLength(2.0);
        rect1.setWidth(4.0);
        System.out.println("Area: " + rect1.getArea() + ", Perimeter: "
                + rect1.getPerimeter());
        System.out.println(rect1.toString());

        System.out.println();

        //Square Class
        Square square1 = new Square(1.0);
        System.out.println(square1.getSide());
        square1.setWidth(2.0);
        square1.setLength(3.0);
        System.out.println(square1.toString());

        Species human = new Species("sapiens", "homo");
        System.out.println(human.toString());
    }
}
