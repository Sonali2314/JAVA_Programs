import java.util.Scanner;
interface Stack
{
    public int push(int e);
    public void pop();
    public void displayS();
}
interface Queue
{
    public int enqueue(int e);
    public void dequeue();
    public void displayQ();
}
class StackQueue implements Stack,Queue
{
    int maxS;
    int []array;
    int top;
    int end;
    StackQueue(int s)
    {
        array=new int [s];
        maxS=s;
        top=-1;
        end=0;
    }
    public int push(int e)
    {
        if (array.length == maxS)
        {
            System.out.println("----- Stack Overflow -----");
            return -1;
        }
        else
        {
            array[top]=e;
            top++;
            System.out.println("----- Element Pushed in Stack" +e+ " -----");
            return 0;
        }
    }
    public void pop()
    {
        if (array.length == -1)
        {
            System.out.println("----- Stack Underflow -----");
        }
        else
        {
            System.out.println("----- Element Poped from Stack"+array[top]+ " -----");
            top--;
        }
    }
    public void displayS()
    {
        System.out.println("----- Stack Elements -----");
        for(int i:array)
        {
            System.out.println(i);
        }
    }
    public int enqueue(int e)
    {
        if (array.length == maxS)
        {
            System.out.println("----- Queue Overflow -----");
            return -1;
        }
        else
        {
            top=(top+1)%maxS;
            array[top]=e;
            System.out.println("----- Element Pushed in Queue" +e+ " -----");
            return 0;
        }
    }
    public void dequeue()
    {
        if (array.length == -1)
        {
            System.out.println("----- Queue Underflow -----");
        }
        else
        {
            System.out.println("----- Element Poped from Queue"+array[top]+ " -----");
            end=(end-1)%maxS;
        }
    }
    public void displayQ()
    {
        System.out.println("----- Queue Elements -----");
        for(int i:array)
        {
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int m=s.nextInt();
        
    }
}
