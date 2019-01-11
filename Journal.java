package bibliothekVonAlexandria;

/**
 * Ein Journal ist ein Printmedium und hat eine Seitenanzahl, einen Titel und eine Gattung.
 * 
 * @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 */
public class Journal extends Printmedium {
	
	public Journal(int pages1, String title1, String gattung1) {
		super(pages1, title1);
		gattung = gattung1;
	}

	private String gattung;
	
	/**
	 * Die Gattung des Journals wird abgefragt.
	 * 
	 * @return  gattungCopy
	 * @requires Journal ist initialisiert
	 */
	public String getGattung() {
		String gattungCopy = gattung;
		return gattungCopy;
	}
}
