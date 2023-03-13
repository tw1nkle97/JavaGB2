package homeworks.hw2;

import homeworks.hw2.Animal.HomeAnimal;

public class Cat implements HomeAnimal {
    private double height;
    private double weight;
    private String eyeColor;
    private String name;
    private String breed;
    private boolean isVaccinated;
    private boolean isWoolColor;
    private String woolColor;
    private String birthDate;

    public Cat(double height, double weight, String eyeColor, String name,
            String breed, boolean isVaccinated, Boolean isWoolColor,
            String woolColor, String birthDate) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.name = name;
        this.breed = breed;
        this.isVaccinated = isVaccinated;
        this.isWoolColor = isWoolColor;
        this.woolColor = woolColor;
        this.birthDate = birthDate;
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
    public void makeSound() {
        System.out.println(name + " мурлыкает");
    }

    @Override
    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Порода: " + breed);
        System.out.println("Рост: " + height + " см");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Цвет глаз: " + eyeColor);
        System.out.println("Наличие шерсти: " + (isWoolColor ? "Yes" : "No"));
        System.out.println("Цвет шерсти: " + woolColor);
        System.out.println("Дата рождения: " + birthDate);
        System.out.println("Наличие прививки: " + (isVaccinated ? "Yes" : "No"));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public boolean isVaccinated() {
        return isVaccinated;
    }

    public boolean isWoolColor() {
        return isWoolColor;
    }

    @Override
    public String getWoolColor() {
        return woolColor;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public void showAffection() {
        System.out.println(name + " Трётся об ноги");
    }
}