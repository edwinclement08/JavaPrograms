/* Name: Edwin Clement
 * Roll No.: 7624
 * Aim: Write a program to implement single inheritance types.
 *          Clock—DigitalClock */


import java.util.*;

class Clock {
    int h, m, s;

    Clock(int h, int m, int s)  {
        this.h = h;
        this.m = m;
        this.s = s;
        correctTime();
    }

    Clock() {
        h = 0;
        m = 0;
        s = 0;
    }

    void correctTime()  {
        while(s >= 60)   {
            s -= 60;
            m++;
        }

        while(m >= 60)  {
            m -= 60;
            h++;
        }

        while(h >= 24)  {
            h -= 24;
        }
    }

    void setTime(int h, int m, int s)  {
        this.h = h;
        this.m = m;
        this.s = s;
        correctTime();
    }

    void displayClock()   {
        System.out.print("The Time is: ");
        System.out.print(h+":"+m+"::"+s);
    }
}

class DigitalClock extends Clock    {
    String apm;

    DigitalClock()  {
        super();
        if(h > 12)  {
            h -= 12;
            apm = "p.m.";
        } else  {
            apm = "a.m.";
        }
    }

    DigitalClock(int h, int m, int s)   {
        super(h, m, s);
        setTime(h, m, s);
    }

    void setTime(int h, int m, int s)   {
        super.setTime(h, m, s);
        if(h > 12)  {
            System.out.println("Yo");
            this.h = h - 12 ;
            apm = " p.m.";
        } else  {
            apm = " a.m.";
        }
    }

    void display()  {
        super.displayClock();
        System.out.println(apm);
    }
}

class Ex10 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Time in integers(in the order hour, min, sec::");
        int h=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();
        DigitalClock dc=new DigitalClock(h,m,s);
        dc.display();
    } 
}

/* Output --
edwin@edwin-hp:~/coding/JavaPrograms$ jc Ex10.java
Enter The Time in integers(in the order hour, min, sec::
12 34 89
The Time is: 12:35::29 a.m.

*/

