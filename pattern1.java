import java.util.*;
public class pattern1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,j,l;
        System.out.println("Enter a string: ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<=l-1;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
}