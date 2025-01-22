public class test2D
{
    public static void main(String[] args)
    {
        int[][] arr=
        {{1,2,3,4,5},
        {6,7,8,9,10},
        {11,12,13,14,15},
        {16,17,18,19,20},
        {21,22,23,24,25}};

        
        System.out.println();
        System.out.println("Output 1");


        int curr=0;
        while(curr<5)
        {
        int c1=arr[1].length-1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j =0;j<arr[i].length;j++)
            {
                if(c1>=0)
                {
                    System.out.print(arr[i][curr]+" , ");
                    c1=c1-1;
                    break;
                }
            }
        }
        curr+=1;
    }

        System.out.println();
        System.out.println("Output 2");

        boolean s=true;
        for(int i=0;i<arr.length;i++)
        {
            if (s==true)
            {
                for(int j =0;j<arr[i].length;j++)
                {
                    System.out.print(arr[i][j]+" , ");
                }
                s=false;
            }
            else
            {
                for(int j =arr[i].length-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]+" , ");
                }
                s=true;
            }
        }

        System.out.println();
        System.out.println("Output 3");
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j =0;j<arr[i].length;j++)
            {
                if (i==j)
                {
                    System.out.print(arr[i][j]+" , ");
                }
            }
        }
        int c=arr[1].length-1;
            for(int i=0;i<arr.length;i++)
        {
            for(int j =0;j<arr[i].length;j++)
            {
                if(c>=0)
                {
                    System.out.print(arr[i][c]+" , ");
                    c=c-1;
                    break;
                }
            }
        }
        
    }
}
