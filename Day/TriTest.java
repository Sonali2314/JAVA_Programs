import java.util.Scanner;
class Triangle
{
    private double s1,s2,s3;
    Triangle()
    {
        s1=2;
        s2=3;
        s3=5;
    }
    Triangle(double s1, double s2, double s3)
    {
        this.s1=s1; 
        this.s2=s2;
        this.s3=s3;
    }
    public void accept()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter s1 : ");
        s1= sc.nextDouble();
        System.out.println("Enter s2 : ");
        s2= sc.nextDouble();
        System.out.println("Enter s3 : ");
        s3= sc.nextDouble();
        System.out.println();
    }
    public void sets1(double s)
    {
        s1=s;
    }
    public void sets2(double s)
    {
        s2=s;
    }
    public void sets3(double s)
    {
        s3=s;
    }
    public double gets1()
    {
        return s1;
    }
    public double gets2()
    {
        return s2;
    }
    public double gets3()
    {
        return s3;
    }
    public void display()
    {
        System.out.printf("Sides : %f %f %f /n",s1,s2,s3);
    }
    public void calcperi()
    {
        double p = s1+s2+s3;
        System.out.println("Perimeter : " +p);
    }
    public boolean isValid()
    {
        if (s1+s2<s3 || s1+s3<s2 || s2+s3<s1)
        {
            System.out.println(" Traingle is valid ");
            return true;
        }
        else
        {
            System.out.println(" Traingle is not valid ");
            return false;
        }
    }

}
public class TriTest {

	public static void main(String[] args) {
        Triangle[] arr = new Triangle[4];
        for (int i=0;i<4;i++)
        {
            System.out.println("enter triangle "+i);
            arr[i]=new Triangle();
            arr[i].accept();
        }
        for (int i=0;i<4;i++)
        {
            if (arr[i].isValid()==true)
            {
                arr[i].calcperi();
            }
        }

    }
}
