package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class SecondTaskApp {

    private final Logger logger = Logger.getLogger(SecondTaskApp.class.getSimpleName());

    public static void main(String[] args) {
        ArrayList<Parent> parentsAndChildList = new ArrayList<>();

        create(parentsAndChildList);
        init(parentsAndChildList);
        print(parentsAndChildList);
        del(parentsAndChildList);
    }

    private static void create(List<Parent> parentsAndChildList) {
        Logger logger = Logger.getLogger(SecondTaskApp.class.getSimpleName());
        logger.info("\nВызван метод create()");

        Parent parent1 = new Parent("Anna");
        Parent parent2 = new Parent("Maksim");

        Child child1 = new Child("Matvey");
        Child child2 = new Child("Kira");

        logger.info(String.format("Созданы 2 сущности класса Parent (%s, %s) и две сущности класса Child (%s, %s)",
                parent1.getName(),
                parent2.getName(),
                child1.getName(),
                child2.getName()));

        parentsAndChildList.add(parent1);
        parentsAndChildList.add(parent2);
        parentsAndChildList.add(child1);
        parentsAndChildList.add(child2);

        logger.info("Объекты успешно добавлены в массив");
        logger.info("Метод create() завершил работу\n");
    }

    private static void init(List<Parent> parentsAndChildList) {
        Logger logger = Logger.getLogger(SecondTaskApp.class.getSimpleName());
        logger.info("\nВызван метод init()");
        parentsAndChildList.forEach(Parent::init);
        logger.info("Метод init() завершил работу\n");
    }

    private static void print(List<Parent> parentsAndChildList) {
        Logger logger = Logger.getLogger(SecondTaskApp.class.getSimpleName());
        logger.info("\nВызван метод print()");
        parentsAndChildList.forEach(Parent::print);
        logger.info("Метод print() завершил работу\n");
    }

    private static void del(List<Parent> parentsAndChildList) {
        Logger logger = Logger.getLogger(SecondTaskApp.class.getSimpleName());
        logger.info("\nВызван метод del()");
        logger.info("Массив до вызова метода del() " + parentsAndChildList.toString());
        parentsAndChildList.clear();
        logger.info("Массив после вызова метода del() " + parentsAndChildList.toString());
        logger.info("Метод del() завершил работу\n");
    }
}
