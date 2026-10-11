public class UnsortedElement{
    public static void main(String[] args) {
        int arr [] ={10,20,30,40,35,28,50};

        for(int i = 0 ; i < arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                System.out.print(arr[i+1]);
                break;
            }
            
        }
    }
}