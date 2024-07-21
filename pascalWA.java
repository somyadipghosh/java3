import java.util.*;
public class pascalWA
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int a[]=new int[7];
        a[0]=0;
        a[1]=1;
        for(i=1;i<=6;i++)
        {
            for(j=1;j<=i;j++)
            System.out.print(a[j]+" ");
            for(j=6;j>=1;j--)
            a[j]=a[j]+a[j-1];
            System.out.println();
        }
    }
}