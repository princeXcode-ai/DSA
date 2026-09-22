// public class PassingArrayToMethod{
//     public static void main(String[] args) {
//         int x = 10;
//         change(x);
//         System.out.println(x);
//     }


//     public static void change(int x) {
//         x = 20;
//     }
// }

public class PassingArrayToMethod{
    public static void main(String[] args) {
        int x[] = {10,20,33,44,55};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }


    public static void change(int[] y) {
        y[2] = 88;
    }
}
