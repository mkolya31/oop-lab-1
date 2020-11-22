package task2;

import java.util.stream.Collectors;

public class Child extends Parent {

    Child(String name) {
        super(name);
    }

    /**
     * Метод для вывода чётных чисел в массиве intArray
     */
    @Override
    public void print() {
        String filteredArrayString = this.intArray.stream()
                .filter(numb -> numb % 2 == 1)
                .map(numb -> Integer.toString(numb))
                .collect(Collectors.joining(", ", "[ ", " ]"));
        String logMsg = String.format("В массиве сущности %s содержатся следующие нечётные числа: %s",
                this.name,
                filteredArrayString);

        logger.info(logMsg);
    }
}
