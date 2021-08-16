package sale;

import java.util.ArrayList;
import java.util.List;
import exceptions.EccezioneSala;
import persone.Flyer;

public abstract class Sala implements Accessibile{
	
	private int max_posti;
	private List<Flyer> lista_viaggiatori;
	private static int id = 0;
	private int id_sala;
	
	public Sala(int max_posti) {
		this.max_posti = max_posti;
		this.id_sala = id;
		lista_viaggiatori = new ArrayList<Flyer>();
		id++;
	}

	public abstract void controlloSala(Flyer f) throws EccezioneSala;
	public abstract String accediSala(Flyer f);



/**Stampa nomi viaggiatori che sono presenti nella sala*/
	public void stampaInfo() {
		String s = "SALA N° " + getId_sala() +  " - LISTA VIAGGIATORI\n";
			for(Flyer f : getLista_viaggiatori()) {
				s += "[" + f.getNome() + " " + f.getCognome() + "]\n";
			}
			System.out.println(s);
	}
	
	public int getId_sala() {
		return id_sala;
	}
	
	public int getMax_posti() {
		return max_posti;
	}
	
	public List<Flyer> getLista_viaggiatori() {
		return lista_viaggiatori;
	}
}
