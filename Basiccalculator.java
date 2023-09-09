import java.util.Scanner;
class basiccalculator
{
    void calculator()
    {
        int a,b,Ch;
        Scanner obj = new Scanner(System.in);
        System.out.print(" Enter Your First Number = ");
        a = obj.nextInt();
        System.out.print(" Enter Your Second Number = ");
        b = obj.nextInt();
        System.out.println(" What expression do you want to perform? ");
        System.out.println(" Choose The Number ");
        System.out.println(" 1 -: Addition ");
        System.out.println(" 2 -: Subtraction ");
        System.out.println(" 3 -: Multiplication ");
        System.out.println(" 4 -: Division ");
        System.out.print(" So What Number Did You Choose = ");
        Ch = obj.nextInt();
        switch(Ch)
        {
            case 1:
            System.out.println(" Addition = " +(a+b));
            break;
            case 2:
            System.out.println(" Subtraction = " +(a-b));
            break;
            case 3:
            System.out.println(" Multiplication = " +(a*b));
            break;
            case 4:
            System.out.println(" Division = " +(a/b));
            System.out.println(" Remainder = " +(a%b));
            break;
        }
    }
}
class soln
{
    public static void main(String args[])
    {
        basiccalculator ref = new basiccalculator();
        ref.calculator();
    }
}