import java.util.Scanner;

public class Binary_tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row no. =");
        int n = sc.nextInt();
        int p=1;
        

        for(int i= 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if (i==j || (i+j)%2==0){
                    System.out.print(1+" ");
                    
                }
                else System.out.print(0+" ");
            
                
            }
            
            System.out.println();
        }
    }
}
