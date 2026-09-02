
import java.util.Scanner;



public class Fourdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:- ");
        double n = sc.nextDouble();

        if (n>=1000 && n<=9999)
            System.out.print("\nGiven number "+(n)+ " is four digit number");

        else
            System.out.print("\nGiven number "+(n)+ " is not a four digit number");
        
    }
}
