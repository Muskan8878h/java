import java.util.*;
public class stacktest {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Stack size is "+ st.size());
        while(!st.isEmpty()){
            System.out.println(st.pop()+" ");
        }
    }
}
