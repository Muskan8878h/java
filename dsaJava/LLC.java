import java.util.*;
public class LLC {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("list");
        System.out.println(list);

        list.addFirst("this");
        System.out.println(list);

        System.out.println(list.size());

        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }

        // list.removeFirst();
        // System.out.println(list);

        list.remove(3);
        System.out.println(list);
    }
}
