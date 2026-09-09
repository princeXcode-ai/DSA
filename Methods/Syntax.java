// public class Syntax {
//     public static void Prince(){
//         System.out.println("Hero");

//     }
//     public static void main(String[] args) {
//         System.out.println("Roshan");
//         Prince();
//         Roshan();
//     }
//     public static void Roshan(){
//         System.out.println("Prince");

//     }
// }
public class Syntax {
    public static void Prince(){
        System.out.println("Hero");
        Roshan();

    }
    public static void main(String[] args) {
        System.out.println("Roshan");
        Prince();
        
    }
    public static void Roshan(){
        System.out.println("Prince");
        Prince();

    }
}
