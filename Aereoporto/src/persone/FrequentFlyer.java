package persone;

public class FrequentFlyer extends Flyer{
	
	private int num_miglia;
	private CartaServizi carta_servizi;
	
	public FrequentFlyer(String nome, String cognome, int età , Sesso sesso, int num_volo, int num_miglia) {
		super(nome, cognome, età, sesso, num_volo);
		this.num_miglia = num_miglia;
		CartaServizi c = new CartaServizi();
		this.carta_servizi = c;
		
	}
	
	public void stampaInfo() {
		String s = "INFORMAZIONI VIAGGIATORE [FREQUENT FLYER]\n" + "Nome: " + getNome() + "\nCognome: " + getCognome() + "\nEtà: "
				+ getEtà() + "\nSesso: " + getSesso() + "\nNumero di volo: " + getNum_volo() 
				+ "\nNumero miglia: " + getNum_miglia() + "\nCarta dei servizi: " + this.carta_servizi.getSiglaCompleta() 
				+ "\n--------------------\n\n";
		System.out.println(s);
	}
	
	public int getNum_miglia() {
		return num_miglia;
	}

	public CartaServizi getCarta() {
		return carta_servizi;
	}

}
