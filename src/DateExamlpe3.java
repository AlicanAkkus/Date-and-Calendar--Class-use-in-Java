import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExamlpe3 {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		final Date date = new Date();// date sinifinin defaault yapilailandiricisi
						//ile sistem zamani "zaman" degiskene atanior
		System.out.println(date);//olusan date nesnesinin bilgilerini ekrana yazdima

		System.out.println("Timestamp : " + date.getTime());// 1 ocak 1970 den
									// bu yana gecen
									// zamanin
									// milisaniye
		                                                        //degeri
		final DateFormat dt = new SimpleDateFormat("yyyy/MM/dd");//DateFormat ile yıl/ay/gün formatında nesne yaratmak 
																	// gosterecek
																	// format�
																	// ayarlama
		System.out.println(dt.format(date));//olusan zaman nesnesini dt formatina göre yazdirmak

	}

}
