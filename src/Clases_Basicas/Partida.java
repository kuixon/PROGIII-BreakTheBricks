package Clases_Basicas;

import Clase_Utilidades.Utilidades;

/**Esta clase recoge la información de las partidas del juego. Para recoger esta informacion, esta
 * clase tiene unos cuantos atributos. Puntuacion de tipo entero nos guarda la puntuacion de la 
 * partida. Fecha de tipo String nos indica la fecha de la partida. Vidas de tipo entero nos indica
 * el nº de vidas que tiene el usuario en esa partida. Nivel de tipo entero nos indica el nivel en
 * el que esta el usuario. Terminada de tipo booleano, nos indica si una partida esta acabada o no.
 * contLadrillos de tipo entero nos indica el numero de ladrillos rotos que llevamos; este atributo
 * nos será útil más adelante para crear las estadísticas del juego.
 * @author Endika Salgueiro
 *
 */
public class Partida {

	private int puntuacion;
	private String fecha;
	private int vidas;
	private int nivel;
	private boolean terminada;
	private int contLadrillos;
	
	/**Con este constructor podemos crear objetos Partida pasandole como parametros los atributos
	 * de esta clase.
	 * @param puntuacion
	 * @param fecha
	 * @param vidas
	 * @param nivel
	 * @param terminada
	 * @param contLadrillos
	 */
	public Partida(int puntuacion, String fecha, int vidas, int nivel,
			boolean terminada, int contLadrillos) {
		super();
		this.puntuacion = puntuacion;
		this.fecha = fecha;
		this.vidas = vidas;
		this.nivel = nivel;
		this.terminada = terminada;
		this.contLadrillos = contLadrillos;
	}
	
	/**Este constructor nos da la posibilidad de crear objetos Partida en vacío.
	 * 
	 */
	public Partida() {
		super();
	}
	
	/**Con este método obtendremos el atributo puntuacion de los objetos Partida.
	 * @return puntuacion
	 */
	public int getPuntuacion() {
		return puntuacion;
	}

	/**Con este método modificaremos el atributo puntuacion de los objetos Partida.
	 * @param puntuacion
	 */
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	/**Con este método obtendremos el atributo fecha de los objetos Partida.
	 * @return fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**Con este método modificaremos el atributo fecha de los objetos Partida.
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**Con este método obtendremos el atributo vidas de los objetos Partida.
	 * @return vidas
	 */
	public int getVidas() {
		return vidas;
	}

	/**Con este método modificaremos el atributo vidas de los objetos Partida.
	 * @param vidas
	 */
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	/**Con este método obtendremos el atributo nivel de los objetos Partida.
	 * @return nivel
	 */
	public int getNivel() {
		return nivel;
	}

	/**Con este método modificaremos el atributo nivel de los objetos Partida.
	 * @param nivel
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	/**Este método nos devolverá un true o un false dependiendo de si la partida esta o no acabada.
	 * @return terminada
	 */
	public boolean isTerminada() {
		return terminada;
	}

	/**Con este método podemos modificar el valor del atributo terminada.
	 * @param terminada
	 */
	public void setTerminada(boolean terminada) {
		this.terminada = terminada;
	}

	/**Con este método obtendremos el atributo contLadrillos de los objetos Partida. Recuerdo que
	 * este atributo nos indica el nº de ladrillos rotos que llevamos en la Partida.
	 * @return contLadrillos
	 */
	public int getContLadrillos() {
		return contLadrillos;
	}

	/**Con este método modificaremos el atributo contLadrillos de los objetos Partida. Recuerdo que
	 * este atributo nos indica el nº de ladrillos rotos que llevamos en la Partida.
	 * @param contLadrillos
	 */
	public void setContLadrillos(int contLadrillos) {
		this.contLadrillos = contLadrillos;
	}

	/**Este es el programa principal de la clase en el que hay una pequeña prueba que verifica el
	 * funcionamiento de los métodos y constructores.
	 * @param args
	 */
	public static void main(String[] args) {
		Partida p = new Partida();
		System.out.println("introduce el nivel de la partida: ");
		int n = Utilidades.leerEntero();
		p.setNivel(n);
		System.out.println();
		System.out.println("La partida recien creada con ese nivel la vamos a comparar con otra partida que vamos a crear");
		System.out.println();
		Partida p2 = new Partida(800, "32/04/2012", 3, 5, true, 8);
		System.out.println("El nivel de la nueva partida es: "+p2.getNivel());
		System.out.println();
		System.out.println("Ahora saldrá ordenado de mayor a menor los niveles de las dos partidas");
		if (p.getNivel()>p2.getNivel())
		{
			System.out.println("---------------------------------");
			System.out.println("Nivel de la partida con mayor nivel: "+p.getNivel());
			System.out.println("Nivel de la partida con segundo nivel: "+p2.getNivel());
		}
		else
		{
			System.out.println("---------------------------------");
			System.out.println("Nivel de la partida con mayor nivel: "+p2.getNivel());
			System.out.println("Nivel de la partida con menor nivel: "+p.getNivel());
		}
	}
}
