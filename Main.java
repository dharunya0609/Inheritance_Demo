import java.lang.*;
import java.util.*;
class personal
{
String name;
String db;
String rno;
String cls;
personal()
{
Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name:");
    name=sc.nextLine();
    System.out.println("Enter your class");
    cls=sc.nextLine();  
    System.out.println("Enter your rollnumber:");
    rno=sc.nextLine();
    System.out.println("Enter your date of birth :");
    db=sc.nextLine();  
}
}
class educational extends personal
{
int bio,mat,che,phy;
float Ec,Mc;
educational()
{
Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Physics mark:");
phy=sc.nextInt();
System.out.println("Enter your Maths mark:");
mat=sc.nextInt();
System.out.println("Enter your biology mark:");
bio=sc.nextInt();
System.out.println("Enter your chemistry mark:");
che=sc.nextInt();
    }    
void calc()
{
Ec=mat+((phy+che)/2);
Mc=bio+((phy+che)/2);
    System.out.println("NAME:"+name);
    System.out.println("ROLL NUMBER:"+rno);
    System.out.println("CLASS:"+cls);
    System.out.println("DATE OF BIRTH :"+db);
   System.out.println("YOUR ENGINEERING CUTOFF IS "+Ec);
    System.out.println("YOUR MEDICAL CUTOFF IS "+Mc);
}
}
class Main
{
    public static void main(String args[])
    {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of students for which details has to be printed:");
    n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
    educational s2=new educational();
    System.out.println("****STUDENT CUTOFF DETAILS****");
    s2.calc();
    }
    }
}
