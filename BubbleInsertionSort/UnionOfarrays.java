import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfarrays {
    public static void main(String[] args) {
        int a[] = {1,2,3,3,4,5};
        int b[] = {2,3,3,5,6,4,2};

        Arrays.sort(a);
        Arrays.sort(b);
        int i =0 , j=0;

        ArrayList <Integer> ans = new ArrayList<>();

        while(i<a.length || j < b.length){
            if(a[i] == b[j]){
                ans.add(a[i]);
            }
        }
    }
}
