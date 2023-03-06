package hw1;

public class Diapers extends Child{
    protected String sizeOfDiaper;
    protected float minWeight;
    protected float maxWeight;
    public Diapers(String name, int price, int count, 
                String unit, float minAge, String hypoallergic, String sizeOfDiaper, float minWeight, float maxWeight){
        super(name, price, count, unit, minAge, hypoallergic);
        this.sizeOfDiaper = sizeOfDiaper;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Мин. возраст: %f; Гипоаллергенность: %s Размер: %s; Мин. вес: %f; Макс. вес: %f", 
        super.getName(), super.getPrice(), super.getCount(), super.getUnit(), super.getMinAge(), super.getHypoallergic(), this.sizeOfDiaper, this.minWeight, this.maxWeight);
    }
}
