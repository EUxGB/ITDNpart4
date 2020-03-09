package essential.part4.ex3_abstraction;

abstract class AbstractClassA {
    public abstract void operationA();
}

abstract class AbstractClassB extends AbstractClassA {
    public abstract void operationB(); // в абстрактном наследнике абстрактного класса не реализуется метод operationA
}

class ConcreteClass extends AbstractClassB {

    @Override
    public void operationA() {
        System.out.println("ConcreteClass.operationA");

    }

    @Override
    public void operationB() {
        System.out.println("ConcreteClass.operationB");

    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClassA instance = new ConcreteClass();
        instance.operationA();
        //instance.operationB(); возникает ошибка, тк. создан объект через родителя AbstractA, а не "В"

        AbstractClassB instanceB = new ConcreteClass();
        instanceB.operationA();
        instanceB.operationB();



    }
}
