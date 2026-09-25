public class Revese_Array {
    public static void main(String[] args) {
        int arr[] = {3,4,6,8,9,6,4};
        int n = arr.length;
        int i=0 , j = n-1 ;

        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++;
        }
        for(int el : arr) System.out.print(el+" ");
    }
}
