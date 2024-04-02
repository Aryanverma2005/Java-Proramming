import java.util.*;
class areaofcircle 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius of circle : ");
    float rad = sc.nextFloat();
    double pi = 3.14;
    double area = (pi * rad * rad);
    System.out.println("The Area of the Circle is : " +area);
    }
}