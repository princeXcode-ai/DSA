import java.util.Scanner;

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         System.out.print("Enter radius :- ");
//        double r = sc.nextDouble();
//        double a =3.141592 * r*r ;
//        System.out.print("Area is :- ");
//        System.out.println(a); 
//     }
// }

// volume of cubiod

// public class input_taken{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter length :- ");
//         double l = sc.nextDouble();

//         System.out.print("\nEnter width :- ");
//         double b = sc.nextDouble();

//         System.out.print("\nEnter height :- ");
//         double h = sc.nextDouble();

//         System.out.print("volume is :- ");
//         System.out.print(l*b*h);
//     }
// }

// total surface area of cubiod
// public class input_taken{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter length :- ");
//         double l = sc.nextDouble();

//         System.out.print("\nEnter width :- ");
//         double b = sc.nextDouble();

//         System.out.print("\nEnter height :- ");
//         double h = sc.nextDouble();

//         double tsa = 2*(l*b+ b*h+ h*l);

//         System.out.print("Total surface area is :- ");
//         System.out.print(tsa);
//     }
// }

// suare of number

// public class input_taken{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number :- ");
//         double a = sc.nextDouble();
//         System.out.print("Square is :- ");
//         System.out.print(a*a);
//     }
// }

// public class input_taken{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter radius :- ");
//         double r= sc.nextDouble();
//         double a = 3.141592 * r *r ;
//         System.out.print("Area is :- ");
//         System.out.println(a);
//     }
// }

// SIMPLE INTEREST

public class input_taken{
    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);

        System.out.print("Enter principle :- ");
        double principle = pp.nextDouble();

        System.out.print("Enter time(years) :- ");
        double time = pp.nextDouble();

        System.out.print("Enter rate :- ");
        double rate = pp.nextDouble();

        double SI = principle * time *rate / 100.0 ;
        System.out.print("Simple interest is :- ");
        System.out.print(SI);


    }
}