package com.cadastro.financiamentos.util;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils
{
	public Date addDate(int field, int amount, Date origDate)
	{
		GregorianCalendar gcal = new GregorianCalendar();
		
		try
		{
			gcal.setTime(origDate);
			gcal.add(field, amount);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return ( new Date(gcal.getTime().getTime()) );
	}
}