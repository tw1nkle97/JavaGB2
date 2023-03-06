package hw1;

public class Nipple extends Child{
    public Nipple(String name, int price, int count, 
                String unit, float minAge, String hypoallergic){
        super(name, price, count, unit, minAge, hypoallergic);
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Мин. возраст: %f; Гипоаллергенность: %s", super.getName(),
        super.getPrice(), super.getCount(), super.getUnit(), super.getMinAge(), super.getHypoallergic());
    }
}
