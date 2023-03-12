package seminars.sem2;

public class Rectangle implements Inter, Inter3{
    protected int sideA;
    protected int sideB;

    public Rectangle(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSquare(){
        return sideA * sideB;
    }

    public double getPerimeter(){
        return (sideA + sideB) * 2;
    }

    @Override
    public String toString(){
        return String.format("Площадь: %f; Периметр: %f", 
        getSquare(), getPerimeter());
    }
}
