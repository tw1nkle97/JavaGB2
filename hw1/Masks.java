package hw1;

public class Masks extends Hygiene{
    public Masks(String name, int price, int count, 
                String unit, int countInOne){
        super(name, price, count, unit, countInOne);
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; В одной упаковке: %d;", super.getName(),
        super.getPrice(), super.getCount(), super.getUnit(), super.getCountInOne());
    }
}
