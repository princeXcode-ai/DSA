public class abcd {
    public static void main(String[] args) {
        int[] arr  = {2,7,11,15}; 
        int target = 26;
        int n = arr.length;

        int i = 0;
        int j = n-1;
        boolean found = false;

        while(i < j){
            if(arr[i] + arr[j] == target){
                found = true;
                break;
            }
            else if(arr[i] + arr[j] > target) j--;
            else i++;
        }

        System.out.println(found ? "hello" : "hii");
    }
}
