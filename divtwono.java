import java.util.Scanner;
class divtwono
{
    void div()
    {
        int a,b;
        Scanner obj = new Scanner(System.in);
        System.out.print(" Enter Your First Number = ");  
        a = obj.nextInt();
        System.out.print(" Enter Your Second Number = ");
        b = obj.nextInt();  
        int div = (a/b);
        int rem = (a%b);
        System.out.println(" Your Ans = "+div);
        System.out.println(" Your Rem = "+rem);
    }
}
class soln
{
    public static void main(String args[]){
        divtwono ref = new divtwono();
        ref.div();
    }
}
