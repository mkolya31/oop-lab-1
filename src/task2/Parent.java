package task2;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Parent {
    // Имя сущности
    protected String name;
    // Массив чисел
    protected ArrayList<Integer> intArray;

    // Размерность массива
    protected final Integer ARRAY_CAPACITY = 10;
    // Максимальное случайное число
    protected final Integer MAX_RANDOM_INT_VALUE = 1000;

    // Инструмент логирования
    protected final Logger logger = Logger.getLogger(Parent.class.getName());

    Parent() {}

    /**
     * Конструктор класса Parent
     * @param name - имя сущности
     */
    Parent(String name) {
        this.name = name;

        String logMsg = String.format("Сущность класса %s с именем %s создана",
                this.getClass().getSimpleName(),
                name);
        logger.info(logMsg);
    }

    public String toString() {
        return String.format("%s with name %s",
                this.getClass().getSimpleName(),
                this.name);
    }

    /**
     * Метод наполнения массива intArray случайными числами в диапозоне от 0 до MAX_RANDOM_INT_VALUE
     */
    public void init() {
        Random randomizer = new Random();
        this.intArray = new ArrayList<>(ARRAY_CAPACITY);
        for (int i = 0; i < ARRAY_CAPACITY; i++) {
            this.intArray.add(i, randomizer.nextInt(MAX_RANDOM_INT_VALUE));
        }

        String logMsg = String.format("Массив сущности с именем %s заполнен случайными числами: %s",
                this.name,
                this.intArray.toString());
        logger.info(logMsg);
    }

    /**
     * Метод для вывода чётных чисел в массиве intArray
     */
    public void print() {
        String filteredArrayString = this.intArray.stream()
                .filter(numb -> numb % 2 == 0)
                .map(numb -> Integer.toString(numb))
                .collect(Collectors.joining(", ", "[ ", " ]"));
        String logMsg = String.format("В массиве сущности %s содержатся следующие чётные числа: %s",
                this.name,
                filteredArrayString);

        logger.info(logMsg);
    }

    public String getName() {
        return this.name;
    }
}
