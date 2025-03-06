import java.util.*;
public class hashset{
    public static void main(String[] args){
        // HashSet<Integer> set=new HashSet<>();
        // set.add(1);
        // set.add(3);
        // set.add(1);
        // set.add(5);
        // set.add(2);
        // set.add(0);
        
        // System.out.println(set);

        // Iterator it=set.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

//////////////////////////////////////////////////////////////////
        int [] arr={1,4,2,5,1,4,4,6,4,4,4};
        Map<Integer,Integer> h=new HashMap<>();
        for(int ele:arr){
            if(!h.containsKey(ele)){
                h.put(ele,1);
            }
            else{
                h.put(ele,h.get(ele)+1);
            }
        }
        System.out.println(h.entrySet());

        int maxnum=-1;
        int anskey=-1;
        // for(var e: h.entrySet()){
        //     if(e.getValue()>maxnum){
        //         maxnum=e.getValue();
        //         anskey=e.getKey();
        //     }
        // }
        // System.out.printf("%d has frequency : %d times ", anskey,maxnum);
        for(var key: h.keySet()){
            if(h.get(key)>maxnum){
                maxnum=h.get(key);
                anskey=key;
            }
        }
        System.out.printf("%d has frequency : %d times ", anskey,maxnum);

    }
}