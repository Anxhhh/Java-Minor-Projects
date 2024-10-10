import java.util.Scanner;
public class amstrongNo {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        int n,r;
        int sum=0;
        System.out.println("Enter the number: ");
        n = s.nextInt();
        //n assigned as m
        int m = n;
        //while loop
        while(n>0){
            r = n%10;//for the remainder
            n = n/10;//for the quetient
            sum = sum+r*r*r;//for the cube
        }
        //conditional statements
        if(sum==m){
            System.out.println("Yes! it is an amstrong number");
        }
        else{
            System.out.println("It is not an amstrong number");
        }
    }
}
