package excecoes;

/**
 * Classe para excecoes em geral que possam ocorrer na loja.
 * @author Tiago Pereira
 *
 */
public class LojaException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LojaException(){
		super("Ocorreu um erro no sistema.");
	}
	
	public LojaException(String msg){
		super(msg);
	}

}

