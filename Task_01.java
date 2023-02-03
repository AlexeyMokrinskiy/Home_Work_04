import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task_01 {

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int j = r.nextInt(1, 100);
            list.add(j); // Задаём рандомный список 
        }

        System.out.println(list);
        System.out.println(ReversList(list));
    }
    
    public static List<Integer> ReversList(List<Integer> lst) {
        List<Integer> revlist = new LinkedList<>();
        for (int i = lst.size()-1; i >= 0; --i) {
           int temp = lst.get(i);
           revlist.add(temp);
        }
        return revlist;
    }
}