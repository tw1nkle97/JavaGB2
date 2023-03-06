package hw1;

public class Milk extends Food{
    protected int fat;
    public Milk(String name, int price, int count, 
                String unit, String experationDate, int fat){
        super(name, price, count, unit, experationDate);
        this.fat = fat;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Срок годности: %s; Процент жирности: %d;", super.getName(),
        super.getPrice(), super.getCount(), super.getUnit(), super.getDate(), this.fat);
    }
}
