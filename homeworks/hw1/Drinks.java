package homeworks.hw1;

public class Drinks extends Product{
    protected float size;
    public Drinks(String name, int price, int count, 
                String unit, float size){
        super(name, price, count, unit);
        this.size = size;
    }

    public float getSize(){
        return this.size;
    }
}
