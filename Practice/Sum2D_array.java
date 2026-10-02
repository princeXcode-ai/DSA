
import java.util.Scanner;

public class Sum2D_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [10] [10];
        System.out.print("Enter row : ");
        int r = sc.nextInt();
        System.out.print("Enter column : ");
        int c = sc.nextInt();

        System.out.print("Enter elements of arr: ");

        for(int i=0; i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }

        }
        for(int i=0; i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();

        }
        
    }

}