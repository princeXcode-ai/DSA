public class Arrangingcoin {
    public static void main(String[] args) {
        int n = 14;
        if(n==0) System.out.println(0);
        long lo =1, hi = n;
        while(lo<=hi){
            long mid = lo+ (hi- lo)/2;

            if(mid == n/mid) System.out.println((int)mid);
            else if (mid>n/mid){
                hi = mid-1;
            }
            else lo = mid +1;
        }
        System.out.println((int)(hi));

    }
    public int arrangecoin(int n){
        double m = (double)n;
        System.out.print((Math.sqrt(8*m+1)-1)/2);
    }
}
