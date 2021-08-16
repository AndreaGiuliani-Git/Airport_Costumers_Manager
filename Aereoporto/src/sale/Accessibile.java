package sale;
import exceptions.EccezioneSala;
import persone.Flyer;

public interface Accessibile {
	
	public void controlloSala(Flyer f) throws EccezioneSala;
	public String accediSala(Flyer f);

}
