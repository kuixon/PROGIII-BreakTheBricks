package Excepciones;

/**Esta excepción nos servirá para controlar los posibles errores que pueden surgir a
 * la hora de logearse.
 * @author Endika Salgueiro
 *
 */
public class LoginException extends Exception {
	
	/**Constructor en vacío.
	 * 
	 */
	public LoginException () {
		super();
	}
	/**Constructor con mensaje.
	 * @param mens
	 */
	public LoginException (String mens)
	{
		super(mens);
	}

}
