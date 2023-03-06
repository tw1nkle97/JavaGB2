package homeworks.hw1;

public class Eggs extends Food{
    protected int eggsCount;
    public Eggs(String name, int price, int count, 
                String unit, String experationDate, int eggsCount){
        super(name, price, count, unit, experationDate);
        this.eggsCount = eggsCount;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Срок годности: %s; Количество в упаковке: %d;", super.getName(),
        super.getPrice(), super.getCount(), super.getUnit(), super.getDate(), this.eggsCount);
    }
}
