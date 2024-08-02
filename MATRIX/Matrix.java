import java.util.Scanner;
class Matrix
{
    int[][] A;
    int[][] B;
    int size;
    Matrix(int size)
    {
        A=new int [size][size];
        B=new int [size][size];
        this.size=size;
    }
    void input()
    {
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter First Matrix :\n");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                A[i][j]=obj1.nextInt();
            }
        }
        Scanner obj2=new Scanner(System.in);
        System.out.println("Enter Second Matrix :\n");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                B[i][j]=obj2.nextInt();
            }
        }
    }
    void Display()
    {
        System.out.println(" MATRIX 1st : ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" MATRIX 2nd : ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(B[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    void addMatrix()
    {
        System.out.println(" ADDITION OF MATRICES : ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                int C=A[i][j]+B[i][j];
                System.out.print(C + " ");
            }
            System.out.println(" ");
        }
    }
    void subMatrix()
    {
        System.out.println(" SUBTRACTION OF MATRICES A-B : ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                int C=A[i][j]-B[i][j];
                System.out.print(C + " ");
            }
            System.out.println(" ");
        }
    }
    void mulMatrix()
    {
        System.out.println(" MULTIPLICATION OF MATRICES A-B : ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                for(int k=0)
                int C=A[i][j]-B[i][j];
                System.out.print(C + " ");
            }
            System.out.println(" ");
        }
    }
}
