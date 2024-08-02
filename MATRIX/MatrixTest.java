import java.util.Scanner;
class MatrixTest
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF MATRIX : ");
        int size=obj.nextInt();
        Matrix M=new Matrix(size);
        M.input();
        M.Display();
        Scanner ch=new Scanner(System.in);
        System.out.println("1:ADDITION OF MATRIX\n2:SUBTRACTION OF MATRIX\n3:MULTIPLICATION OF MATRIX\nENTER YOUR CHOICE : ");
        int choice=ch.nextInt();
        switch (choice)
        {
            case 1:
            {
                M.addMatrix();
                break;
            }
            case 2:
            {
                M.subMatrix();
                break;
            }
            case 3:
            {
                M.mulMatrix();
                break;
            }
        }
    }
}
