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

        arr.add(78);
        arr.add(1,100);
        arr.remove(3); 
        arr.remove(arr.size()-1);
        //Collections.reverse(arr);

        int i =0 , j = arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.print(arr);

        ArrayList<Character> arr2 = new ArrayList<>();
        ArrayList<Double> arr3 = new ArrayList<>();
        ArrayList<String> arr4 = new ArrayList<>();
    } 
}