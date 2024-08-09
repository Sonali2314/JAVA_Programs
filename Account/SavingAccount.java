class SavingAccount
{
    double balance;
    static double Annualinterest;
    SavingAccount(double b)
    {
        balance=b;
        Annualinterest=4.0;
    }
    void monthlyInterest()
    {
        double monthlyBalance=((balance*Annualinterest)/12)/100;
        balance+=monthlyBalance;
    }
    void Amount()
    {
        System.out.printf("Current Balance of User after interest : %.2f\n",balance);
    }
    static void interest(double in)
    {
        Annualinterest=in;
    }
    void Display()
    {
        System.out.printf("User's Current balance : %.2f\n" ,balance);
        System.out.printf("User's Current Annual Interest Rate : %.2f\n" ,Annualinterest);
    }

}
