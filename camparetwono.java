import java.util.Scanner;
class Comparision
{
    void compare()
    {
        int a,b;
        Scanner obj = new Scanner(System.in);
        System.out.print(" Enter Your First Number = ");
        a = obj.nextInt();
        System.out.print(" Enter Your Second Number = ");
        b = obj.nextInt();
        if( a == b)
        {
            System.out.println(" Both Numbers Are Equal ");
        }
        else
        {
            System.out.println(" Both Numbers Are Not Equal ");
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