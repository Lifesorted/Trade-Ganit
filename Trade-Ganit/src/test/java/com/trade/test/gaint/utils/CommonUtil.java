package com.trade.test.gaint.utils;

import com.ibm.icu.text.SimpleDateFormat;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;

import java.text.ParseException;
import java.util.Date;
import java.util.Random;
import java.util.logging.Logger;

public class CommonUtil {

	private static Logger logger = Logger.getLogger(CommonUtil.class.getName());

	public static String setParameterValue(String defaultValue, String passedValue) {
		String parameterValue = StringUtils.isNotBlank(passedValue) ? passedValue : defaultValue;
		return parameterValue;
	}

	public static void staticWaitFor(Long milliSec) {
		try {
			Thread.sleep(milliSec);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * This method will convert date string from one format to another format
	 * 
	 * @param inputDateString
	 * @param formatIn
	 * @param formatOut
	 * @return formated date
	 */
	public static String dateFormatConvertor(String inputDateString, String formatIn, String formatOut) {

		SimpleDateFormat inputFormat = new SimpleDateFormat(formatIn);
		SimpleDateFormat outputFormat = new SimpleDateFormat(formatOut);
		Date inputDate = null;

		try {
			inputDate = inputFormat.parse(inputDateString);
		} catch (ParseException e) {
			logger.severe("Parse Exception occurred while parsing the date : " + inputDateString + "to the format:"
					+ formatIn);
			return inputDateString;
		}

		String outputDateString = outputFormat.format(inputDate);

		return outputDateString;
	}

	public static String generateNineDigitNumber() {
		String nowString = new java.text.SimpleDateFormat("yyMMdd").format(DateTime.now().toDate());
		String id = nowString.concat(String.valueOf(100 + (int) (Math.random() * ((999 - 100) + 1))));

		return id;
	}

	public static String generatetwelveDigitNumber() {
		String nowString = new java.text.SimpleDateFormat("yyyyMMdd").format(DateTime.now().toDate());
		String id = nowString.concat(String.valueOf(10000 + (int) (Math.random() * ((999 - 100) + 1))));

		return id;
	}
	
	public static Integer generateRandomNumber() {
		Random rand = new Random();
		int id = rand.nextInt(10000);
		return id;
	}

	public static String getCurrentDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		return formatter.format(date);
	}

	public static boolean compareDates(String d1, String d2) {
		try {

			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			Date date1 = sdf.parse(d1);
			Date date2 = sdf.parse(d2);

			if (date1.after(date2)) {
				return true;
			}else if (date1.before(date2)) {
				return true;
			}else {
				return true;
			}

		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		return true;
	}

	
	
	  public static void main(String[] args) {
	  System.out.println(CommonUtil.getCurrentDate());
	  
	  }
	 
}
