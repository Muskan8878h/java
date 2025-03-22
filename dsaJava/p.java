import java.util.*;
public class p{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // String name=sc.next();
        // System.out.println("Hello " + name + " have a good day");
        // sc.close();

        // int x = 5;  // 0101 in binary
        // int y = 3;  // 0011 in binary
        // int result = x | y; // result = 1 (0001 in binary)
        // System.out.println(result);

        // int count=5;
        // System.out.println("Initial count: " + count);
        // System.out.println("Count after increment: " + (++count)); // Pre-increment
        // System.out.println("Count after decrement: " + (--count));

        // int terms = 20;
        // int a = 0, b = 1;
        // System.out.print("Fibonacci Series: " + a + ", " + b);
        // for (int i = 2; i < terms; i++) {
        //     int next = a + b;
        //     System.out.print(", " + next);
        //     a = b;
        //     b = next;
        // }

    //     public static void main(String[] args) {
    //         Scanner scanner = new Scanner(System.in);
    //         System.out.print("Enter a string: ");
    //         String input = scanner.nextLine();
    //         String reversed = reverseString(input);
    //         System.out.println("Reversed String: " + reversed);
    //     }
    //     // Recursive method to reverse a string
    //     public static String reverseString(String str) {
    //         if (str.isEmpty()) {
    //             return str; // Base case: if the string is empty
    //         }
    //         return reverseString(str.substring(1)) + str.charAt(0); // Recursive case
    //     }
    // }


    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int upper = scanner.nextInt();
        int largestPalindrome = -1;

        for (int i = lower; i <= upper; i++) {
            if (isPalindrome(i)) {
                largestPalindrome = i; // Update largest palindrome
            }
        }

        if (largestPalindrome != -1) {
            System.out.println("Largest palindrome in the range: " + largestPalindrome);
        } else {
            System.out.println("No palindrome found in the range.");
        }
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    }
// }