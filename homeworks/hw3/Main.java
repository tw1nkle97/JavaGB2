package homeworks.hw3;

public class Main {

    public static void main(String[] args) {

        FigureCollection collection = new FigureCollection();

        collection.addFigure(new Triangle(3, 2, 3));
        collection.addFigure(new Square(5));
        collection.addFigure(new Rectangle(2, 3));
        collection.addFigure(new Circle(5));

        collection.printAllFigures();
        // Треугольник со сторонами: 3,00, 2,00, 3,00; Площадь: 2,83; Периметр: 8,00
        // Квадрат со стороной: 5,00; Площадь: 25,00; Периметр: 20,00
        // Прямоугольник с длиной 2,00 и шириной 3,00; Площадь: 6,00; Периметр: 10,00
        // Круг с радиусом: 5,00; Площадь: 78,54; Длина окружности: 31,42

    }

}
