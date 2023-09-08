import java.util.Scanner;
class subtwono
{
    void sub()
    {
        int a,b;
        Scanner obj = new Scanner(System.in);
        System.out.print(" Enter Your First Number = ");  
        a = obj.nextInt();
        System.out.print(" Enter Your Second Number = ");
        b = obj.nextInt();  
        int sub = (a-b);
        System.out.print(" Your Ans = "+sub);
    }
}
class soln
{
    public static void main(String args[]){
        subtwono ref = new subtwono();
        ref.sub();
    }
}
