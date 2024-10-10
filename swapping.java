import java.util.*;
public class swapping 
//     public static void main (String args[])
//     {
//         Scanner S = new Scanner (System.in);
//         int a,b;
//         System.out.printf("Enter the value of a: ");
//         a = S.nextInt();
//         System.out.printf("Enter the value of b: ");
//         b = S.nextInt();
//         System.out.println("Results before swap " +a +" and "+b);
//         a = a^b;
//         b = b^a;
//         System.out.println("Results after swap " +a +" and "+b);
//     }
// }
{
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.printf("Enter the value of a: ");
        a = s.nextInt();
        System.out.printf("Enter the value of b: ");
        b = s.nextInt();
        System.out.println("Before swap: "+a+ " and "+b);
        System.out.println("After swap: "+b+ " and "+a);
    }
}
