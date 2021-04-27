import java.util.*;

import java.text.SimpleDateFormat;

import java.time.LocalDate;

// class name Hackerrank

class Hackerrank
{

	public static void main (String[] args)

	{
	   
        Scanner sc=new Scanner(System.in); //Scanner class object

             int day,month,year;
 
        
        // taking user input 
 
       
        day=sc.nextInt();
   
               month=sc.nextInt();

                year=sc.nextInt();
 
          LocalDate localDate = LocalDate.of(year, month, day);
  
          java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
 
          System.out.println("Day of week in text:"+dayOfWeek.toString());
  
        }

}
