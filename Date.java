//Andrew Liu
//Programming Assignment 9
//Take user input on birthday and current day and output how many days until their birthday
//Date
//Version 1.0
//2/13/2013
public class Date
{
/**
* dMonth is the current month
*/
	private int dMonth;
/**
* dDay is the current day
*/
	private int dDay;
	public Date(int month, int day)
	{
		dMonth = month;
		dDay = day;
	}
/**
* daysInMonth returns the number of days in a given month
* @return int daysMonth which is the number of days in a month
*/

	public int daysInMonth()
	{
		int[] daysMonth = {31,28,31,30,31,30,31,31,30,31,30,31};//int array storing info for how many days are in each month
		return daysMonth[dMonth-1];
	}
/**
* getMonth returns the month
* @return int dMonth which is the month
*/
	public int getMonth()
	{
		return dMonth;
	}
/**
* getDay returns the day
* @return int dDay is the day
*/
	public int getDay()
	{
		return dDay;
	}
/**
* setDate sets the date
*/
	public void setDate(int month, int day)
	{
		dMonth = month;
		dDay = day;
	}
/**
* toString turns the month day combiniation into a string
* @return String dMonth + "/" + dDay
*/
	public String toString()
	{
		return dMonth + "/" + dDay;
	}
/**
* equalsDate checks whether or not it is the user's birthday
* @param Date d, which gives the day and month
* @return boolean equals
*/
	public boolean equalsDate(Date d)
	{
		boolean equals = false;
		if(dDay == d.getDay() && dMonth == d.getMonth())//checks to see if the day equals the birthday
		{
			equals = true;
		}
		return equals;
	}
/**
* nextDay advances the day by one
*/
	public void nextDay()
	{
		dDay++;
		if(dDay > daysInMonth())//if it's the end of the month, the eay will get reset to 1 and month will advance
		{
			dDay = 1;
			dMonth++;
			if(dMonth > 12)//if it's the end of the year, the month will be set to 1
			{
				dMonth = 1;
			}
		}
	}
}