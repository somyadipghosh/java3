import java.util.*;
public class project1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String snacks[]={"Bread and Egg","Poori Sabji","Poha"};
        String meal[]={"Veg meal","Non Veg Meal"};
        int ch,ch1,n;
        double amt,gst;
        char c;
        while(true)
        {
            System.out.print("\nFOOD MENU\n1.ALL TIME SNACKS\n2.MEALS\n3.EXIT\nEnter your choice: ");
            ch=sc.nextInt();
            if(ch==3)
            {
                System.out.println("Thank you");
                break;
            }
            switch(ch)
            {
                case 1:
                System.out.print("\nALL TIME SNACKS\n1.Bread and egg\n2.Poori Sabji\n3.Poha\n4.Back to main menu\nEnter your choice: ");
                ch1=sc.nextInt();
                if(ch1==4)
                break;
                if(ch1>=1&&ch1<=3)
                {
                    System.out.print("Enter number of plates: ");
                    n=sc.nextInt();
                }
                else
                {
                    System.out.print("Enter a valid option");
                    break;
                }
                amt=n*50;
                gst=amt*0.05;
                System.out.println("***************FOOD BILL*****************");
                System.out.println("1. Food opted: "+snacks[ch1-1]);
                System.out.println("2. No. of plates: "+n);
                System.out.println("3. Food cost: "+amt);
                System.out.println("4. Total GST: "+gst);
                System.out.println("5. Final Amount: "+(amt+gst));
                break;
                
                case 2:
                System.out.print("\nMEALS\n1.Veg meal\n2.Non veg meal\n3.Back to main menu\nEnter your choice: ");
                ch1=sc.nextInt();
                if(ch1==3)
                break;
                if(ch1>=1&&ch1<=2)
                {
                    System.out.print("Enter number of plates: ");
                    n=sc.nextInt();
                }
                else
                {
                    System.out.print("Enter a valid option");
                    break;
                }
                amt=n*80;
                gst=amt*0.05;
                System.out.println("***************FOOD BILL*****************");
                System.out.println("1. Food opted: "+meal[ch1-1]);
                System.out.println("2. No. of plates: "+n);
                System.out.println("3. Food cost: "+amt);
                System.out.println("4. Total GST: "+gst);
                System.out.println("5. Final Amount: "+(amt+gst));
                break;
                
                default: 
                System.out.println(" GO AND MAKE YOUR MEAL ");
            }
        }
    }
}