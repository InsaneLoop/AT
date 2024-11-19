package lab4;

class SuperClass {
}

class SubClass extends SuperClass implements Runnable {
    @Override
    public void run() {
        System.out.println("Це метод run з SubClass");
    }
}

public class Task_b {
    public static void main(String[] args) {
        SubClass obj = new SubClass();

        Class<?> superClass = obj.getClass().getSuperclass();
        System.out.println("Суперклас: " + superClass.getName());

        Class<?>[] interfaces = obj.getClass().getInterfaces();
        System.out.println("Реалізовані інтерфейси:");
        for (Class<?> iface : interfaces) {
            System.out.println(iface.getName());
        }
    }
}
