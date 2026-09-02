import java.util.Scanner;

public class CompositeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n-1 ; i += 1 ) {
            if ( n%i == 0) {
                System.out.println("composite number ");
                break;
            }
            else {
                System.out.println("not a composite number ");
                break;
            }
        }

    }
}
