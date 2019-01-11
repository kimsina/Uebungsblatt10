package bibliothekVonAlexandria;

/**
 * Ein Podcast ist eine Multimedia-Datei und hat eine Länge, einen Titel und einen Sprecher.
 * 
 * @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 *
 *
 */
public class Podcast extends Printmedium {
	
	public Podcast(final int length, final String title1, final String sprecher1) {
		super(length, title1);
		sprecher = sprecher1;
	}

	private String sprecher;

	/**
	 * Der Sprecher des Podcasts wird abgefragt
	 * 
	 * @return sprecherCopy
	 * @requires Podacst ist initialisiert
	 */
	String getSprecher() {
		String sprecherCopy = sprecher;
		return sprecherCopy;
	}

	
}