package homeworks.hw1;

public class Product {
    private String name;
    private int price;
    private int count;
    private String unit;

    public Product(String name, int price, int count, 
                    String unit){
        this.name = name;
        this.price = price;
        this.count = count;
        this.unit = unit;
    }
    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getCount() {
        return this.count;
    }

    public String getUnit() {
        return this.unit;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s;", this.name,
        this.price, this.count, this.unit);
    }


}
