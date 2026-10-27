public class BubbleSort {
    public static void main(String[] args) {
        int arr[] ={1,5,4,3,2,6,9,7};
        int n = arr.length;
        print(arr);

        for(int i =0; i< n-1; i++){
            boolean isSorted = true;
            for(int j =0;j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted= false;
                }
            }
            if(isSorted == true) break;
        }
        print(arr);

    }
    public static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}

