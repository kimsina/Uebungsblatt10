package bibliothekVonAlexandria;

/**
 * Ein Mitarbeiter hat einen Namen, einen Titel und keine maximale Ausleihdauer, man kann den Namen und den Titel abfragen. Mitarbeiter k�nnen Medien entleihen und zur�ckgeben. 
 * 
 *  @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 *
 */
public class Mitarbeiter extends Person {
	private String titel;
	
	
	public Mitarbeiter(String name1, String titel1) {
		super(name1);
		titel=titel1;
	}
	

	/**
	  * Der Titel des Mitarbeiters wird abgefragt
	  * 
	  * @return titelCopy, titel des Mitarbeiters
	  */
	public String getTitel() {
		String titelCopy = titel;
		return titelCopy;
	}
	
	/**
	  * Der Titel des Mitarbeiters wird festgelegt
	  * 
	  * @param titel, titel des Mitarbeiters
	  */
	public void setTitel(final String titel2) {
		titel = titel2;
	}
	

	/**
	 * Ein Medium wird entliehen, falls es verf�gbar ist
	 * 
	 * Der Status des Mediums wird zu entliehen ge�ndert und der Benutzer als Entleiher gespeichert, wenn es nicht verf�gbar ist, wird "Leider ist das Medium schon verliehen" ausgegeben, das R�ckgabedatum wird auf "unbekannt" gesetzt
	 * 
	 * @param sameMedium, Medium, das entliehen wird
	 */
	@Override
	public void borrow(Medien medium) {
			this.commonBorrow(medium);
			medium.setBorrowedUntil("unbekannt");
	}

}