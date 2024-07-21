class rec
{
    void test(int n)
    {
        if(n==0)
        System.out.println("*");
        else
        {
            System.out.println("Bye"+n);
            test(--n);
            System.out.println("Bye"+n);
        }
    }
}