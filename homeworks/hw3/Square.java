package homeworks.hw3;

public class Square extends Figure {
    
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    public double getPerimeter() {
        return 4 * side;
    }
    
    public double getSquare() {
        return side * side;
    }

    public double getSide() {
        return side;
    }
    
}