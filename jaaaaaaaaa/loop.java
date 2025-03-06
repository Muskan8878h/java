import java.util.Scanner;

public class loop {

    static boolean isArmstrong(int num) {
        int c = 0;
        int temp = num;
        int sum = 0;
        while (num != 0) {
            c++;
            num = num / 10;
        }
        num = temp;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, c);
            num = num / 10;
        }
        return temp == sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        int c=0;
        int temp=number;
        int even=0,odd=0;
        while(number!=0){
            c++;
            number=number/10;
        }
        number=temp;
        while(number!=0){
            int digit=number%10;
            if(c%2==0){
                even+=digit;
                c--;
            }
            else{
                odd+=digit;
                c--;
            }
            number/=10;
        }
        if(isArmstrong(number)){
            System.out.println("amstrong");
            System.out.println(even);
        }
        else{
            System.out.println("not");
            System.out.println(odd);
        }
        sc.close();
    }
}