package hw1;

public class Food extends Product{
    protected String experationDate;
    public Food(String name, int price, int count, 
                String unit, String experationDate){
        super(name, price, count, unit);
        this.experationDate = experationDate;
    }

    public String getDate(){
        return this.experationDate;
    }
}
