import java.util.*;
public class LL{
    static void addele(String str, LinkedList<String> l1){
        l1.add(str);
        System.out.println(l1);
    }
    static void deleteele(String str, LinkedList<String> l1){
        l1.remove(str);
        System.out.println(l1);
    }
    static void len( LinkedList<String> l1){
        System.out.println(l1.size());
    }
    public static void main(String[] args){
        LinkedList<String> l1=new LinkedList<>();
        l1.add("haryana");
        l1.add("punjab");
        l1.add("chandigarh");
        System.out.println(l1);
        // LL ll=new LL();
        addele("uttar pradesh",l1);   
        deleteele("haryana", l1);
        len(l1);
    }
}