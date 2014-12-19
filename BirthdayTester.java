//Andrew Liu
//Programming Assignment 9
//Take user input on birthday and current day and output how many days until their birthday
//BirthdayTester
//Version 1.0
//2/13/2013
public class BirthdayTester
{
/**
*main method which prints all the tests
*/
	public static void main(String[] args)
	{	
		System.out.println(testAccessorMutator());//prints test results
		System.out.println();
		System.out.println(testToString());
		System.out.println();
		System.out.println(testEquals()); 
		System.out.println();
		System.out.println(testDaysInMonth());
		System.out.println();
		System.out.println(testNextDay());
		System.out.println();
	}
/**
* tests if access to the date and month in Date is correct
* @return boolean accessor which is true if the method works correctly
*/
	public static boolean testAccessorMutator()
	{	
		boolean accessor = false;
		System.out.println("Creating Date 8/19");
		Date d = new Date(8,19);
		if(d.getMonth() == 8 && d.getDay() == 19)//checks to see if the values match
		{
			accessor = true;
		}
		else
		{
			accessor = false;
		} 
		System.out.println("Checking getMonth() == 8: " + accessor);//prints results
		System.out.println("Checking getDay() == 19: " + accessor);	
		System.out.println("Setting date to 12/31");
		Date dd = new Date(12,31);
		if(dd.getMonth() == 12 && dd.getDay() == 31)
		{
			accessor = true;
		}
		else
		{
			accessor = false;
		} 
		System.out.println("Checking getMonth() == 12: " + accessor);
		System.out.println("Checking getDay() == 31: " + accessor);	
		System.out.print("testAccessorMutator returned: ");
		return accessor;
	}
/**
* testToString tests if the method toString converts the month and day to a string correctly
* @return boolean tstring which is true if the method works properly
*/
	public static boolean testToString()
	{	
		boolean tstring = false;
		System.out.println("Creating Date 3/12");
		Date d = new Date(10,11);
		if(d.toString().equals("10/11"))//checks to see if the method works correctly
		{
			tstring = true;
		}
		else
		{
			tstring = false;
		} 
		System.out.println("Checking toString() == 3/12: " + tstring);//prints results
		System.out.print("testToString returned: ");
		return tstring;
	}
/**
* testEquals tests if the equals method works correctly
* @return boolean tequal is true if the method works
*/
	public static boolean testEquals()
	{
		boolean tequal = false;
		System.out.println("Creating Date 3/12");
		Date d = new Date(3,12);
		System.out.println("Creating Date 4/5");
		Date dd = new Date(4,5);
		System.out.println("Creating Date 3/12");
		Date ddd = new Date(3,12);
		if(ddd.getDay() == 12 && ddd.getMonth() == 3)
		{
			tequal = true;
		}
		else
		{
			tequal = false; 
		}
		System.out.println("Checking if 3/12 equals() 3/12: " + tequal);//checks to see if the equals method works properly
		if(ddd.getDay() == 5 && ddd.getMonth() == 4)
		{
			tequal = true;
		}
		else
		{
			tequal = false; 
		}

		System.out.println("Checking if 3/12 equals() 4/5: " + tequal);
		if(ddd.getDay() == 12 && ddd.getMonth() == 3)
		{
			tequal = true;
		}
		else
		{
			tequal = false; 
		}
		System.out.print("testEquals returned: ");//prints results
		return tequal;
	}
/**
* testDaysInMonth tests if the method daysInMonth works correctly
* @return boolean dayin is true if the methods works properly
*/
	public static boolean testDaysInMonth()
	{
		boolean dayin = false;
		for(int ii = 1; ii <= 12; ii++)
		{
			System.out.println("Creating Date " + ii + "/1");
			Date d = new Date(ii,1);
			if(d.daysInMonth() == d.daysInMonth())//checks to see if it's equal
			{
				dayin = true;
			}
			else
			{
				dayin = false; 
			}
				System.out.println("Day in month " + ii + " is " + d.daysInMonth() + " is: " + dayin);//prints results
		}
		System.out.print("testDaysInMonth returned: ");
		return dayin;
	}
/**
* testNextDay checks if nextDay works
* @return boolean tnext is true if the method works properly
*/		
	public static boolean testNextDay()
	{
		boolean tnext = false;
		System.out.println("Creating Date 1/1");
		Date d = new Date(1,1);
		System.out.println("Incrementing date 1/1 by 5 days");
		for(int ii = 1; ii <= 5; ii++)
		{
			d.nextDay();
		}
		if(d.getDay() == 6 && d.getMonth() == 1)//checks to make sure advancement is correct
		{
			tnext = true;
		}
		else
		{
			tnext = false; 
		}
		System.out.println("Is date now 1/6: " + tnext);
		System.out.println("Creating Date 4/30");
		Date dd = new Date(4,30);
		System.out.println("Incrementing date 4/30 by 5 days");
		for(int jj = 1; jj <= 5; jj++)
		{
			dd.nextDay();
		}
		if(dd.getDay() == 5 && dd.getMonth() == 5)
		{
			tnext = true;
		}
		else
		{
			tnext = false; 
		}
		System.out.println("Is date now 5/5: " + tnext);
		System.out.println("Creating Date 12/20");
		Date ddd = new Date(12,20);
		System.out.println("Incrementing date 12/20 by 20 days");
		for(int kk = 1; kk <= 20; kk++)
		{
			ddd.nextDay();
		}
		if(ddd.getDay() == 9 && ddd.getMonth() == 1)
		{
			tnext = true;
		}
		else
		{
			tnext = false; 
		}
		System.out.println("Is date now 1/9: " + tnext);//prints results
		System.out.print("testNextDay returned: ");
		return tnext;
	}	
}
	