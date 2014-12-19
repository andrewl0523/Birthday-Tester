//Andrew Liu
//Programming Assignment 9
//Take user input on birthday and current day and output how many days until their birthday
//Birthday
//Version 1.0
//2/13/2013
import java.util.*;
public class Birthday
{
/**
*main method
*calls methods, and prompts the user for input
*/
	public static void main(String[]args)
	{
		System.out.print("What is today's date (month and day)? ");//prompts user for current day
		int[] today = takeInput();//stores input in an int array
		int month = today[0];
		int day = today[1];
		Date d = new Date(month, day);
		System.out.print("What is your birthday (month and day)? ");//prompts user for birthday
		int[] birthday = takeInput();
		int bMonth = birthday[0];
		int bDay = birthday[1];
		Date bd = new Date(bMonth, bDay);//creates a birthday object
		int daysMonth = bd.daysInMonth();
		System.out.println("There are " + daysMonth + " days in month #" + bMonth);
		if(month != bMonth || day != bDay)
		{
			System.out.println("Number of days until birthday " + bd.toString() + ": " + numberOfDays(d, bd));//prints number of days until birthday
		}
		else
		{
			System.out.print("Happy birthday!");
		}
	}
/**
*takes user input
*no parameters
*checks to see if there's valid input
* @return int date
* date is the user input
*/
   public static int[] takeInput()
   {
		int[] date = {0,0};
      Scanner userInput = new Scanner(System.in);
		while(date[0] == 0 || date[1] == 0)
		{
			if(userInput.hasNextInt())//checks user input
			{
	      	int month = userInput.nextInt();
				if(month <= 12 && month > 0 && userInput.hasNextInt())//makes sure of valid months
				{
					Date d = new Date(month,1);
					int day = userInput.nextInt();
					if(day <= d.daysInMonth() && day > 0)//makes sure of valid days
					{
					 date[0] = month;
					 date[1] = day;
					}
					else
					{
						System.out.println("Please enter a valid date.");//error message
						userInput.nextLine();
					}
				}
				else
				{
					System.out.println("Please enter a valid date.");
					userInput.nextLine();
				}		
			}
			else
			{
				System.out.println("Please enter a valid date.");
				userInput.nextLine();
			}
		}
		return date;
   }
/**
* numberOfDays counts the number of days from the current day to the birthday
* @param Date d is the current day
* @param Date bd is the birthday
* @return int counter is the number of days
*/ 
	public static int numberOfDays(Date d, Date bd)
	{
		int counter = 0;
		while(!(d.equalsDate(bd)))//will run this while loop until the dates match
		{
			d.nextDay();
			counter++;
		}
		return counter;
	}
}