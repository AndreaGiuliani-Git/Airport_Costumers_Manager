package sale;

import exceptions.EccezioneSala;
import persone.Flyer;

public class SalaAttesa extends Sala{
	
	
	public SalaAttesa(int max_posti) {
		super(max_posti);
	}

/**Controlla che la capienza della sala non sia superata. */
	public void controlloSala(Flyer f) throws EccezioneSala {
		if(getLista_viaggiatori().size() == getMax_posti()) {
			throw new EccezioneSala();
		}
	}

/**Controlla che la capienza della sala non sia superata e in tal caso incrementa la lista di un viaggiatore. In caso
 * la capienza sia già raggiunta lancia un eccezione.*/
	public String accediSala(Flyer f){
		try {controlloSala(f);
			getLista_viaggiatori().add(f);
			return "Accesso effettuato alla Sala d'attesa n° " + getId_sala() + "\n";
		} catch (EccezioneSala e) {
			return "[SALA N° " + getId_sala() + "] " + e.getMessage();
		}
	}
	

}
