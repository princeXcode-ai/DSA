public class MinInArray{
    public static void main(String[] args) {
        int[] arr = {3,4,5,-7,98};
        int min = Integer.MAX_VALUE;

        for(int i=0; i< arr.length; i++){
            if(arr[i]<min) min = arr[i];

        }
        System.err.println(min);
    }
}