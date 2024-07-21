class prime_rec
{
    int prime(int n,int p)
    {
        if(n==p)
        return 1;
        else if(n%p==0||n==1)
        return 0;
        else
        return prime(n,p+1);
    }
}