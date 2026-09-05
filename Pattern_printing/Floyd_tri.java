import java.util.Scanner;

public class Floyd_tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row no. =");
        int n = sc.nextInt();
        int p = 1;
        int j;

        for(int i= 1;i<=n;i++){
            for(j = 1;j<=i;j++){
                System.out.print(p+" ");
                p+=1;
                
            }
            
            System.out.println();
        }
    }
}
