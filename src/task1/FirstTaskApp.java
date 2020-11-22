package task1;

import java.util.ArrayList;

public class FirstTaskApp {
    public static void main(String[] args) {

        System.out.println("Application run\n");

        Parent firstParent = new Parent(0);
        Parent secondParent = new Parent(1);

        Child firstChild = new Child(2);
        Child secondChild = new Child(3);
        Child thirdChild = new Child(4);

        System.out.println("\nObjects have been created successfully");

        ArrayList<Parent> listWithObjects = new ArrayList<>();
        listWithObjects.add(firstParent);
        listWithObjects.add(secondParent);
        listWithObjects.add(firstChild);
        listWithObjects.add(secondChild);
        listWithObjects.add(thirdChild);

        System.out.println("\nObjects have been successfully added to ArrayList\n");

        del(listWithObjects);

        System.out.println("\nApplication done");
    }

    static void del (ArrayList<Parent> listWithObject) {
        System.out.println("\nMethod del() have been called");
        for (Parent object : listWithObject) {
            object.fakeDestructor();
        }

        listWithObject.clear();
    }
}
