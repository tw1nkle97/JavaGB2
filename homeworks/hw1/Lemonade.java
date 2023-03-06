package homeworks.hw1;

public class Lemonade extends Drinks{
    public Lemonade(String name, int price, int count, 
                String unit, float size){
        super(name, price, count, unit, size);
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Объем: %f", super.getName(),
        super.getPrice(), super.getCount(), super.getUnit(), super.getSize());
    }
}