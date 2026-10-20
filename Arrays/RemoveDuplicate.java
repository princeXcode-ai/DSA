
import java.util.ArrayList;

public class RemoveDuplicate{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,7,6,5,6};
        ArrayList<Integer> arr1 = new ArrayList<>();

        for(int i =0; i<arr.length;i++){
            for(int j =i+1; j<arr.length;j++){
                if (arr[i] == arr[j]){
                    arr1.add(arr[i]);
                }
            }
        }
        for(int ele : arr1){
            System.out.print(ele+" ");
        }
    }
}