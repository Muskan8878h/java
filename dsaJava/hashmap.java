import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("India",120);
        map.put("US",30);
        map.put("China",50); 
        map.put("asia",90);

        System.out.println(map);

        // int arr[]={12,15,13};
        // for(int val: arr){
        //     System.out.println(val);
        // }

        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println();
        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+ map.get(key));
        }
        System.out.println();
        map.remove("China");
        System.out.println(map);

    }
}
