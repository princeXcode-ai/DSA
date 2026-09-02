import java.util.Scanner;

public class Profitloss {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price :- ");
        double cp = sc.nextDouble();
        System.out.print("Enter selling price :- ");
        double sp = sc.nextDouble();

        if (sp- cp > 0) {
            System.out.print("seller has made profit of money :- ");
            System.out.print(sp-cp);
        }

        if (sp-cp < 0) {
            System.out.print("seller has made loss of money :- ");
            System.out.print(cp-sp);
        }

        if (sp-cp== 0)
            System.out.print("no profit no loss");


    }
}
// add percentaage lose and profit 