public class pattern10
{
    public static void main(String args[])
    {
        int i,j,l=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print((char)(64+j));
                l--;
            }
            System.out.println();
        }
    }
}