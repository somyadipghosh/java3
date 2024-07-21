public class pattern11
{
    public static void main(String args[])
    {
        int i,j,k=0;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print((char)(64+j));
            }
            for(j=1;j<=k;j++)
            {
                System.out.print((char)(64+j));
            }
            k++;
            System.out.println();
        }
    }
}