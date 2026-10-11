import java.util.ArrayList;

public class BasicArrayList{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(25);
        arr.add(26);
        arr.add(27);
        arr.add(28);
        arr.add(29);

        System.out.print(arr.get(2)); //arr[2]

        arr.set(3,51);
        System.out.print(arr); // not traversing the array by ourselves
        int n = arr.size(); // arr.length

        for(int i =0; i<n ; i++){
            System.out.print(arr.get(i)+" ");
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }

        
    } 
}