import java.util.Date;

public class DateExamlpe2 {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		final Date date = new Date();/// date  sinifini default yapilandirici
                                                                                // ile sistem zamani "zaman" degiskenine
                                                                                // ataniyor
		System.out.println(date);// ekrana yazdirma

		//Timestamp , 1 ocak 1970 tarihinden itibaren geçen zamandir . 
		System.out.println("Timestamp : " + date.getTime());// 1 ocak 1970 den
									// bu yana gecen
									// zamanin
									// milisaniye
									// degeri

	}

}
