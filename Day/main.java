import java.lang.Math;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
class Math1
{
    public static int factorial(int num)
    {
        int ans=1;
        for(int i=1;i<=num;i++)
        {
            ans*=i;
        }
        return ans;
    }
    public static boolean isPrime(int n)
    {
        if (n<=1)
        {
            return false;
        }
        if( n==2 || n==3)
        {
            return true;
        }
        if(n%2==0 || n%3==0)
        {
            return false;
        }
        for(int i=5;i<=Math.sqrt(n); i=i+6)
        {
            if(n%i==0 || n%(i+2)==0)
            {
                return false;
            }
            return true;
        }
        return true;
    }
    public static void printPositiveNegative(int n)
    {
        if(n<0)
        {
            System.out.println("Number is Negative");
        }
        else{
        System.out.println("Number is Positive");}

    }
}

public class main{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Menu /n1 : factorial/n2 : Prime/n3 : Posive or Negative /n4 : Exit/n");
        System.out.print("Enter the choice : ");
        int choice=s.nextInt();
        while(choice !=4){
        switch(choice)
        {
            case 1:
            {
                System.out.print("Enter num : ");
                int num=s.nextInt();
                int ans=Math1.factorial(num);
                System.out.println("Answer = "+ans);
                break;
            }
            case 2:
            {
                System.out.print("Enter num : ");
                int num=s.nextInt();
                boolean ans=Math1.isPrime(num);
                if (ans)
                {
                    System.out.println("Number is Prime");
                }
                else
                {
                    System.out.println("Number is not Prime");
                }
                break;
            }
            case 3:
            {
                System.out.print("Enter num : ");
                int num=s.nextInt();
                Math1.printPositiveNegative(num);
                break;
            }
            default:
            {
                System.out.println("Wrong Input");
            }
        }
        System.out.print("Enter the choice : ");
        choice=s.nextInt();
    }
    }
}
