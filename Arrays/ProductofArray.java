

public class ProductofArray {
    public static void main(String[] args) {
        // product of Array
        int[] arr ={3,5,4,6,7,8,9};
        int product = 1;
        for(int i =0; i< arr.length;i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}