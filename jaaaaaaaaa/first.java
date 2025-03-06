// import java.util.*;
// class first{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr=new int[5];
//         for(int i=0;i<5;i++){
//             arr[i]=sc.nextInt();
//         }
//         float sum=0;
//         for(int i=0;i<5;i++){
//             sum=sum+arr[i];
//         }
//         System.out.println(sum);
//         float per=(sum/500)*100;
//         System.out.println(per+"%");
//         if(per>=100){
//             System.out.println("A");
//         }
//         else if(per>=80){
//             System.out.println("B");
//         }
//         else if(per>=70){
//             System.out.println("C");
//         }
//         else if(per>=60){
//             System.out.println("D");
//         }
//         else if(per>=50){
//             System.out.println("E");
//         }
//         else{
//             System.out.println("F"); 
//         }
//     }
// }



// import java.util.*;
// public class first{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int temp=n;
//         int sum=0;   
//         int rev=0;    
//         while(n!=0){
//             rev=rev*10+n%10;
//             sum+=n%10;
//             n=n/10;
//         }
//         int counteven=0;
//         int countodd=0;
//         int dig=0;
//         while(temp!=0){
//             dig=temp%10;
//             if(dig%2==0){
//                 counteven++;
//             }
//             else{
//                 countodd++;
//             }
//             n/=10;
//         }
//         System.out.println("sum: "+ sum);
//         System.out.println("reverse: "+ rev);
//         System.out.println("even : "+ counteven);
//         System.out.println("odd: "+ countodd);
//         sc.close();
        
//     }
// }



import java.util.*;
public class first{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0;   
        int dig=0; 
        int len=0; 
        temp=n; 
        int a=n;
        while(n!=0){
            n/=10;
            len++;
        }
        while(temp!=0){
            dig=temp%10;
            rev+=Math.pow(dig,len);
            temp/=10;
        }
        if(rev==a){
            System.out.println("yes");
            while(n!=0){
                
            }
        }
        else{
            System.out.println("no");
        }
        sc.close();
    } 
 
}