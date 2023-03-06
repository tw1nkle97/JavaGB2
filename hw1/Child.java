package hw1;

public class Child extends Product{
    protected float minAge;
    protected String hypoallergic;
    public Child(String name, int price, int count, 
                String unit, float minAge, String hypoallergic){
        super(name, price, count, unit);
        this.minAge = minAge;
        this.hypoallergic = hypoallergic;
    }

    public float getMinAge(){
        return this.minAge;
    }

    public String getHypoallergic(){
        return this.hypoallergic;
    }
}
