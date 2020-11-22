package task1;

public class Parent {

    private int id;

    Parent(int id) {
        this.id = id;
        String startedLog = String.format(
                "The instance of class %s with id %d have been created",
                this.getClass().getSimpleName(), this.id
        );
        System.out.println(startedLog);
    }

    public void fakeDestructor() {
        String finalLog = String.format(
                "The instance of class %s with id %d have been destroyed by garbage collector",
                this.getClass().getSimpleName(), this.id
                );
        System.out.println(finalLog);
    }
}
