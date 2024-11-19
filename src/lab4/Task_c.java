package lab4;

interface GenericInterface<T> {
    void display(T value);
}

class StringPrinter implements GenericInterface<String> {
    @Override
    public void display(String value) {
        System.out.println("Рядок: " + value);
    }
}

class IntegerPrinter implements GenericInterface<Integer> {
    @Override
    public void display(Integer value) {
        System.out.println("Число: " + value);
    }
}

public class Task_c {
    public static void main(String[] args) {
        GenericInterface<String> stringPrinter = new StringPrinter();
        stringPrinter.display("Привіт, Java!");

        GenericInterface<Integer> integerPrinter = new IntegerPrinter();
        integerPrinter.display(123);
    }
}
