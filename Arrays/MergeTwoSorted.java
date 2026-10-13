public class MergeTwoSorted{
    public static void main(String[] args) {
        int[] a ={2,5,6,9,28};
        int[] b ={1,3,4,5,7,8};

        int[] c = new int [ a.length+ b.length];

        for(int ele : c) System.out.print(ele+ " ");
        System.out.println();
        merge(c,a,b);
        for(int ele : c) System.out.print(ele+ " ");
        System.out.println();

    }

    public static void merge (int[]c, int[] a, int[] b){
        int i =0, j=0, k=0;

        while(i<a.length && j< b.length){
            if(a[i]<b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(i ==a.length){ // a array khatam -> b ke bache elements loo
            while (j< b.length) { 
                c[k++] = b[j++];
            }

        }
        if(j ==b.length){ // b array khatam -> a ke bache elements loo
            while (i < a.length) { 
                c[k++] = a[i++];
            }

        }
    }
}