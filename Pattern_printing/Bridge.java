import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        int n= sc.nextInt();

        int nsp = 1, nst = n-1;
        
        for(int a = 1; a<= 2*n -1;a++){
            System.out.print("* ");
        }
        System.out.println();

        for(int i = 1; i<= n; i++){
            for(int j= 1; j<= nst; j++){
                System.out.print("* ");
            }
            for(int j= 1;j<=nsp;j+=1){
                System.out.print("  ");
            }
            for(int r= 1; r<= nst; r++){
                System.out.print("* ");
            }
            nsp+=2;
            nst --;
            System.out.println();
        }
    }
}
