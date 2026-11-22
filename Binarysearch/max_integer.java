public class max_integer {
    public static void main(String[] args) {
        int[] arr= new int[]{-2, -1, -1, 1, 2, 3};

        int neg =0, pos= 0;
        int a=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<0) neg++;
            else if(arr[i]==0) a++;
            else pos++;
        }
        if(pos>=neg){
            System.out.println(pos);
        }
        else System.out.println(neg);
    }
}
