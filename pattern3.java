import java.util.*;
public class pattern3
{
    public static void hollow_rectangle(int row , int col)
    {
        for(int i = 1; i<=row; i++)
        {
            for(int j = 1; j<= col; j++)
            {
                if( i== 1 || i == row || j == 1 || j == col )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print(" Enter the number of columns: ");
        int col = sc.nextInt();
        hollow_rectangle(row,col);
    }
}
