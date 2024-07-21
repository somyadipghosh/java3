import java.util.*;
public class project2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String conid;
        int pmode;
        long prevr,presr,unit;
        double echarge,mcharge,final1,rebate=0;
        System.out.print("Enter customer id: ");
        conid=sc.next();
        System.out.print("Enter previous meter reading: ");
        prevr=sc.nextLong();
        System.out.print("Enter new meter reading: ");
        presr=sc.nextLong();
        if(presr<prevr)
        {
            System.out.println("Wrong meter reading : ");
            System.exit(1);
        }
        unit=presr-prevr;
        if(unit<=25)
        echarge=5*unit;
        else if(unit<=60)
        echarge=5*25+(unit-25)*5.5;
        else if(unit<=100)
        echarge=5*25+35*5.5+(unit-60)*6;
        else
        echarge=5*25+35*5.5+6*40+(unit-100)*7;
        mcharge=echarge*0.02;
        final1=echarge+mcharge;
        System.out.print("Please enter the payment mode: \n1.Digital\n2.Cash\nEnter your choice");
        pmode=sc.nextInt();
        if(pmode==1)
        rebate=final1*0.01;
        else if(pmode==2)
        rebate=0;
        else
        {
            System.out.println("Wrong payment mode");
            System.exit(1);
        }
        final1=final1-rebate;
        System.out.println("*********************ELECTRICITY BILL*******************");
        System.out.println("Customer ID: "+conid);
        System.out.println("Previous meter reading: "+prevr);
        System.out.println("Present meter reading: "+presr);
        System.out.println("Unit consumed: "+unit);
        System.out.println("Energy charge: "+echarge);
        System.out.println("Misc.Charge: "+mcharge);
        System.out.println("Payment mode"+(pmode==1?"Digital":"Cash"));
        System.out.println("Rebate: "+rebate);
        System.out.println("Final amount: "+final1);
    }
}
        