import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        int n= sc.nextInt();

        int nsp = n-1 , nst = 1;

        for(int i = 1; i<= n; i++){
            for(int j= 1; j<= nsp; j++){
                System.out.print("  ");
            }
            for(int j= 1;j<=nst;j+=1){
                System.out.print("* ");
            }
            nsp--;
            nst +=2;
            System.out.println();
        }

        int npp= n*2-3;

        for(int p = 1 ;p<= n-1;p++){
            for(int s= 1;s<=p;s++){
                System.out.print("  ");
            }
            for(int s = 1; s<=npp; s++){
                System.out.print("* ");
            }
            npp-=2;
            System.out.println();
        }
    }
}
