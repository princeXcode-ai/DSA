
import java.util.Scanner;


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :- ");
//         int n = sc.nextInt();

//         if (n%2== 0) System.out.println("Even number");
//         else System.out.println("Odd number");

        
//             }
// }

public class Oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :- ");
        int n = sc.nextInt();

        if (n%5 == 0)
            System.out.println("this number is divisible by 5");

        else
            System.out.println("this number is not divisible by 5");
        
    }
}