class Complex
{
    private double imaginary,real;
    public void init(double i , double r)
    {
        imaginary=i;
        real=r;
    }
    public void getRecord()
    {
        System.out.println("Imaginary : "+imaginary);
        System.out.println("Real : "+real);
    }
}
public class ASS4 
{
    public static void main(String[] args)
    {
        Complex im = new Complex();
        double i,r;
        r=Double.parseDouble(args[0]);
        i=Double.parseDouble(args[1]);
        im.init(i,r);
        im.getRecord();

    }
}
