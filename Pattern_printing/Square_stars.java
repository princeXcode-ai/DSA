import java.util.Scanner;

public class Square_stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        int row = sc.nextInt();
        int col= row ;
        for (int i = 1; i<= row; i++){
            for (int j =1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}

