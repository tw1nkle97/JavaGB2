package seminars.sem2;

public class Circle implements Inter, Inter2{
    protected float r;
    public Circle(float r){
        this.r = r;
    }

    public double getSquare(){
        return Math.PI * r * r;
    }

    public double getLength(){
        return 2 * Math.PI * r;
    }

    @Override
    public String toString(){
        return String.format("Длина окружности: %f;  Площадь:%f", 
        getSquare(), getLength());
    }
}
