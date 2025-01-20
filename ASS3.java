import java.lang.Double;
import java.util.Scanner;
public class ASS3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double n1,n2,max;
        System.out.println("Enter 1st number : ");
        n1=sc.nextDouble();

        System.out.println("Enter 2nd number : ");
        n2=sc.nextDouble();

        max=Double.max(n1,n2);
        System.out.println("Max : "+max);

    }
}
