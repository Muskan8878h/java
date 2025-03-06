// import java.util.Scanner;
import java.util.*;
public class practice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Hello " + name + " have a good day");
        sc.close();
    }

    // public static void main(String[] args){
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     int sum=a+b;
    //     System.out.println(sum);
    //     sc.close();
    // }

// ////////////////////////swap two numbers//////////////////////////////////////////////////

    // static void swapTwoNumbers(int m, int n){
    //     int temp=m;
    //     m=n;
    //     n=temp;
    //     System.out.println("m :"+m + " , n :"+n );
    // }
    // public static void main(String[] args){
    //     int m=9;
    //     int n=5;
    //     System.out.println("m :"+m + " , n :"+n );
    //     swapTwoNumbers(m, n);
    // }


    // static void swapTwoNumbers(int [] values){
    //     values[0]=values[0]-values[1];
    //     values[1]=values[0]+values[1];
    //     values[0]=values[1]-values[0];
    // }
    // public static void main(String[] args){
    //     int[] values = {9,8};
    //     System.out.println("m :"+values[0] + " , n :"+values[1]  );
    //     swapTwoNumbers(values);
    //     System.out.println("m :"+values[0] + " , n :"+values[1]  );
    // }
    

    // static void swapTwoNumbers(int m,int n){
    //     m=m^n;
    //     n=m^n;
    //     m=m^n;
    //     System.out.println("m :"+m + " , n :"+n );
    // }
    // public static void main(String[] args){
    //     int m=2;
    //     int n=7;
    //     swapTwoNumbers(m,n);
    //     System.out.println("m :"+m + " , n :"+n );
    // } 


    // static void swapTwoNumbers(int m,int n){
    //     m=m+n;
    //     n=m-n;
    //     m=m-n;
    //     System.out.println("m :"+m + " , n :"+n );
    // }
    // public static void main(String[] args){
    //     int m=2;
    //     int n=7;
    //     swapTwoNumbers(m,n);
    //     System.out.println("m :"+m + " , n :"+n );
    // } 

/////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////      decimal to bonary        ///////////////////////////////

    // static void decToBin(int n){
    //     int[] bin=new int[100];
    //     int i=0;
    //     while(n>0){
    //         bin[i]=n%2; 
    //         n=n/2;
    //         i++;
    //     }
    //     for(int j=i-1;j>=0;j--){
    //         System.out.print(bin[j]);
    //     }
    // }
    // public static void main(String[] args){
    //     int n=17;
    //     System.out.println("decimal : "+n);
    //     System.out.print("binary : ");
    //     decToBin(n);
    // }

/// ///////////////////////////////////////////////////////////////////////////////////
///////////////////////////// factorial ///////////////////////////////////////////////

    // static int factorial(int n){
    //     int res=1,i;
    //     for(i=2;i<=n;i++)
    //         res*=i;
    //     return res;
    // }
    // public static void main(String[] args){
    //     int num=5;
    //     System.out.println("Factorial : "+ num + " is "+ factorial(5));
    // }


    // static int factorial(int n){
    //     if(n==0)
    //         return 1;
    //     return n*factorial(n-1);
    // }
    // public static void main(String[] args){
    //     int num=5;
    //     System.out.println("Factorial : "+ num + " is "+ factorial(num));
    // }

    // int factorial(int n){
    //     return (n==1 || n==0) ? 1 : n*factorial(n-1);
    // }
    // public static void main(String[] args){
    //     practice obj= new practice();
    //     int num=5;
    //     System.out.println("Factorial : "+ num + " is "+ obj.factorial(num));
    // }


// ///////////////////////////////////////////////////////////////////////////////////
//////////////////////////  complex number   /////////////////////////////////////////

    // int real,imag;
    // public practice(int r,int i){
    //     this.real=r;
    //     this.imag=i;
    // }
    // public void showC(){
    //     System.out.println(this.real + "  + i "+ this.imag);
    // }
    // public static practice add(practice n1, practice n2){
    //     practice res=new practice(0,0);
    //     res.real = n1.real+n2.real;
    //     res.imag = n1.imag+n2.imag;
    //     return res;
    // }
    // public static void main(String[] args){
    //     practice c1=new practice(4,5);
    //     practice c2=new practice(10,5);
    //     System.out.println("first complex number : ");
    //     c1.showC();
    //     System.out.println("second complex number : ");
    //     c2.showC();
    //     practice res=add(c1,c2);
    //     System.out.println("result is :");
    //     res.showC();
    // }


}