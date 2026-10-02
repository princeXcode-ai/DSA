public class Revese_Array {
    public static void main(String[] args) {
        int arr[] = {3,4,6,8,9,6,4};
        int n = arr.length;
        int i=2 , j = 6-1 ;

        while (i<j){ // it also do swaping of some element of array
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // for(int i=0; i<n/2;i++){
        //     //swap arr[i] and arr[n-1-i]
        //     int temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp;
        // }
        for(int el : arr) System.out.print(el+" ");
    }
}
