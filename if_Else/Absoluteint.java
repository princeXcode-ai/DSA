//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :- ");
//         int p = sc.nextInt();
//         if (p < 0)
//             System.out.print(p-(p*2)); // system.out.print(p* -1)

//         else
//             System.out.print(p);

//     }
// }

// if (n < 0) n = -n
//System.out.print(n)

import java.util.Scanner;

public class Absoluteint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:- ");
        double n = sc.nextDouble();
        

        int x = (int)n;

        if (n- x > 0)
            System.out.println("number is not an integer");

        else
            System.out.print("number is an integer");


    }
}