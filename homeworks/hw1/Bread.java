package homeworks.hw1;

public class Bread extends Food{
    protected String flourType;
    public Bread(String name, int price, int count, 
                String unit, String experationDate, String flourType){
        super(name, price, count, unit, experationDate);
        this.flourType = flourType;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Срок годности: %s; Тип муки: %s;", super.getName(),
        super.getPrice(), super.getCount(), super.getUnit(), super.getDate(), this.flourType);
    }
}
