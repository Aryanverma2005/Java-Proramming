import java.util.Scanner;
class sumtwono
 {
     void sum()
     {
        int a,b;
        Scanner obj = new Scanner(System.in);
        System.out.println(" Enter Your First Number = ");
        a = obj.nextInt();
        System.out.println(" Enter Your Second Number = ");
        b = obj.nextInt();
        int sum = (a+b); 
        System.out.print(" Your Ans ="+sum); 
    }
}
    class soln
    {
    public static void main(String args[]){
        sumtwono ref = new sumtwono();
        ref.sum(); 
    }
}
    
