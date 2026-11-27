public class practice {
    public static void main(String[] args) {
        int arr[] = new int[] {2,4,5,6,7,8,9};
        int lo = 0, hi= arr.length-1;
        int n =6;

        //nwew way to find mid
        while(lo<=hi){
            int mid = lo+ (hi- lo)/2;

            if(mid == n/mid) System.out.println((int)mid);
            else if (mid>n/mid){
                hi = mid-1;
            }
            else lo = mid +1;

        }
        // initially we find mid directly
        int mid1 = (hi+lo)/2;
        // but it dosen't work with large number 
        System.out.println(mid1);
        System.out.println(hi);

        int arr1[] = {6,5,4,2,4,1};

        int x = arr1.length;

        for(int i = 0 ; i<x;i++){
            for(int j = 0; j<x-1;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }
        for(int ele : arr1){
            System.out.print(ele+" ");
        }
    }
}
