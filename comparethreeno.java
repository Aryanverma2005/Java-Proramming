import java.util.Scanner;
class Comparision
{
    void compare()
    {
        int a,b,c;
        Scanner obj = new Scanner(System.in);
        System.out.print(" Enter Your First Number = ");
        a = obj.nextInt();
        System.out.print(" Enter Your Second Number = ");
        b = obj.nextInt();
        System.out.print(" Enter Your Third Number = ");
        c = obj.nextInt();
        if( a > b && a > c)
        {
            System.out.println(" First Number is Bigger than Second and Third ");
        }
        else if( b > a && b > c)
        {
            System.out.println(" Second Number is Bigger than First and Third ");
        }
        else
        {
            System.out.println(" Third Number is Bigger than First and Second ");
        }
    }
}
class soln
{
    public static void main(String args[])
    {
        Comparision ref = new Comparision();
        ref.compare();
    }
}