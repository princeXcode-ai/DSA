public class SingleIndouble {
    public static void main(String[] args) {
        int arr[] ={1,1,2,2,3,3,4,5,5};
        int n = arr.length;

        if (n==1) System.out.println(arr[0]);
        if(arr[0]!=arr[1]) System.out.println(arr[0]);
        if(arr[n-1]!= arr[n-2]) System.out.println(arr[n-1]);
        int lo =0 , hi = n-1;

        while(lo<=hi){
            int mid = lo+(hi -lo)/2;

            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                System.out.println(arr[mid]);
            }
            int f = mid ,s = mid;
            if(arr[mid] == arr[mid-1]) f = mid-1;
            else s = mid +1;
            int leftcount = f - lo;
            int rightcount = hi - s;

            if(leftcount %2 == 0) lo = s+1;
            else hi = f-1;
        }
    }
}
