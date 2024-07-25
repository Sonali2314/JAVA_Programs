class Date
{
    public static void main(String args[])
    {
        String indate=args[0];
        String[] parts=indate.split(" ");
        int dd=Integer.parseInt(args[0]);
        int mm=Integer.parseInt(args[1]);
        int year=Integer.parseInt(args[2]);
        int odd=0;
        int dayInMonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};

        int base=0;
        if (year>=1600 && year<=2000)
        {base=1600;}
        else if (year>=2000 && year<=2400)
        {base=2000;}

        int yd=year-base-1;
        int yd1=yd/100;
        odd+=yd1*5;
        int yd2=yd%100;

        int start=year-yd2;
        int leapcount=0;
        for(int i=start;i<year;i++)
        {
        if(i % 4==0)
        {   if (i % 100==0)
            {   if (i % 400==0)
                leapcount += 1;
            }
            else
            leapcount+=1;
        }
        }
        
        int oddD=leapcount*2+(yd2-leapcount);
        odd+=oddD;
        for(int i=1;i<mm;i++)
        {
            odd+=dayInMonth[i];
        }
        if(year%4==0 && mm>2)
        {
            odd+=1;
        }
        odd+=dd;
        odd=odd%7;
        System.out.println("-----------------");
        String da[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Day : "+da[odd]);
        System.out.println("-----------------");


    }
}

