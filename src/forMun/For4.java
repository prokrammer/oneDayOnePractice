package forMun;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class For4{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		//2007斥 1岿 1老 岿夸老
		//1,3,5,7,8,10,12 31老
		//4,6,9,11 30老
		//2 28老
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		try {
			
			Date date = df.parse("2007-"+a+"-15");
			
			cal.setTime(date);
			
			int endDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			
			String endOfMonth = String.valueOf(endDay);
			
//			System.out.println(endOfMonth);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(cal.getWeekYear());
		for(int i = 1; i < a; i++) {
		    try {
		        Date tdate = df.parse("2007-"+i+"-11");
		        cal.setTime(tdate);
				int endDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
				c = c + endDay;
//				System.out.println(endDay);
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }

		}
		c += b;
//		System.out.println("day of days : " + c);
		c = c % 7;
		switch (c) {
		case 1:System.out.println("MON");break;
		case 2:System.out.println("TUE");break;
		case 3:System.out.println("WED");break;
		case 4:System.out.println("THU");break;
		case 5:System.out.println("FRI");break;
		case 6:System.out.println("SAT");break;
		case 0:System.out.println("SUN");break;
		}
		
	}
}
