import java.util.Date;

public class DateExamlpe2 {

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
									// zamanin
									// milisaniye
									// degeri

	}

}
