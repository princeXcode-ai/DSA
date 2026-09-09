// public class Arguments {
//     public static void sum(int a, int b){//parameters
//         System.out.println(a+b);
//     }
//     public static void main(String[] args) {
//         sum(6,7);//Arguments
//     }
// }

public class Arguments {
    public static void max(int a, int b, int c){//parameters
        if (a>=b&& a>= c) System.out.println(a);
        else if (b>= a&& b>= c) System.out.println(b);
        else System.out.println(c);
    }
    public static void main(String[] args) {
        max(6,7,8);//Arguments
    }
}