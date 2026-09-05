
import java.util.Scanner;

public class Alphabet_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        int n = sc.nextInt();


    //FOR CONTINUOUS ALPHABET
        // for(int i =1; i <= n; i++){
        //     for(int j =1; j<= i;j++){
        //         System.out.print((char)(j+64)+" ");

        //     }
        //     System.out.println();
        // }
        for(int i =1; i <= n; i++){
            for(int j =1; j<= i;j++){
                System.out.print((char)(i+64)+" ");

            }
            System.out.println();
        }
    }
}
