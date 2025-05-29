package streamapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {

		LocalDate startDate = LocalDate.of(1947, Month.AUGUST, 15);
		LocalDate endDate = LocalDate.now();
		
		Period period = startDate.until(endDate);
		
		System.out.println("Period between 15th August 1947 to till date is");
		System.out.print(period.getYears()+" Years ");
		System.out.print(period.getMonths()+" months ");
		System.out.print(period.getDays()+" days");

	}

}
