import java.util.*;
public class pattern4 {
    public static void pattern( int n )
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j<= i; j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j <= (2*(n-1)); j++)
            {
                 System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j<= i; j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(n-1); j++)
            {
                 System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    public static void main(String args[]) 
    {    
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the  number of rows:");
        int n=scanner.nextInt();
        pattern(n);
    }
}
