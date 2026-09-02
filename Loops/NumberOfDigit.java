
import java.util.Scanner;


public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();

        if (x==0) System.out.println(1);

        else {
            int count = 0;
            while (x!= 0){
                x/= 10;
                count++;
            }
            System.out.println(count);
        }
    }
}
