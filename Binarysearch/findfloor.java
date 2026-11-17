public class findfloor{
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,78};
        int tar = 6,lo = 0, hi = arr.length-1 , idx = -1;

        while(lo<= hi){
            int mid = (lo+hi)/2;

            if(arr[mid]>tar) hi = mid-1;
            else{
                idx = mid;
                lo = mid +1;
            }
        }
        System.out.println(idx);
    }
}