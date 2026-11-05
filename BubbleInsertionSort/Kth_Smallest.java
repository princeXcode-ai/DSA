public class Kth_Smallest {
    public static void main(String[] args) {
        int arr[] = {2,3,3,5,6,4,2};
        int n = arr.length , k =3;
        
        for(int i =0; i< k ;i++){
            int min = Integer.MAX_VALUE, mindx = -1;

            for(int j =0 ; j<n;j++){
                if(arr[j]< min){
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp ;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
