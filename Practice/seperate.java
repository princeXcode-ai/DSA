import java.util.Scanner;

public class seperate {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System .in);
        int[] arr={0,1,1,1,0,0};
        int numofZero =0 ;
        int numofOne = 0;
        
        for(int ele : arr){
            if (ele ==0) numofZero +=1;
            else numofOne +=1;
        }
        int[] arr1 = new int [numofZero];
        for(int i=0; i<numofZero; i++){
            arr1[i]=0;
        }
        int[] arr2 = new int [numofOne];
        for(int i=0; i<numofOne; i++){
            arr2[i]=1;
        }

        // mearge two array to create one array

        for(int ele: arr1){
            System.out.print(ele);
        }
        for(int ele: arr2){
            System.out.print(ele);
        }

        

    }
}
