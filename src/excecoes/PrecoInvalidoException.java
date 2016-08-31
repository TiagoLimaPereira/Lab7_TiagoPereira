package excecoes;

public class PrecoInvalidoException extends LojaException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PrecoInvalidoException(){
		super("Preco invalido.");
	}

	public PrecoInvalidoException(String msg) {
		super(msg);
	}

}
