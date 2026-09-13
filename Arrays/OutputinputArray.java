
import java.util.Scanner;

public class OutputinputArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // int[] arr = {3,4,-9,9,7,6,8,34,56,78};

        // System.out.println(arr.length);

        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
            
        // }
        // int i = 0;
        // while(i<= 5){
        //     System.out.println(arr[i]);
        //     i++;
        // }

        int[] karan = new int[7];
        for(int i=0;i<karan.length;i++){
            System.out.print(karan[i]+" ");
        }
        System.out.println();

        //INPUT
        for(int i=0;i<karan.length;i++){
            // int x= sc.nextInt();
            // karan[i]=x;
            karan[i]= sc.nextInt();
            System.out.print(karan[i]+" ");

        }
        


    }

}