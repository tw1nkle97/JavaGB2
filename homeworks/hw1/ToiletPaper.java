package homeworks.hw1;

public class ToiletPaper extends Hygiene{
    protected int layers;
    public ToiletPaper(String name, int price, int count, 
                String unit, int countInOne, int layers){
        super(name, price, count, unit, countInOne);
        this.layers = layers;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; В одной упаковке: %d; Кол-во слоев: %d;", super.getName(),
        super.getPrice(), super.getCount(), super.getUnit(), super.getCountInOne(), this.layers);
    }
    
}
