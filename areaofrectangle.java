import java.util.*;
class areaofrectangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of rectangle :");
        float len = sc.nextFloat();
        System.out.print("Enter the width of rectangle :");
        float wid = sc.nextFloat();
        float Area = (len*wid);
        System.out.print("The area of the rectangle is : "+Area);
    }
}