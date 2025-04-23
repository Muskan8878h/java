import java.util.*;
public class stackkk{
    public static void main(String[] args){
        String name;
        Stack<String> st=new Stack<>();
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        String[] nm=name.split("\\s+");
        for(String str:nm){
            st.push(str);
        }
        System.out.println("Required a string is ");
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
}