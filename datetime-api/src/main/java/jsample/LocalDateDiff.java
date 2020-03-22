package jsample;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateDiff {

	public long diffInDays(LocalDate localDate1, LocalDate localDate2) {
		return ChronoUnit.DAYS.between(localDate1, localDate2);
	}
}
