package homeworks.hw2;

import homeworks.hw2.Animal.WildAnimal;

public class Tiger implements WildAnimal {
    private double height;
    private double weight;
    private String eyeColor;
    private String habitat;
    private String dateFound;

    public Tiger(double height, double weight, String eyeColor, String habitat, String dateFound) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.habitat = habitat;
        this.dateFound = dateFound;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getEyeColor() {
        return eyeColor;
    }

    @Override
    public void printInfo() {
        System.out.println("Рост: " + height + " см");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Цвет глаз: " + eyeColor);
        System.out.println("Место обитания: " + habitat);
        System.out.println("Дата нахождения: " + dateFound);
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

    @Override
    public String getDateFound() {
        return dateFound;
    }

    @Override
    public void makeSound() {
        System.out.println("Громко рычит");
    }

}
