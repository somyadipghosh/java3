import java.util.*;
public class Q12APCARR
{
    public static void main(String args[])
    {
        int i;
        int roll[]=new int[40];
        int e[]=new int[40];
        int m[]=new int[40];
        int p[]=new int[40];
        int c[]=new int[40];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<40;i++)
        {
            System.out.print("Enter roll: ");
            roll[i]=sc.nextInt();
            System.out.println("Enter English marks: ");
            e[i]=sc.nextInt();
            System.out.println("Enter Maths marks: ");
            m[i]=sc.nextInt();
            System.out.println("Enter Physics marks: ");
            p[i]=sc.nextInt();
            System.out.println("Enter Chemistry marks: ");
            c[i]=sc.nextInt();
        }
        for(i=0;i<40;i++)
        {
            if(e[i]>=35&&(m[i]>=35&&p[i]>=35||m[i]>=35&&c[i]>=35||c[i]>=35&&p[i]>=35))
            System.out.println(roll[i]+"Promoted");
            else
            System.out.println(roll[i]+"Not Promoted");
        }
    }
}