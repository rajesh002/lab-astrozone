package service;
import model.User;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
public class AstroCalculator{
	String sign;
	public String findSign(String Dob) {
		LocalDate  date=LocalDate.parse(Dob);
		String month=date.getMonth().toString().toLowerCase();
		int day=date.getDayOfMonth();
		if (month.equals("january")) {
	         if (day < 20)
	            sign = "Capricorn";
	         else
	            sign = "Aquarius";
	      } else if (month.equals("february")) {
	         if (day < 19)
	            sign = "Aquarius";
	         else
	            sign = "Pisces";
	      } else if(month.equals("march")) {
	         if (day < 21)
	            sign = "Pisces";
	         else
	            sign = "Aries";
	      } else if (month.equals("april")) {
	         if (day < 20)
	            sign = "Aries";
	         else
	            sign = "Taurus";
	      } else if (month.equals("may")) {
	         if (day < 21)
	            sign = "Taurus";
	         else
	            sign = "Gemini";
	      } else if(month.equals("june")) {
	         if (day < 21)
	            sign = "Gemini";
	         else
	            sign = "Cancer";
	      } else if (month.equals("july")) {
	         if (day < 23)
	            sign = "Cancer";
	         else
	            sign = "Leo";
	      } else if(month.equals("august")) {
	         if (day < 23) 
	            sign = "Leo"; 
	         else
	            sign = "Virgo";
	      } else if (month.equals("september")) {
	         if (day < 23)
	            sign = "Virgo";
	         else
	            sign = "Libra";
	      } else if (month.equals("october")) {
	         if (day < 23)
	            sign = "Libra";
	         else
	            sign = "Scorpio";
	      } else if (month.equals("november")) {
	         if (day < 22)
	            sign = "Scorpio";
	         else
	            sign = "Sagittarius";
	      } else if (month.equals("december")) {  
	         if (day < 22)
	            sign = "Sagittarius"; 
	         else
	            sign ="Capricorn";
	      }
	         return sign;
	   }
		
	}
		
	
