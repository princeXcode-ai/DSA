public class Two_sum {
    public static void main(String[] args) {
        int[] arr ={-3,4,5,6,7};
        int target = 2;
        int h = 0;

        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length; j++){
                if (arr[i]+arr[j]==target){
                    h = 1;
                }
            }
        }
        if(h==1) System.out.println("True");
        else System.out.println("false");
        }
}
