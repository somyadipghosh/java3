import java.util.*;
public class piglatin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,s1="";
        int l,p=0,i;
        System.out.print("Enter a Sentence: ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                p=i;
                break;
            }
        }
        s1=s.substring(p)+s.substring(0,p)+"AY";
        System.out.println("Piglatin String : "+s1);
    }
}