import java.util.Scanner;
class test
{
    void soln()
    {
        int year;
        Scanner obj = new Scanner(System.in);
        System.out.print(" Enter Your Year = ");
        year = obj.nextInt();
        if(year%4==0)
        {
            System.out.println(year + " is a leap year ");
        }
        else
        {
            System.out.println(year + " is not a leap year ");
        }
    }
}
class oddeven
{
    public static void main(String args[])
    {
        test refvar = new test();
        refvar.soln();
    }
}