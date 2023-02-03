import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task_02 {
    public static  Scanner iScanner = new Scanner(System.in);
    // Реализуйте очередь с помощью LinkedList со следующими методами: 
    // enqueue() - помещает элемент в конец очереди, 
    // dequeue() - возвращает первый элемент из очереди и удаляет его,
    // first() - возвращает первый элемент из очереди, не удаляя.

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int j = r.nextInt(1, 100);
            list.add(j); // Задаём рандомный список 
        }
        System.out.println(list);
        // System.out.println(enqueueNew(list)); - Не совсем понял условие, поэтому сделал этот метод, он добавляет новый элемент с консоли
        // enqueue(list); // Этот медот просто помещает элемент в конец очереди.
        // dequeue(list);
        // first(list);
        
    }
    public static List<Integer> enqueueNew(List<Integer> lst) {
        List<Integer> enqueuelist = new LinkedList<>();
        System.out.print("Введите новый элемент очереди: ");
        int a = iScanner.nextInt(); 
        enqueuelist.addAll(lst);
        enqueuelist.add(a);
        iScanner.close();
        return enqueuelist;
    }
    public static void enqueue(List<Integer> lst) {
        System.out.print("Введите порядковый номер элемента очереди: ");
        int a = iScanner.nextInt(); 
        int elment = lst.get(a);
        lst.remove(a);
        lst.add(elment);
        iScanner.close();
        System.out.println(lst);
    }
    public static void dequeue(List<Integer> lst) {
        System.out.println("Первый элемент очереди " + lst.get(0));
        lst.remove(0);
        System.out.println(lst);
    }
    public static void first(List<Integer> lst) {
        System.out.println("Первый элемент очереди " + lst.get(0));
        lst.remove(0);
    }
}
