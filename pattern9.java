public class pattern9
{
    public static void main(String args[])
    {
        int i,j,l;
        for(i=1;i<=5;i++)
        {
            for(j=i;j<=5;j++)
            {
                System.out.print((char)(64+j));
            }
            System.out.println();
        }
    }
}