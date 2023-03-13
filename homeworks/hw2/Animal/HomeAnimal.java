package homeworks.hw2.Animal;

public interface HomeAnimal extends Animal {
    String getName(); // Кличка

    String getBreed(); // Порода

    boolean isVaccinated(); // Наличие прививок

    String getWoolColor(); // Цвет шерсти

    String getBirthDate(); // Дата рождения

    void showAffection(); // Проявлять ласку

}
