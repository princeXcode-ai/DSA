public class square_root {
    public static void main(String[] args) {
        int n =19;
        // int root =0;
        // for(int i =1; i*i<=n; i++){
        //     if(i*i>n) break;
        //     root = i;
        // }
        // System.out.println(root);

        if(n==0) System.out.println(0);
        int lo =1, hi = n;
        while(lo < hi){
            int mid = lo +(hi-lo)/2;
            if(mid == n/mid) System.out.println(mid);
            else if (mid> n/mid) hi = mid -1;
            else lo = mid +1;
        }
        System.out.println(hi);
    
    }
}
