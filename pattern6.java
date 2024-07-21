import java.util.*;
public class pattern6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,j,l,sp;
        System.out.println("Enter a string: ");
        s=sc.nextLine();
        l=s.length();
        sp=l-1;
        for(i=0;i<l;i++)
        {
           for(j=1;j<=sp;j++)
           System.out.println(" ");
           sp--;
           for(j=0;j<=i;j++)
           {
               System.out.print(s.charAt(j)+" ");
           }
           System.out.println();
        }
    }
}