public class square_root {
    public static void main(String[] args) {
        int n =19;
        int root =0;
        for(int i =1; i*i<=n; i++){
            if(i*i>n) break;
            root = i;
        }
        System.out.println(root);
    }
}
