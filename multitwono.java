import java.util.Scanner;
class multitwono
{
    void multi()
    {
        int a,b;
        Scanner obj = new Scanner(System.in);
        System.out.print(" Enter Your First Number = ");
        a = obj.nextInt();
        System.out.print(" Enter Your Second Number = ");
        b = obj.nextInt();
        int multi = (a*b);
        System.out.print(" Your Ans = "+multi);
    }
}
class soln
{
    public static void main(String args[]){
        multitwono ref = new multitwono();
        ref.multi();
    }
}
