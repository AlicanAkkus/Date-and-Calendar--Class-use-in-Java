import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExamlpe4 {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(final String[] args) throws ParseException {
		// TODO Auto-generated method stub
		final Date simdikiZaman = new Date();// this now time
		System.out.println(simdikiZaman.toString());

		final DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		final Date tarih = df.parse("1984/01/01");// tarih de�i�kenine bir
													// tarihi parse ettik,e�er
													// ba�lar��z olursa i�lem
													// ParseExeption f�rlat�rl�r
		System.out.println(tarih);
	}

}
