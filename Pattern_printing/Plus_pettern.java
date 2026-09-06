
import java.util.Scanner;

public class Plus_pettern {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = sp.nextInt();

        if (n%2==0) System.out.println("Format doesn't support");

        else{
            for (int i = 1; i<= n; i++){
                for (int j = 1; j<= n; j++){
                    if ( j==(n+1)/2 || i==(n+1)/2){
                        System.out.print("* ");
                    }
                    else System.out.print("  ");
                }
                System.out.println();
            }
        }

        
    }
}
