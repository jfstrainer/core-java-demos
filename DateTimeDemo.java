package streamapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTimeDemo {
	public static void main(String [] args) {
		Date d = new Date();
		System.out.println(d);
		
		LocalDate dt = LocalDate.now();
		System.out.println("Local date : "+dt);
		
		LocalTime tm = LocalTime.now();
		System.out.println("Local time : "+tm);
		
		LocalDateTime dtm = LocalDateTime.now();
		System.out.println("Local date and time : "+dtm);
		
	}
}
