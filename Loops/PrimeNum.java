import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        boolean flag = true; // true means prime

        for (int i=2;i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false ; // 1 means composite
                break ;
            }
        }
        if ( n == 1) System.out.println("Neither Prime and Composite");
        else if( flag == false) System.out.println("Composite number");
        else System.out.println("Prime number");

    }
}
