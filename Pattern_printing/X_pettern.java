import java.util.Scanner;

public class X_pettern {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = sp.nextInt();

        if (n%2!=0) System.out.println("Format doesn't support");

        else{
            for (int i = 1; i<= n; i++){
                for (int j = 1; j<= n; j++){
                    if ( j==i || i+j==(n+1)){
                        System.out.print("* ");
                    }
                    else System.out.print("  ");
                }
                System.out.println();
            }
        }

        
    }
}
