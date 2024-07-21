import java.util.*;
class prime_palindrome
{
    int m,n,rev,c;
    void accecpt()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lower range: ");
        m=sc.nextInt();
        System.out.print("Enter Upper range: ");
        n=sc.nextInt();
    }
    void palindrome_calculate()
    {
        int num,tmp,i;
        System.out.print("The prime palidrome numbers are: ");
        for(num=m;num<=n;num++)
        {
            if(m<3000 && n<3000)
            {
                break;
            }
            c=0;
            rev=0;
            tmp=num;
            for(i=1;i<=tmp;i++)
            {
                if(tmp%1==0)
                c++;
            }
            if(c==2)
            {
                while(tmp>0)
                {
                    rev=rev*10+(tmp%10);
                    tmp=tmp/10;
                }
            }
        }
    }
    public static void main(String args[])
    {
       prime_palindrome ob=new prime_palindrome();
       ob.accecpt();
       ob.palindrome_calculate();
    }
}    