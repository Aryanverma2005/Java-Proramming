class test
{
    void number()
    {
        int n;
        for(n=0;n<=10;n++)
        {
            System.out.println(n);
        }
    }
}
class soln
{
    public static void main(String[] args)
    {
        test refvar = new test();
        refvar.number();
    }
}