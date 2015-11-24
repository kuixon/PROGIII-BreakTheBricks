package Clases_Basicas;

import java.io.Serializable;

/**Esta clase nos servirá para almacenar en un objeto tipo Record el nombre y la puntuación del usuario. De esta forma, podremos
 * visualizar sus datos de partida más adelante.
 * @author Endika Salgueiro
 *
 */
public class Record implements Serializable {
	private String  nom;
	private int puntos;
	/**Este es el constructor por parámetros de la clase.
	 * @param nom Esta variable almacenará el nombre del usuario.
	 * @param puntos Esta variable almacenará la puntuación del usuario.
	 */
	public Record (String nom, int puntos)
	{
		this.nom = nom;
		this.puntos = puntos;
	}
	/**Este método nos el nombre del usuario almacenado en el objeto Record.
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**Con este método podremos modificar el nombre del usuario almacenado en el objeto Record.
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**Este método nos permitirá obtener los puntos conseguidos por el usuario almacenado en el objeto Record.
	 * @return puntos
	 */
	public int getPuntos() {
		return puntos;
	}
	/**Con este método podremos modificar los puntos obtenidos por el usuario almacenado en el objeto Record.
	 * @param puntos
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
}
