import java.util.*;

public class queuee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter no.");
        int n = sc.nextInt();

        System.out.println("Enter ele: ");
        for (int i=0;i<n;i++) {
            queue.add(sc.nextInt());
        }
        int max=-1;
        int min=1000;
        for (int num:queue) {
            if (num>max) {
                max=num;
            }
            if (num<min) {
                min=num;
            }
        }
        System.out.println("Max ele " + max);
        System.out.println("Min ele " + min);

        sc.close(); 
    }

}