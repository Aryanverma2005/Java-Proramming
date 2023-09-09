import java.util.Scanner;
class pnz
{
    void num()
    {
        int num;
        System.out.print(" Enter Your Number = ");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        if(num>0)
        {
            System.out.println(num +" Entered Number is Positive ");
        }
        else if(num<0)
        {
            System.out.println(num +" Entered Number is Negative ");
        }
        else
        {
            System.out.println(num +" Entered Number is Already Zero ");
        }
    }
}
class soln
{
    public static void main(String args[])
    {
        pnz ref = new pnz();
        ref.num();
    }
}