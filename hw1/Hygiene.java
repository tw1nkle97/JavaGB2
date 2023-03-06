package hw1;

public class Hygiene extends Product{
    protected int countInOne;
    public Hygiene(String name, int price, int count, 
                String unit, int countInOne){
        super(name, price, count, unit);
        this.countInOne = countInOne;
    }

    public int getCountInOne(){
        return this.countInOne;
    }
}
