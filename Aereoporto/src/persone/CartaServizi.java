package persone;

public class CartaServizi {
	
	private final String sigla = "SERVICESCARD_";
	private static int cod = 0;
	private int cod_identificativo;

	public CartaServizi() {
		this.cod_identificativo = cod;
		cod++;
	}
	
	public String getSiglaCompleta() {
		String s = sigla + Integer.toString(cod_identificativo);
		return s;
	}

}
