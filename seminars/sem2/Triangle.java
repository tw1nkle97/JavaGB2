package seminars.sem2;

public class Triangle implements Inter, Inter3{
    protected int sideA;
    protected int sideB;
    protected int sideC;

    public Triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSquare(){
        if (sideA + sideB > sideC) {
            
        }
        int p = (sideA + sideB + sideC)/2;
        return Math.sqrt(p * (p - sideA) * (p-sideB) * (p-sideC));
    }

    public double getPerimeter(){
        return sideA + sideB + sideC;
    }

    @Override
    public String toString(){
        return String.format("Площадь: %f; Периметр: %f", 
        getSquare(), getPerimeter());
    }
}
