public class waveArray{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,7};
        int n = arr.length;

        if(n %2 ==0){
            for(int i = 0; i < n;i+=2){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                }
        }
        else{
            for (int i = 0; i < n-1; i += 2) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}