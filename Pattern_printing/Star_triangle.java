import java.util.Scanner;

public class Star_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = sc.nextInt();

        for (int i = 1 ; i<=n; i++){
            for(int j = 1; j<= i; j++){
                //for star triangle
                //System.out.print("* ");

                //for integer triangle 
                System.out.print(j+ " ");

            }
            System.out.println();
        }
    }
}
