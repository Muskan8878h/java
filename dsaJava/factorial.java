// ALGO:............
// Step1: consider a number 
// Step2: Run a loop from 1 to number
// Step3: Multiple with and caculate to factorial by loop condition
// Step4: Say the output

// PSUDOCODE:.............. 
// BEGIN 
//     INPUT num;
//     WHILE num>0
//         OUTPUT sum*=num
// END


import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=1;
        for(int i=1;i<=num;i++){
            sum*=i;
        }
        System.out.println(sum);
        sc.close();
    }

}