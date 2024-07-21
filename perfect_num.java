import java.util.*;
public class perfect_num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum,n1,f,j;
        System.out.println("Enter the range");
        n1=sc.nextInt();
        int i=1;
        for(j=1;j<=n1;j++)
        {
           sum=0;
           for(i=1;i<j;i++)
           {     
              if(j%i==0)
              {
              sum=sum+i;
              }
           }
                   if(sum==i)
        System.out.println(i+", ");
        }
    }
}