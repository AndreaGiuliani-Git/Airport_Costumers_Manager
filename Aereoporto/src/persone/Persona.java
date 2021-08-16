package persone;

public abstract class Persona {
	
	private String nome, cognome;
	private int età;
	private Sesso sesso;
	
	public Persona(String nome, String cognome, int età, Sesso sesso) {
		this.nome = nome;
		this.cognome = cognome;
		this.età = età;
		this.sesso = sesso;
	}
	

/**Stampa informazioni sul viaggiatore*/
	public abstract void stampaInfo();
	

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getEtà() {
		return età;
	}

	public Sesso getSesso() {
		return sesso;
	}

}
