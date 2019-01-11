package bibliothekVonAlexandria;

/**
 * Ein Buch ist ein Printmedium und hat eine Seitenanzahl, einen Titel und ein Genre.
 * 
 * @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 */
public class Buch extends Printmedium {
	
	public Buch(int pages1, String title1, String genre1) {
		super(pages1, title1);
		genre = genre1;
	}

	private String genre;

	/**
	 * Das Genre des Buches wird abgefragt.
	 * 
	 * @return  genreCopy
	 * @requires Buch ist initialisiert
	 */
	public String getGenre() {
		String genreCopy = genre;
		return genreCopy;
	}
}
