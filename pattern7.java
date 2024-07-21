import java.util.*;
public class pattern7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,j,l;
        System.out.println("Enter a string: ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            for(j=i;j<=l-1;j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}