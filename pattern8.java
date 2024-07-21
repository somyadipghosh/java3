import java.util.*;
public class pattern8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,j,l=0,k;
        System.out.println("Enter a string: ");
        s=sc.nextLine();
        l=s.length();
        k=l-1;
        for(i=0;i<=l-1;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(s.charAt(k));
            }
            System.out.println();
            k--;
        }
    }
}