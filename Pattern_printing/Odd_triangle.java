
import java.util.Scanner;

public class Odd_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        int n = sc.nextInt();

        for (int i =1; i<=n;i++){
            for(int j= 1; j<= i*2;j+=2){
                System.out.print(j+ " ");

            }
            System.out.println();
        }

    }
}
