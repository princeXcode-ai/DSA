
import java.util.ArrayList;
import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        int a[] = {1,2,3,3,4,5};
        int b[] = {2,3,3,5,6,4,2};

        int i =0; int j= 0;
        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> ans = new ArrayList<>();

        while(i<a.length && j<b.length){
            if(a[i] == b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]< b[i]) i++;
            else j++;
        }
        for(int p = 0; p < ans.size(); p++){
            System.out.print(ans.get(p)+" ");
        }

    }
    // public static void print(int[] ans){
    //     for(int ele : ans){
    //         System.out.print(ele+" ");
    //     }
    //     System.out.println();
    // }
}
