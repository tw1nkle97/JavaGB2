package homeworks.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FigureCollection {

    private List<Figure> figures;

    public FigureCollection() {
        figures = new ArrayList<>();
    }

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void removeFigure(int index) {
        figures.remove(index);
    }

    public void updateFigure(int index, Figure figure) {
        figures.set(index, figure);
    }

    public void printPerimeters() {
        for (Figure figure : figures) {
            if (figure instanceof Triangle) {
                System.out.println(String.format("Периметр треугольника: %.2f", figure.getPerimeter()));
            } else if (figure instanceof Square) {
                System.out.println(String.format("Периметр квадрата: %.2f", figure.getPerimeter()));
            } else if (figure instanceof Rectangle) {
                System.out.println(String.format("Периметр прямоугольника: %.2f", figure.getPerimeter()));
            } else if (figure instanceof Circle) {
                System.out.println(String.format("Длина окружности: %.2f", figure.getPerimeter()));
            }
        }
    }

    public void printSquare() {
        for (Figure figure : figures) {
            System.out.println(String.format("Площадь: %.2f", figure.getSquare()));
        }
    }

    public void sortByArea() {
        Collections.sort(figures, new Comparator<Figure>() {
            @Override
            public int compare(Figure f1, Figure f2) {
                return Double.compare(f1.getSquare(), f2.getSquare());
            }
        });
    }

    public void printAllFigures() {
        for (Figure figure : figures) {
            if (figure instanceof Triangle) {
                System.out.println(
                        String.format("Треугольник со сторонами: %.2f, %.2f, %.2f; Площадь: %.2f; Периметр: %.2f",
                                ((Triangle) figure).getA(), ((Triangle) figure).getB(), ((Triangle) figure).getC(),
                                figure.getSquare(), figure.getPerimeter()));
            } else if (figure instanceof Square) {
                System.out.println(
                        String.format("Квадрат со стороной: %.2f; Площадь: %.2f; Периметр: %.2f",
                                ((Square) figure).getSide(), figure.getSquare(), figure.getPerimeter()));
            } else if (figure instanceof Rectangle) {
                System.out.println(
                        String.format("Прямоугольник с длиной %.2f и шириной %.2f; Площадь: %.2f; Периметр: %.2f",
                                ((Rectangle) figure).getLength(), ((Rectangle) figure).getWidth(), figure.getSquare(), figure.getPerimeter()));
            } else if (figure instanceof Circle) {
                System.out.println(
                        String.format("Круг с радиусом: %.2f; Площадь: %.2f; Длина окружности: %.2f",
                                ((Circle) figure).getRadius(), figure.getSquare(), figure.getPerimeter()));
            }
        }
    }
}
