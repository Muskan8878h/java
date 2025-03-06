// BEGIN
//     INPUT number
//     IF number MOD 2=0 THEN 
//         OUTPUT "Even"
//     ELSE 
//         OUTPUT "Odd"
//     ENDIF
// END


import java.util.Scanner;
public class evenOdd {
    // public static void main(String[] args){
    //     Scanner sc= new Scanner(System.in);
    //     int n;
    //     n=sc.nextInt();
    //     System.out.println("Enter");
    //     if(n%2==0){
    //         System.out.println("Even");
    //     }
    //     else{
    //         System.out.println("Odd");
    //     }
    //     sc.close();
    // }


    // public static void main(String[] args){
    //     Scanner sc= new Scanner(System.in);
    //     int age=sc.nextInt();
    //     if(age>18){
    //         System.out.println("Adult");
    //     }
    //     else{
    //         System.out.println("Minor");
    //     }
    //     sc.close();
    // }

    // public static void main(String[] agrs){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     switch(n){
    //         case 1: System.out.println("Hello");
    //         break;
    //         case 2: System.out.println("Namaste");
    //         break;
    //         default: System.out.println("invalid");
    //     }
    //     sc.close();
    // } 


    // public static void main(String[] args){
    //     Scanner sc= new Scanner(System.in);
    //     int n=sc.nextInt();
    //     for(int i=0;i<n;i++){
    //         System.out.println("hello "+ i);
    //     }
    //     sc.close();
    // }                     


    // public static void main(String[] agrs){
    //     int i=0;
    //     while(i<10){
    //         System.out.println("Hello " + i);
    //         i++;
    //     }
    // }

    // public static void main(String[] args){
    //     int i=0;
    //     do{
    //         System.out.println("Hello " + i);
    //         i++;
    //     }while(i<10);
    // }


//////////////////////////////////////////////....Patterns....//////////////////////
    // public static void main(String[] args){
    //     Scanner sc= new Scanner(System.in);
    //     int n=sc.nextInt();
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     sc.close();
    // }


// * * * * * 
// *       *
// *       *
// *       *
// * * * * *
    // public static void main(String[] args){
    //     int n=5;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n;j++){
    //             if(i==1 || j==1 || i==n || j==n){
    //                 System.out.print("* ");
    //             }
    //             else{
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println( );
    //     }
    // }


    // public static void main(String[] args){
    //     int n=5;
    //     for(int i=n;i>=1;i--){
    //         for(int j=0;j<i;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println( );
    //     }
    // }


    // public static void main(String[] args){
    //     int n=5;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println( );
    //     }
    // }


    // public static void main(String[] args){
    //     int n=5;
    //     int count=1;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(count);
    //             count++;
    //         }
    //         System.out.println();
    //     }
    // }


    // public static void main(String[] args){
    //     int n=5;
    //     for(int i=0;i<=n;i++){
    //         for(int j=0;j<i;j++){
    //             if((i+j)%2==0){
    //                 System.out.print("1");
    //             }
    //             else{
    //                 System.out.print("0");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }


// /////////////////////....functions......///////////////////////////////

    public static void printName(String name){
        System.out.println(name);
        return ;
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printName(name);
        sc.close();
    }


    

}
