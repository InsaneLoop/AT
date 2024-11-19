package lab3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Введення розмірів першого масиву
            System.out.print("Введіть розмір першого масиву: ");
            int size1 = scanner.nextInt();
            if (size1 <= 0) {
                System.out.println("Розмір масиву має бути більшим за 0.");
                return;
            }
            int[] array1 = new int[size1];
            System.out.println("Введіть елементи першого масиву:");
            for (int i = 0; i < size1; i++) {
                array1[i] = scanner.nextInt();
            }

            // Введення розмірів другого масиву
            System.out.print("Введіть розмір другого масиву: ");
            int size2 = scanner.nextInt();
            if (size2 <= 0) {
                System.out.println("Розмір масиву має бути більшим за 0.");
                return;
            }
            int[] array2 = new int[size2];
            System.out.println("Введіть елементи другого масиву:");
            for (int i = 0; i < size2; i++) {
                array2[i] = scanner.nextInt();
            }

            // Знаходження перетину масивів
            Set<Integer> set1 = new HashSet<>();
            for (int num : array1) {
                set1.add(num);
            }

            Set<Integer> intersection = new HashSet<>();
            for (int num : array2) {
                if (set1.contains(num)) {
                    intersection.add(num);
                }
            }

            System.out.println("Перетин масивів: " + intersection);

            // Перетворення перетину в LinkedList
            LinkedList<Integer> linkedList = new LinkedList<>(intersection);

            // a) Додати елемент на початок списку
            System.out.print("Введіть елемент для додавання на початок списку: ");
            int addFirst = scanner.nextInt();
            linkedList.addFirst(addFirst);

            // б) Додати елемент у кінець списку
            System.out.print("Введіть елемент для додавання в кінець списку: ");
            int addLast = scanner.nextInt();
            linkedList.addLast(addLast);

            // в) Видалити перший елемент зі списку
            if (!linkedList.isEmpty()) {
                System.out.println("Видалення першого елемента: " + linkedList.removeFirst());
            } else {
                System.out.println("Список порожній, нічого видаляти.");
            }

            // г) Видалити останній елемент зі списку
            if (!linkedList.isEmpty()) {
                System.out.println("Видалення останнього елемента: " + linkedList.removeLast());
            } else {
                System.out.println("Список порожній, нічого видаляти.");
            }

            // д) Вивести елементи списку в зворотному порядку
            System.out.println("Елементи списку у зворотному порядку:");
            ListIterator<Integer> iterator = linkedList.listIterator(linkedList.size());
            while (iterator.hasPrevious()) {
                System.out.print(iterator.previous() + " ");
            }
            System.out.println();

            // Виклик ClassCastException
            try {
                Object obj = "Це рядок";
                Integer num = (Integer) obj; // Викликає ClassCastException
            } catch (ClassCastException e) {
                System.out.println("Помилка ClassCastException: Спроба перетворити рядок на ціле число.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Помилка введення! Введіть ціле число.");
        } finally {
            scanner.close();
        }
    }
}