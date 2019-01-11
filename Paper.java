package bibliothekVonAlexandria;

/**
 * Ein Paper ist ein Printmedium und hat eine Seitenanzahl, einen Titel und ein Fachgebiet.
 * 
 * @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 */
public class Paper extends Printmedium {
	
	public Paper(int pages1, String title1, String fachgebiet1) {
		super(pages1, title1);
		fachgebiet = fachgebiet1;
	}

	private String fachgebiet;
	
	/**
	 * Das Fachgebiet des Papers wird abgefragt.
	 * 
	 * @return  fachgebietCopy
	 * @requires Paper ist initialisiert
	 */
	public String getFachgebiet() {
		String fachgebietCopy = fachgebiet;
		return fachgebietCopy;
	}
}
