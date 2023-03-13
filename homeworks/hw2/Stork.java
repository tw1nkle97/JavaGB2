package homeworks.hw2;

import homeworks.hw2.Animal.Bird;

public class Stork extends Bird {
    private double weight;
    private String eyeColor;

    public Stork(double flightHeight, double weight, String eyeColor) {
        super(flightHeight);
        this.weight = weight;
        this.eyeColor = eyeColor;
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
    public void makeSound() {
        System.out.println("чи-ли-чи-ли");
    }

    @Override
    public void printInfo() {
        System.out.println("Аист весит " + weight + " кг, цвет глаз: " + eyeColor);
    }
}

