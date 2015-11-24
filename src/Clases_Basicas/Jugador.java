package Clases_Basicas;
import java.io.Serializable;
import java.util.LinkedList;


/**Esta clase recoge todos los datos de los jugadores del juego. Los atributos de un objeto Jugador
 * serán aquellos que tendrá que introducir el usuario en el registro del juego. Aparte de los 
 * atributos de tipo String como username, password, nombre y apellidos; los objetos Jugador constan
 * con otro atributo partidas. Este atributo será una LinkedList de tipo Partida que recogerá todas
 * las partidas que juega el jugador.
 * @author Endika Salgueiro
 *
 */
public class Jugador implements Serializable {

	private String username;
	private String password;
	private String nombre;
	private String apellidos;
	private LinkedList <Partida> partidas;// = new LinkedList <Partida>();
	
	/**Con este constructor crearemos objetos de tipo Jugador introduciendo unos parametros. Estos
	 * parámetros serán los atributos que tendrá el objeto Jugador creado.
	 * @param username
	 * @param password
	 * @param nombre
	 * @param apellidos
	 * @param partidas
	 */
	public Jugador(String username, String password, String nombre,
			String apellidos, LinkedList<Partida> partidas) {
		super();
		this.username = username;
		this.password = password;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.partidas = partidas;
	}
	
	/**Con este constructor creamos objetos de tipo Jugador en vacío.
	 * 
	 */
	public Jugador() {
		super();
	}
	
	/**Mediante este método obtenemos el atributo username de un objeto Jugador.
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**Mediante este método modificaremos el atributo username de un objeto Jugador.
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**Mediante este método obtenemos el atributo password de un objeto Jugador.
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**Mediante este método modificaremos el atributo password de un objeto Jugador.
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**Mediante este método obtenemos el atributo nombre de un objeto Jugador.
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**Mediante este método modificaremos el atributo nombre de un objeto Jugador.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**Mediante este método obtenemos el atributo apellidos de un objeto Jugador.
	 * @return apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**Mediante este método modificaremos el atributo apellidos de un objeto Jugador.
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**Mediante este método obtenemos el atributo partidas de un objeto Jugador. Este atributo
	 * será una LinkedList de tipo Partida.
	 * @return partidas
	 */
	public LinkedList<Partida> getPartidas() {
		return partidas;
	}

	/**Mediante este método modificaremos el atributo partidas de un objeto Jugador. Este atributo
	 * será una LinkedList de tipo Partida.
	 * @param partidas
	 */
	public void setPartidas(LinkedList<Partida> partidas) {
		this.partidas = partidas;
	}

	/**Este es el programa principal de la clase en el que hay una pequeña prueba que verifica el
	 * funcionamiento de los métodos y constructores.
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList <Partida> part = new LinkedList <Partida>();
		Partida p = new Partida (650, "28/06/1993", 2, 5, false, 8);
		part.add(0, p);
		Jugador j = new Jugador ("Kuixon", "78952922-V", "Endika", "Salgueiro, Barquin", part);
		System.out.println("Vamos a modificar el nº de vidas de la primera partida del jugador a 3.");
		System.out.println("En estos momentos la primera partida de la LinkedList tiene "+p.getVidas()+" vidas");
		System.out.println("Ahora con la nueva modificacion lo volvemos a introducir a la Linked List y lo visualizamos: ");
		p.setVidas(3);
		part.set(0, p);
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Datos del jugador con las modificaciones aplicadas: ");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Nombre de usuario: "+j.getUsername());
		System.out.println("Contraseña "+j.getPassword());
		System.out.println("Nombre: "+j.getNombre());
		System.out.println("Apellidos: "+j.getApellidos());
		System.out.println("Puntuacion: "+p.getPuntuacion());
		System.out.println("Fecha: "+p.getFecha());
		System.out.println("VIDAS: "+p.getVidas());
		System.out.println("Nivel: "+p.getNivel());
		if (p.isTerminada()==true)
		{
			System.out.println("Partida terminada.");
		}
		else
		{
			System.out.println("Partida no terminada.");
		}
		System.out.println("Nº de ladrillos rotos: "+p.getContLadrillos());
	}

}
