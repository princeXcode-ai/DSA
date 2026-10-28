public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        int n = arr.length;

        for(int i =0; i< n-1; i++){
            for(int j =0 ; j< n-1;j++){
                if(arr[j]==0 && arr[j] <= arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
    }
    public static void print(int arr[]){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
