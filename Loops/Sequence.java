
import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter terms: ");
        int n = sc.nextInt();

        int a = n , r = -1 ;

        for (int i = 1; i<= n; i++){
            System.out.println(i);
            System.out.println(a);
            a+=r ;

        }
    }
}
