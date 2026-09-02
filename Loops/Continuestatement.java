// public class Continuestatement {
//     public static void main(String[] args) {
//         for( int i = 1; i <= 100; i++){
//             if (i%2 ==1) continue; // skip this iteration
//             System.out.println(i + " ");
//         }
//     }
// }

public class Continuestatement {
    public static void main(String[] args) {
        for( int i = 1; i <= 20; i++){
            System.out.println(i + " ");
            if(i==7) continue;
            System.out.println("Good morning");
        }
    }
}