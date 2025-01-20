import java.util.Scanner;

class Circle
{
    private double radius;
    private double area, circumference;

    Circle()
    {
        radius=1;
    }
    public void setradius()
    {
        System.out.println("Enter Radius : ");
        Scanner sc= new Scanner(System.in);
        radius= sc.nextDouble();
    }
    public void getradius()
    {
        System.out.println("Radius : "+radius);
    }
    public void getarea()
    {
        area= 3.14*radius*radius;
        System.out.println("Area : "+ area);
    }
    public void getcircumference()
    {
        circumference=2*3.14*radius;
        System.out.println("Circumference : "+circumference);
    }
    public void getRecord()
    {
        getradius();
        getcircumference();
        getarea();
    }

}
public class ASS1
{
    public static void main(String[] args)
    {
        Circle c1=new Circle();
        c1.getRecord();
        c1.setradius();
        c1.getRecord();
    }
}