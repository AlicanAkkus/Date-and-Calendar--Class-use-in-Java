import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExamlpe3 {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		final Date date = new Date();// date s�n�f�n�n default yap�land�r�c�
		// ile sistem zaman� "zaman" de�i�kenine
		// atan�yor
		System.out.println(date);// ekrana yazd�rma

		System.out.println("Timestamp : " + date.getTime());// 1 ocak 1970 den
															// bu yana gecen
															// zaman�n
															// milisaniye
															// de�eri

		final DateFormat dt = new SimpleDateFormat("yyyy/MM/dd");// zman�
																	// gosterecek
																	// format�
																	// ayarlama
		System.out.println(dt.format(date));// zaman� gosterme

	}

}
