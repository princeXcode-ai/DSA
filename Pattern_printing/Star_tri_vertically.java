
import java.util.Scanner;

// public class Star_tri_vertically {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n= sc.nextInt();

//         for(int i = 1; i<= n; i++){
//             for(int j= 1; j<= n; j++){
//                 if (i+j > n) System.out.print("* ");
//                 else System.out.print("  ");
//             }
//             System.out.println();
//         }
//     }
// }


//METHOD 2

public class Star_tri_vertically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");

        int n= sc.nextInt();

        for(int i = 1; i<= n; i++){
            for(int j= 1; j<= n-i; j++){
                System.out.print("  "); // space wala loop
            }
            for(int j= 1;j<=i;j++){
                System.out.print("* ");// stars
            }
            System.out.println();
        }
    }
}
