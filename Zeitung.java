package bibliothekVonAlexandria;

/**
 * Eine Zeitung ist ein Printmedium und hat eine Seitenanzahl, einen Titel und einen Zeitungsverlag.
 * 
 * @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 */
public class Zeitung extends Printmedium {
	
	public Zeitung(int pages1, String title1, String zeitungsverlag1) {
		super(pages1, title1);
		zeitungsverlag = zeitungsverlag1;
	}

	private String zeitungsverlag;
	
	/**
	 * Der Zetungsverlag der Zeitung wird abgefragt.
	 * 
	 * @return  zeitungsverlagCopy
	 * @requires Zeitung ist initialisiert
	 */
	public String getZeitungsverlag() {
		String zeitungsverlagCopy = zeitungsverlag;
		return zeitungsverlagCopy;
	}
}
