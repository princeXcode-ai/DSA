import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base = sc.nextInt();
        System.out.print("Enter Power: ");
        int power = sc.nextInt();

        int pp =1 ;

        for (int i= 1 ;i<=power;i ++){
             pp *= base;
        }
        System.out.print("Your result is "+ pp);


    }
}
