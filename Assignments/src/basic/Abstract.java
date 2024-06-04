package basic;

abstract class Parent {
    // Abstract method
    abstract void call();
}

class FirstSubclass extends Parent {
    // Implementation of the abstract method
    @Override
    void call() {
        System.out.println("This is the first subclass");
    }
}

class SecondSubclass extends Parent {
    // Implementation of the abstract method
    @Override
    void call() {
        System.out.println("This is the second subclass");
    }
}

public class Abstract {
	public static void main(String[] args) {
        // Creating objects of the subclasses
        Parent firstSubclass = new FirstSubclass();
        Parent secondSubclass = new SecondSubclass();

        firstSubclass.call();
        secondSubclass.call();
    }
}
