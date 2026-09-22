import java.util.Arrays;

public class Shallow_DeepCopy{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        // int[] x = arr; // x is shallow copy of arr // 16 bytes
        // x[0] = 100;
        int[] y = Arrays.copyOf(arr, arr.length); // deep copy
        y[0]= 200;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }

}