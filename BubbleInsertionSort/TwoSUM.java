public class TwoSUM {
    public static void main(String[] args) {
        int arr[] ={7,0,4,3,2,8,10};
        int target = 9;
        int n = arr.length;
        boolean flag = false;

        int i =0; 
        int j = n-1;
        while(i<j){
            if(arr[i]+arr[j]== target) {
                flag = true;
                break;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
        }
        System.out.println(flag);
    }
}
