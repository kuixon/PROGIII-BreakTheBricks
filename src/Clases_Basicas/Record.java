package Clases_Basicas;

import java.io.Serializable;

/**Esta clase nos servir� para almacenar en un objeto tipo Record el nombre y la puntuaci�n del usuario. De esta forma, podremos
 * visualizar sus datos de partida m�s adelante.
 * @author Endika Salgueiro
 *
 */
public class Record implements Serializable {
	private String  nom;
	private int puntos;
	/**Este es el constructor por par�metros de la clase.
	 * @param nom Esta variable almacenar� el nombre del usuario.
	 * @param puntos Esta variable almacenar� la puntuaci�n del usuario.
	 */
	public Record (String nom, int puntos)
	{
		this.nom = nom;
		this.puntos = puntos;
	}
	/**Este m�todo nos el nombre del usuario almacenado en el objeto Record.
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**Con este m�todo podremos modificar el nombre del usuario almacenado en el objeto Record.
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**Este m�todo nos permitir� obtener los puntos conseguidos por el usuario almacenado en el objeto Record.
	 * @return puntos
	 */
	public int getPuntos() {
		return puntos;
	}
	/**Con este m�todo podremos modificar los puntos obtenidos por el usuario almacenado en el objeto Record.
	 * @param puntos
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
}
