import java.util.*;
public class ParkingLot
{
    int vno,hours;
    double bill;
    void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the vehicle no.");
        vno=in.nextInt();
        System.out.println("Enter the time of parking in hours.");
        hours=in.nextInt();
    }
    void calculate()
    {
        bill=3+(hours-1)*1.5;
    }
    void display()
    {
        System.out.println("*********BILL********");
        System.out.println("Vehicle No.: "+vno);
        System.out.println("Hours: "+hours);
        System.out.println("Amount to be paid: Rs."+bill);
    }
    void main()
    {
        ParkingLot ob=new ParkingLot();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
