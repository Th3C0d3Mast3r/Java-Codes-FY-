import java.util.*;
public class datesss
{
    int year, month, date1, hrs, min, sec;
   
    datesss()
    {
        year=2000;
        month=1;
        date1=1;
        hrs=min=sec=0;
    }
   
    public static void main(String args[])
    {
        datesss ob=new datesss();
        Scanner obj=new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        System.out.println("Input Date in Format of:-");
        System.out.println("1) YEAR MONTH DATE");
        System.out.println("2) YEAR MONTH DATE HRS MIN");
        System.out.println("3) YEAR MONTH DATE HRS MIN SEC");
        int num=obj.nextInt();
        if(num==1)
        {
            System.out.println("YEAR: ");
            a=obj.nextInt();
            System.out.println("MONTH");
            b=obj.nextInt();
            System.out.println("DATE");
            c=obj.nextInt();
            ob.setDate(a,b,c);
            ob.display();
        }
        else if(num==2)
        {
            System.out.println("YEAR: ");
            a=obj.nextInt();
            System.out.println("MONTH");
            b=obj.nextInt();
            System.out.println("DATE");
            c=obj.nextInt();
            System.out.println("HOURS");
            d=obj.nextInt();
            System.out.println("MINUTE");
            e=obj.nextInt();
            ob.setDate(a,b,c,d,e);
            ob.display();
        }
        else if(num==3)
        {
            System.out.println("YEAR: ");
            a=obj.nextInt();
            System.out.println("MONTH");
            b=obj.nextInt();
            System.out.println("DATE");
            c=obj.nextInt();
            System.out.println("HOURS");
            d=obj.nextInt();
            System.out.println("MINUTE");
            e=obj.nextInt();
            ob.setDate(a,b,c,d,e,f);
            ob.display();
        }
        else
        {
            ob.display();
        }
    }


    public void setDate(int a, int b, int c)
    {
        year=a;
        month=b;
        date1=c;
        hrs=0;
        min=0;
        sec=0;
    }


    public void setDate(int a, int b, int c, int d, int e)

    {
        year=a;
        month=b;
        date1=c;
        hrs=d;
        min=e;
        sec=0;
    }


    public void setDate(int a, int b, int c, int d, int e, int f)
    {
        year=a;
        month=b;
        date1=c;
        hrs=d;
        min=e;
        sec=f;
    }


    public void display()
    {
        System.out.println("\nTHE DATE IS:-");
        System.out.println(year+"|"+month+"|"+date1+"\t"+hrs+":"+min+":"+sec);
    }
}

