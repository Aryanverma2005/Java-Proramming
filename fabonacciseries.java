class test
{
    void fabonacci()
    {
        int n1 = 0;
        int n2 = 1;
        int i;
        System.out.print(n1+" "+n2);
        int count = 10;
        for ( i = 2; i <= count ; ++i)
        {
            int n3 = (n1+n2);
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        } 
    }
}
class fabonacciseries
{
    public static void main(String args[])
    {
        test ref = new test();
        ref.fabonacci();
    }
}