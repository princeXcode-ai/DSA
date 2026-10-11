public class IntersectionofArray {
    public static void main(String[] args) {
        int [] arr= {10,20,30,40,50,60};
        int [] arr1= {5,10,25,60,50,66};

        for(int i = 0;i<arr.length; i++){
            for(int j =0; j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    System.out.println("common element is "+ arr[i]);
                }

            }
            System.out.println();
        }

    }
}
// 1,2,3,4,5,6,7
// 1,7,2,6,3,5,4