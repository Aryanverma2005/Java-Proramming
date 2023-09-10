import java.util.Scanner;
class test
{
    void soln()
    {
        int num;
        Scanner obj = new Scanner(System.in);
        System.out.print(" Enter Your Number = ");
        num = obj.nextInt();
        if(num%2==0)
        {
            System.out.println(num + " is Even Number ");
        }
        else
        {
            System.out.println(num + " is Odd Number ");
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