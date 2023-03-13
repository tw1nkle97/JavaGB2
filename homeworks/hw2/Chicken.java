package homeworks.hw2;

import homeworks.hw2.Animal.Bird;

public class Chicken extends Bird {
    private double weight;
    private String eyeColor;

    public Chicken(double flightHeight, double weight, String eyeColor) {
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
        System.out.println("ку-ка-ре-ку");
    }

    @Override
    public void printInfo() {
        System.out.println("Курица весит " + weight + " кг, цвет глаз " + eyeColor);
    }
}

