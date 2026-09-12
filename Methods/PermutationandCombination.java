
// import java.util.Scanner;

// public class PermutationandCombination {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();

//         int nfact=1;
//         for(int i =1 ; i<=n;i++){
//             nfact*=i;

//         }
//         int rfact =1;
//         for(int i =1 ; i<=r;i++){
//             rfact*=i;

//         }
//         int nrfact=1;
//         for(int i =1 ; i<=n-r;i++){
//             nrfact*=i;

//         }
//         int ncr = nfact/(nrfact*rfact);
//         System.out.println(ncr);
//     }
// }

import java.util.Scanner;

public class PermutationandCombination {
    public static int fact(int x){
        int f = 1;
        for(int i = 1; i<=x; i++){
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int ncr = fact(n)/(fact(r)*fact(n-r));
        int npr= fact(n)/fact(n-r);
        System.out.println(ncr);
        System.out.println(npr);


    }   
}


