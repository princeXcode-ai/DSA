
import java.util.Scanner;

public class searcharr{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,50,70,80,90,100};

        System.out.print("Search a number : ");
        Scanner sc =new Scanner (System.in);
        int x = sc.nextInt();
        int p = 0;
        
        for(int n = 0; n< arr.length; n++){
            if (x == arr[n]){
                System.out.println("Yes");
                p = 1;
                break;
                }

        }
        if (p==0) System.out.println("No");
            
                
    }

}
