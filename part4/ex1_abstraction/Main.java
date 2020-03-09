package essential.part4.ex1_abstraction;

abstract class AbstractClass {
    public abstract void method();
}

class ConcreteClass extends AbstractClass {

    @Override
    public void method() {
        System.out.println("Implementation");
    }
}


public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClass();

        instance.method();


    }
}
