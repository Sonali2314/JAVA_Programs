import java.util.Scanner;
class Saver
{
    public static void main(String[] args)
    
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Balance : ");
        double b = obj.nextDouble();
        SavingAccount s1=new SavingAccount(b);
        s1.Display();
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter Number of months for saving : ");
        int n = obj1.nextInt();
        for(int i=0;i<n;i++)
        {
            s1.monthlyInterest();
        }
        s1.Amount();
        System.out.println("Increment of Interest rate : ");
        SavingAccount.interest(5.0);
        s1.Display();
        s1.monthlyInterest();
        s1.Amount();
    }
}
