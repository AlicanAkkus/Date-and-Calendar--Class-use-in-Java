import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExamlpe3 {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		final Date date = new Date();// date sýnýfýnýn default yapýlandýrýcý
		// ile sistem zamaný "zaman" deðiþkenine
		// atanýyor
		System.out.println(date);// ekrana yazdýrma

		System.out.println("Timestamp : " + date.getTime());// 1 ocak 1970 den
															// bu yana gecen
															// zamanýn
															// milisaniye
															// deðeri

		final DateFormat dt = new SimpleDateFormat("yyyy/MM/dd");// zmaný
																	// gosterecek
																	// formatý
																	// ayarlama
		System.out.println(dt.format(date));// zamaný gosterme

	}

}
