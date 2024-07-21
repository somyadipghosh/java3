import java.util.*;
public class RailwayTicket
{
    String name,coach;
    long mob;
    int amt,totalamt;
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the name of the customer.");
        name=in.nextLine();
        System.out.println("Enter the type of coach.");
        coach=in.nextLine();
        System.out.println("Enter the basic amount.");
        amt=in.nextInt();
    }
    void update()
    {
        if(coach=="First")
        totalamt=amt+700;
        else if(coach=="Second")
        totalamt=amt+500;
        else if(coach=="Third")
        totalamt=amt+250;
        else if(coach=="Sleeper")
        totalamt=amt;
        else
        coach="Wrong Input !!!";
    }
    void display()
    {
        if(coach=="Wrong Input !!!")
        System.out.println(coach);
        else
        {
            System.out.println("Name          : "+name);
            System.out.println("Type of Coach : "+coach);
            System.out.println("Total Amount  : Rs."+totalamt);
        }
    }
    public static void main(String args[])
    {
        RailwayTicket ob=new RailwayTicket();
        ob.accept();
        ob.update();
        ob.display();
    }
}
