abstract class Shape {

    public Shape() {
    }

    abstract public int calcArea();
    // sub classes must implement them

}

class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calcArea() {
        return length * width;
    }

}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int calcArea() {
        return (int) (Math.PI * radius * radius);
    }

}

class Abstract {
    public static void main(String[] args) {
        Shape s; // = new Shape();
        s = new Circle(20);

        Rectangle r = new Rectangle(10, 5);
        Circle c = new Circle(10);
        System.out.println(s.calcArea());
        System.out.println(r.calcArea());
        System.out.println(c.calcArea());

    }
}