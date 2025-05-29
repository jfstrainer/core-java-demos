package streamapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDTDemo {

	public static void main(String[] args) {
		ZonedDateTime currentTimeIndia = ZonedDateTime.now();
		ZonedDateTime currentTimeParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime currentTimeNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));

		System.out.println("Current time India : "+currentTimeIndia);
		System.out.println("Current time Paris : "+currentTimeParis);
		System.out.println("Current time New York : "+currentTimeNewYork);
	}

}
