package com.quinnox.qtvt.util;


import java.util.Calendar;
import java.util.Date;

public class WorkingDays {
	public static long getWorkingDaysBetweenTwoDates(Date startDate, Date endDate) {
	    Calendar startCal = Calendar.getInstance();
	    startCal.setTime(startDate);        
	   
	    Calendar endCal = Calendar.getInstance();
	    endCal.setTime(endDate);

	    long workDays = 0;

	    //Return 0 if start and end are the same
	    if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
	        return 1;
	    }

	    if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
	        startCal.setTime(endDate);
	        endCal.setTime(startDate);
	    }

	    do {
	       //excluding start date
	        
	        if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
	            ++workDays;
	        }
	        startCal.add(Calendar.DAY_OF_MONTH, 1);
	    } while (startCal.getTimeInMillis() <= endCal.getTimeInMillis()); //excluding end date
	     
	    return workDays;
	}

}
