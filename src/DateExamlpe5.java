import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExamlpe5 {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		final Calendar takvim = new GregorianCalendar(2014, 01, 01);// 1 ocak
																	// 2014
																	// tarihi
		final Date tarih = takvim.getTime();
		System.out.println(tarih.toString());
	}

}
