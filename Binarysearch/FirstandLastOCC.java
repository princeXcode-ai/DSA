import java.util.ArrayList;

public class FirstandLastOCC {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,3,4,4,5};
        int tar = 3;
        ArrayList<Integer> ans = new ArrayList<>();
        int lo =0 , hi = arr.length-1 ;
        int idx = -1;

// first occurance
        while(lo <= hi){
            int mid = (lo+hi)/2;

            if(arr[mid]<tar){
                lo = mid +1;
            }
            else if(arr[mid]> tar){
                hi = mid -1;
            }
            else{
                idx = mid;
                hi = mid -1;
            }
        }
        ans.add(idx);

        // last occurance

        lo = 0;
        hi = arr.length-1;
        idx = -1;

        while(lo<= hi){
            int mid = (lo+hi)/2;

            if(arr[mid]<tar){
                lo = mid +1;
            }
            else if(arr[mid]>tar){
                hi = mid -1;
            }
            else{
                idx = mid;
                lo = mid+1;
            }
        }
        ans.add(idx);


        for(int ele : ans){
            System.out.print(ele+" ");
        }

    }
}
