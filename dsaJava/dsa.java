// import java.util.*;
public class dsa{
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int arr[]=new int[n];
    //     // int arr[];
    //     for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     int target=sc.nextInt();
    //     boolean flag=false;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]==target){
    //            flag=true;
    //         }
    //         // else{
    //         //     flag=false;
    //         // }
    //     }
    //     if(flag==true){
    //         System.out.println("Found");
    //     }
    //     else{
    //         System.out.println("Not found");
    //     }
    //     sc.close();
    // }


    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[]=new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     // for(int i=0;i<n;i++){
    //     //     System.out.println(arr[i]+" ");
    //     // }
    //     // for(int i=n-1;i>=0;i--){
    //     //     System.out.println(arr[i]+" ");
    //     // }

    //     int start=0;
    //     int end=n-1;
    //     while(start<end){
    //         int temp=arr[start];
    //         arr[start]=arr[end];
    //         arr[end]=temp;
    //         start++;
    //         end--;
    //     }
    //     for(int i=0;i<n;i++){
    //         System.out.println(arr[i]+" ");
    //     }
    //     sc.close();
    // }



    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int m=sc.nextInt();
    //     int arr[][]=new int[n][m]; 
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             arr[i][j]=sc.nextInt();
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             System.out.print(arr[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    //     sc.close();
    // }



    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     String name=sc.nextLine();
    //     System.out.println("Hello "+name.length() );
    //     sc.close();
    // }




        // public static void main(String args[]) {
        //     String str = "123";
        //     int number = Integer.parseInt(str);
        //     System.out.println(number);           
        // }

        // public static void main(String args[]) {
        //     int number = 123;
        //     String str = Integer.toString(number);
        //     System.out.println(str.length());
        //  }
      
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n=sc.nextInt();
    //     String arr[]=new String[n];
    //     int total=0;
    //     for(int i=0;i<n;i++){
    //         arr[i]=sc.next(); 
    //         total+=arr[i].length();
    //     }
    //     System.out.println(total);
    // }
     

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
        // StringBuilder sb=new StringBuilder("Hello");
        // for(int i=0;i<sb.length()/2;i++){
        //     int front =i;
        //     int back=sb.length()-1-i;
        //     char frontchar=sb.charAt(front);
        //     char backchar=sb.charAt(back);
        //     sb.setCharAt(front,backchar);
        //     sb.setCharAt(back,frontchar);
        // }
        // System.out.println(sb);



        // String name=sc.next();
        // String result="";
        // for(int i=name.length()-1;i>=0;i--){
        //      result+=name.charAt(i);
        // }
        // System.out.println("*"+result+"*");
        // sc.close();
    // }

        // public static void main(String[] args){
        //     Scanner sc=new Scanner(System.in);
        //     int n=sc.nextInt();
        //     int arr[]=new int[n];
        //     for(int i=0;i<n;i++){
        //         arr[i]=sc.nextInt();
        //     }
        //     for(int i=0;i<n;i++){
        //         for(int j=0;j<n-i-1;j++){
        //             if(arr[j]>arr[j+1]){
        //                 int temp=arr[j];
        //                 arr[j]=arr[j+1];
        //                 arr[j+1]=temp;
        //             }
        //         }
        //     }
        //     for(int i=0;i<n;i++){
        //         System.out.print(arr[i]+" ");
        //     }
        // }

////////////////////............recursion.............////////////////////////////
        // public static void printNum(int n){
        //     if(n==0){
        //         return ;
        //     }
        //     // printNum(n-1); 
        //     System.out.println(n);
        //     printNum(n-1);
            
        // }
        // public static void main(String[] args){
        //     Scanner sc=new Scanner(System.in);
        //     int n=sc.nextInt();
        //     printNum(n);
        //     sc.close();
        // }



        // public static void printNum(int i,int n,int sum){
        //     if(i==n){
        //         sum+=i;
        //         System.out.println(sum);
        //         return ;
        //     }
        //     sum+=i;
        //     printNum(i+1, n, sum);
            
        // }
        // public static void main(String[] args){
        //     printNum(1,5,0);
        // }


        // public static int fact(int n){
        //     if(n==1||n==0){
        //         return 1;
        //     }
        //     return n*fact(n-1);
        // }
        // public static void main(String[] args){
        //     System.out.println(fact(5));
        // }


        // public static void fibo(int a,int b,int n){
        //     if(n==0) return ;
        //     int c=a+b;
        //     System.out.println(c);
        //     fibo(b,c,n-1);
        // }
        // public static void main(String[] args){
        //     int a=0;
        //     int b=1;
        //     System.out.println(a);
        //     System.out.println(b);
        //     int n=7;
        //     fibo(a,b,n-2);
        // }
     

        
}