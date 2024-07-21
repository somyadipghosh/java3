import java.util.*;
public class prime_factor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,f,q=1;
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        for(i=2;i<=n;i++)
        {
            f=n%i;
            if(f==0)
            {
                for(int j=2;j<=i/2;j++)
                {
                  q=i%j;
                  if(q==0)
                  break;
                }
                if(q!=0)
                System.out.println(" Prime factor is: "+i);
            }
            q=1;
        }
    }
}
