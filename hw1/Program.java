package hw1;

public class Program {
    public static void main(String[] args) {
        Product milk = new Milk("Простоквашино", 50, 6, "Литр", "6 месяцев", 2);
        Product limonade = new Drinks("Sprite", 80, 12, "Литр", 2);
        Product bread = new Bread("Бородинский", 30, 1, "шт", "3 дня", "1 сорт");
        Product eggs = new Eggs("Тридевятое", 70, 10, "шт", "3 нед", 10);
        Product masks = new Masks("Чистая линия", 500, 12, "шт", 12);
        Product pappare = new ToiletPaper("Zeva", 275, 12, "шт", 12, 2);
        Product diapers = new Diapers("Gool", 500, 1, "шт", 1, "да", "s", 15, 30);
        Product nipple = new Nipple("Соска", 150, 1, "шт.", 1, "да");
    
        Product[] arr = new Product[] {milk, limonade, bread, eggs, masks, pappare, diapers, nipple};

        for (int i = 0; i < 8; i++) {
            System.out.println(arr[i]);
            System.out.println("----");
        }
    }
}
