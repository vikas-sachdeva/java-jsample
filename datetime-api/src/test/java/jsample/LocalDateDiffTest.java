package jsample;

import java.time.LocalDate;
import java.time.Month;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LocalDateDiffTest {

	private LocalDateDiff localDateDiff = new LocalDateDiff();

	@Test
	public void diffInDaysTest1() {
		LocalDate localDate1 = LocalDate.of(2020, Month.FEBRUARY, 2);
		LocalDate localDate2 = LocalDate.of(2020, Month.FEBRUARY, 22);
		long diff = localDateDiff.diffInDays(localDate1, localDate2);
		Assertions.assertThat(diff).isEqualTo(20);
	}

	@Test
	public void diffInDaysTest2() {
		LocalDate localDate1 = LocalDate.of(2020, Month.JANUARY, 2);
		LocalDate localDate2 = LocalDate.of(2020, Month.FEBRUARY, 22);
		long diff = localDateDiff.diffInDays(localDate1, localDate2);
		Assertions.assertThat(diff).isEqualTo(51);
	}

	@Test
	public void diffInDaysTest3() {
		LocalDate localDate1 = LocalDate.of(2019, Month.JANUARY, 2);
		LocalDate localDate2 = LocalDate.of(2020, Month.FEBRUARY, 22);
		long diff = localDateDiff.diffInDays(localDate1, localDate2);
		Assertions.assertThat(diff).isEqualTo(416);
	}

	@Test
	public void diffInDaysTest4() {
		LocalDate localDate1 = LocalDate.of(2020, Month.FEBRUARY, 22);
		LocalDate localDate2 = LocalDate.of(2020, Month.MARCH, 1);
		long diff = localDateDiff.diffInDays(localDate1, localDate2);
		Assertions.assertThat(diff).isEqualTo(8);
	}
}