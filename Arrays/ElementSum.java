
import java.util.Scanner;

public class ElementSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements of array: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        int p= 0;
        for(int i= 0; i<n; i++){
            p+=arr[i];
            
        }
        System.out.println("Sum of elements is "+p);
        
    }
}