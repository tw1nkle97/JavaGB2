package homeworks.hw4;

public class Main {
    public static void main(String[] args) {

        DynamicArray<Integer> dynamicArray = new DynamicArray<>();

        dynamicArray.add(5);
        dynamicArray.add(7);
        dynamicArray.add(3);
        dynamicArray.add(-3);
        dynamicArray.print();

        System.out.println("Размер массива: " + dynamicArray.size());

        dynamicArray.remove(60);
        dynamicArray.print();

        int foundIndex = dynamicArray.findIndex(30);
        System.out.printf("foundIndex = %d\n", foundIndex);

        int foundElement = dynamicArray.getElement(3);
        System.out.printf("foundElement = %d\n", foundElement);

        boolean availability = dynamicArray.contains(302);
        System.out.printf("availability = %b\n", availability);

        for (int i = 0; i < dynamicArray.size(); i++) {
            if (dynamicArray.getElement(i) == 30) {
                dynamicArray.remove(i);
                i--;
            }
        }

        System.out.println("Массив после удаления элемента:");
        dynamicArray.print();

        dynamicArray.setElement(0, 11);
        System.out.println("Массив после изменения значения элемента:");
        dynamicArray.print();

        Integer min = (Integer) dynamicArray.getMinimum();
        System.out.println("Минимальное значение: " + min);

        Integer max = (Integer) dynamicArray.getMaximum();
        System.out.println("Максимальное значение: " + max);

        System.out.println("Сумма элементов: " + dynamicArray.sum());

        System.out.println("Произведение элементов: " + dynamicArray.product());

        Double[] doubleArray = { 7.5, 2.5, 3.5, 1.5, 5.5 };
        DynamicArray<Double> doubleDynamicArray = new DynamicArray<>(doubleArray);
        System.out.println("Новый массив doubleArray: ");
        doubleDynamicArray.print();
        System.out.println("Сумма элементов массива doubleArray: " + doubleDynamicArray.sum());

        doubleDynamicArray.bubbleSort();
        System.out.println("Отсортированный массив doubleArray: ");
        doubleDynamicArray.print();

        dynamicArray.insertionSort();
        System.out.println("Отсортированный массив dynamicArray: ");
        dynamicArray.print();

        Integer[] intArray = { 7, 4, 5, -1, 0 };
        DynamicArray<Integer> intDynamicArray = new DynamicArray<>(intArray);
        System.out.println("Новый массив intArray: ");
        intDynamicArray.print();
        intDynamicArray.selectionSort();
        System.out.println("Отсортированный массив intArray: ");
        intDynamicArray.print();

        dynamicArray.clear();
        dynamicArray.print();
    }
}