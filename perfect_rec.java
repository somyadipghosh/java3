class perfect_rec
{
    int num;
    perfect_rec(int nm)
    {
        num=nm;
    }
    int sum_of_factors(int i)
    {
        if(i==num)
        return 0;
        else if(num%i==0)
        return i+sum_of_factors(i+1);
        else
        return sum_of_factors(i+1);
    }
    void check()
    {
        if(num==sum_of_factors(1))
        System.out.print("Perfect number");
        else
        System.out.print("Not perfect number");
    }
    void main(int p)
    {
        perfect_rec ob=new perfect_rec(p);
        ob.check();
    }
}