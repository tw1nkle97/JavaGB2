package homeworks.hw2;

import homeworks.hw2.Animal.Animal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(25, 3, "синий",
                "собака", "пудель", false,
                false, "серый", "01.01.2020");

        Cat cat = new Cat(20, 4, "зелёный", "кот", "дворовый",
                false, true, "рыжий", "05.01.2023");

        Wolf wolf = new Wolf(70, 45, "черный", "лес", "зима 2019",
                true);

        Tiger tigr = new Tiger(100, 90, "серый", "лес", "лето 2018");

        Chicken chicken = new Chicken(1.5, 3, "коричневый");

        Stork stork = new Stork(100, 4, "черный");

        Zoo animals = new Zoo(1);

        try (Scanner scanner = new Scanner(System.in)) {
            int action = 0;
            while (action != 7) {
                System.out.println("----------------------------------------------------");
                System.out.println("1. Добавить новое животное");
                System.out.println("2. Убрать животное из зоопарка");
                System.out.println("3. Показать информацию о животном");
                System.out.println("4. Показать животных в зоопарке");
                System.out.println("5. Заставить животное издавать звук");
                System.out.println("6. Заставить всех животных издавать звук");
                System.out.println("7. Выйти из программы");
                System.out.println("Выберите действие: ");

                action = scanner.nextInt();

                switch (action) {
                    case 1:
                        System.out.println("1. Тигр");
                        System.out.println("2. Волк");
                        System.out.println("3. Аист");
                        System.out.println("4. Собака");
                        System.out.println("5. Кот");
                        System.out.println("6. Курица");
                        System.out.println("Выберите животное: ");

                        while (true) {
                            int chois = scanner.nextInt();
                            if (chois == 1) {
                                animals.addAnimal(tigr);
                                break;
                            } else if (chois == 2) {
                                animals.addAnimal(wolf);
                                break;
                            } else if (chois == 3) {
                                animals.addAnimal(stork);
                                break;
                            } else if (chois == 4) {
                                animals.addAnimal(dog);
                                break;
                            } else if (chois == 5) {
                                animals.addAnimal(cat);
                                break;
                            } else if (chois == 6) {
                                animals.addAnimal(chicken);
                                break;
                            } else {
                                System.out.println("Неверный выбор");
                            }
                        }
                        break;
                    case 2:
                        animals.showAllAnimals();
                        System.out.println("Выберите животное: ");
                        int chois = scanner.nextInt();
                        animals.removeAnimal(chois);
                        break;
                    case 3:
                        animals.showAllAnimals();
                        System.out.println("Выберите животное: ");
                        chois = scanner.nextInt();
                        animals.showAnimalInfo(chois);
                        break;
                    case 4:
                        animals.showAllAnimals();
                        break;
                    case 5:
                        animals.showAllAnimals();
                        System.out.println("Выберите животное: ");
                        chois = scanner.nextInt();
                        animals.makeAnimalSound(chois);
                        break;
                    case 6:
                        animals.makeAllSounds();
                        break;
                    case 7:
                        System.out.println("Выход из программы.");
                        break;
                    default:
                        System.out.println("Некорректный ввод, попробуйте еще раз.");
                }
            }
        }

    }

    public static class Zoo {
        private Animal[] animals;
        private int size;

        public Zoo(int capacity) {
            animals = new Animal[capacity];
            size = 0;
        }

        public void addAnimal(Animal animal) {
            if (size == animals.length) {
                Animal[] newAnimals = new Animal[animals.length * 2];
                for (int i = 0; i < animals.length; i++) {
                    newAnimals[i] = animals[i];
                }
                animals = newAnimals;
            }
            animals[size] = animal;
            size++;
        }

        public void removeAnimal(int index) {
            index -= 1;
            if (index >= 0 && index < size) {
                System.out.println("Животное " + animals[index].getClass().getSimpleName()
                        + " удалено из зоопарка");
                for (int i = index; i < size - 1; i++) {
                    animals[i] = animals[i + 1];
                }
                size--;
            } else {
                System.out.println("Неверный номер животного");
            }
        }

        public void showAnimalInfo(int index) {
            index -= 1;
            if (index >= 0 && index < size) {
                animals[index].printInfo();
            } else {
                System.out.println("Неверный номер животного");
            }
        }

        public void makeAnimalSound(int index) {
            index -= 1;
            if (index >= 0 && index < size) {
                animals[index].makeSound();
            } else {
                System.out.println("Неверный номер животного");
            }
        }

        public void showAllAnimals() {
            if (size == 0) {
                System.out.println("В зоопарке нет животных");
            } else {
                System.out.println("Животные в зоопарке:");
                for (int i = 0; i < size; i++) {
                    System.out.println((i + 1) + ". " + animals[i].getClass().getSimpleName());
                }
            }
        }

        public void makeAllSounds() {
            if (size == 0) {
                System.out.println("В зоопарке нет животных");
            } else {
                System.out.println("Звуки всех животных в зоопарке:");
                for (int i = 0; i < size; i++) {
                    animals[i].makeSound();
                }
            }
        }

    }
}