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
        System.out.println(hi);
    }
}
