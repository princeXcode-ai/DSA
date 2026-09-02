import java.util.Scanner;

public class Alphabet_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = sc.nextInt();

        if(n>26) System.out.print("Error Occurs");
        else{
            // for(int i=1;i <= n;i++){
            //     for(int j =1;j <=n ;j++){
            //         // int p = j+64;
            //         // System.out.print((char)p+" ");
            //         System.out.print((char)(j+64)+" ");
            //     }
            //     System.out.println(" ");
            // }


        // for small alphabets.
            for (int i = 1; i <= n; i++){
                for (int j=1;j<=n;j++){
                    System.out.print((char)(j+96)+" ");

                }
                System.out.println();
            }
        }


    }
}
