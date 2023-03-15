package homeworks.hw3;

public class Rectangle extends Figure {
    
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double getPerimeter() {
        return 2 * (length + width);
    }
    
    public double getSquare() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
}
