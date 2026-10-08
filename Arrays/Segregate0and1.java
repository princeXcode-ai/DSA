// public class Segregate0and1 {
//     public static void main(String[] args) {
//         int arr[] ={0,0,1,1,0,1,0};

//         int zeros = 0;
//         int ones= 0;

//         for(int ele : arr){
//             if (ele == 0) zeros++;
//             else ones++;
//         }

//         int arr1[] = new int [zeros+ones];

//         for(int j=0;j<zeros;j++){
//             arr1[j]=0;
//         }
//         for(int k=zeros;k<zeros+ones;k++){
//             arr1[k]=1;
//         }

//         for(int p =0;p<arr1.length;p++){
//             System.out.print(arr1[p]+" ");
//         }

//     }
// }

// public class Segregate0and1 {
//     public static void main(String[] args) {
//         int arr[] ={0,0,1,1,0,1,0};

//         int zeros = 0;
        

//         for(int ele : arr){
//             if (ele == 0){
//                 zeros++;
//             }
//         }
//         for(int i =0; i< arr.length; i++){
//             if(i< zeros){
//                 arr[i]= 0;
//             }
//             else{
//                 arr[i] =1;
//             }
//         }
//         for(int ele : arr){
//             System.out.print(ele+" ");
//         }

//     }
// }

//TWO POINTER TECHNIQUE

public class Segregate0and1 {
    public static void main(String[] args) {
        int arr[] ={0,0,1,1,0,1,0};

        int n = arr.length;
        int i =0, j = n-1;

        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(i>j) break;
            if (arr[i]==1 && arr[j]==0){
                arr[i] =0;
                arr[j] =1;
                i++;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
}