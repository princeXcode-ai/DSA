
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1 ;

        if ( n == 0){
            System.out.println("Factorial is : 1");
        }
        else {
            for (int i = n ; i >= 1; i -= 1){
                a = i*a;
        }
        System.out.println("factorial is: "+ a);
        }
    }
}
