public class Max_element{
    public static void main(String[] args) {
        int[] arr= {-4,5,6,87,54,-9};

        // int max= arr[0];
        int max= Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            
        }
        System.out.println(max);
    }
}