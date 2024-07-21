import java.util.*;
public class project3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        char b[]=new char[4];
        int i,x,y;
        char op;
        System.out.print("Enter four numbers: ");
        for(i=0;i<4;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter three operators: ");
        for(i=0;i<3;i++)
        {
            b[i]=sc.next().charAt(0);
        }
        x=a[0];
        for(i=1;i<4;i++)
        {
            y=a[i];
            op=b[i-1];
            switch(op)
            {
                case '+':
                x=x+y;
                break;
                case '-':
                x=x-y;
                break;
                case '*':
                x=x*y;
                break;
                case '/':
                x=x/y;
                break;
                default:
                System.out.println(" GET THE MAN OUT OF HERE ");
                System.exit(1);
            }
        }
        System.out.println("The result: "+x);
    }
}