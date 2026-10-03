
import java.util.Scanner;

public class Sum2D_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr1 = new int [10] [10];
        System.out.print("Enter row : ");
        int r = sc.nextInt();
        System.out.print("Enter column : ");
        int c = sc.nextInt();

        System.out.print("Enter elements of array 1: ");

        for(int i=0; i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j] = sc.nextInt();
            }

        }
        int[][] arr2=new int[10][10];
        System.out.print("Enter elements of array 2: ");

        for(int i=0; i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j] = sc.nextInt();
            }

        }
        System.out.println("sum of matrix : ");
        for(int i=0; i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr1[i][j]+arr2[i][j]+"  ");
            }

            System.out.println();

        }
        
    }

}