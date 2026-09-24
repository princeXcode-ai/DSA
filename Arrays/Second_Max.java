public class Second_Max {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50,60,70,70};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

// calculate max
        for(int i = 0; i< arr.length; i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }

//calculate second max
        for(int j =0; j<arr.length; j++){
            if (arr[j]>smax && arr[j]!=max){
                smax = arr[j];
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}


