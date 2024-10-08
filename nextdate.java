import java.util.Scanner;
class nextdate
{
	static boolean isly(int year)
	{
		return (year%400==0)||(year%100!=0&&year%4==0);
	}
	static int getdays(int month,int year)
	{
		switch (month)
		{
			case 2:
			   return isly(year)?29:28;
			case 4:
			   return 30;
			case 6:
			   return 30;
			case 9:
			   return 30;
			case 11:
			   return 30;
			default:
			   return 31;
		}
	}
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = s.nextInt();
        System.out.print("Enter month: ");
        int month = s.nextInt();
        System.out.print("Enter year: ");
        int year = s.nextInt();       
        int daysinmonth=getdays(month,year);
        if (day < daysinmonth) 
		{
            day++;
        } 
		else {
            day = 1;
            if (month < 12) 
			{
                month ++;
            } 
			else 
			{
                month=1;
				year++;
            }
        }
        System.out.println("Next date: " + day + "-" + month + "-" + year);
        s.close();
    }	   
}		
