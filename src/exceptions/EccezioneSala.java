package exceptions;

import sale.Sala;

public class EccezioneSala extends Exception{

	private static final long serialVersionUID = 1L;

/**Eccezione lanciata in caso la sala considerata sia piena*/
	public EccezioneSala() {
		super("Sala d'attesa piena. Impossibile accedere.\n");
	}
	
/**Eccezione lanciata nel caso in cui la SalaVip fosse piena e non piú accessibile*/
	public EccezioneSala(String messaggio) {
		super(messaggio);
	}
	
/**Eccezione non necessaria da consegna. In caso un FrequentFlyer non sia in possesso di una carta dei servizi
 * non potrebbe accedere allla SalaVip*/
	public EccezioneSala(Sala s) {
		super("Viaggiatore senza carta dei servizi. Impossibile accedere a sala vip.\n");
	}

}
