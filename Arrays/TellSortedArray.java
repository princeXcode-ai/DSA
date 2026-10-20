public class TellSortedArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,2,4,5,6};
        int p = 0;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] > arr[i+1]){
               p = 1;
               break;
            }
        }
        System.out.print((p == 1) ? false : true);
    }
}
