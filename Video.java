package bibliothekVonAlexandria;

/**
 * Ein Video ist eine Multimedia-Datei und hat eine Länge, einen Titel und ein Genre.
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
class Video extends Multimedia {
	public Video(int length1, String title1, String genre1) {
		super(title1, length1);
		genre = genre1;
	}

	private final String genre;
	
	/**
	 * Das Genre des Videos wird abgefragt
	 * 
	 * @return genreCopy
	 * @requires Video ist initialisiert
	 */
	String getGenre() {
		String genreCopy = genre;
		return genreCopy;
	}
}