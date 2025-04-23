import java.util.*;
public class dequeee {
    public static void main(String[] args) {
        Deque<Integer> d=new ArrayDeque<>();
        d.addFirst(20);
        d.addFirst(30);
        d.addFirst(10);
        d.addFirst(40);
        System.out.println("Deque: "+ d);
        System.out.println("First Element: "+ d.getFirst());
        System.out.println("Last Element: "+d.getLast());
        d.removeFirst();
        d.removeLast();
        System.out.println("Deque: "+d);
    }
}
