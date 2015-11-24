package Clases_Basicas;

import javax.swing.Icon;
import javax.swing.JLabel;

import Clase_Utilidades.Utilidades;


/**La clase Figura recogera los objetos (Ladrillo y Pelota) que estar�n en el escenario, dentro de cada
 * posici�n de la tabla (el array bidimensional). Esto le convierte a esta clase en la clase padre de 
 * Ladrillo y Pelota. Esta clase contiene un atributo de tipo Imagen. Este objeto esta compuesto de dos 
 * atributo (x e y) que indicar�n la posici�n del objeto en la tabla.
 * @author Endika Salgueiro
 *
 */
public class Figura extends JLabel {
	
	protected int x;
	protected int y;
	protected String ruta;
	protected int ancho;
	protected int alto;
	
	/**Constructor por par�metros de la clase.
	 * @param x esta variable nos indicar� la posici�n de la fila donde este colocado el objeto en el escenario de juego.
	 * @param y esta variable nos indicar� la posici�n de la columna donde este colocado el objeto en el escenario de juego.
	 * @param ruta esta variable nos indicar� la ruta del objeto que deseemos visualizar.
	 * @param ancho esta variable nos indicar� la anchura del objeto.
	 * @param alto esta variable nos indicar� la altura del objeto.
	 */
	public Figura(int x, int y, String ruta, int ancho, int alto) {
		super();
		this.x = x;
		this.y = y;
		this.ruta = ruta;
		this.ancho = ancho;
		this.alto = alto;
	}

	/**Este es el constructor por defecto de la clase.
	 * 
	 */
	public Figura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Figura(Icon image, int horizontalAlignment) {
		super(image, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public Figura(Icon image) {
		super(image);
		// TODO Auto-generated constructor stub
	}

	public Figura(String text, Icon icon, int horizontalAlignment) {
		super(text, icon, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public Figura(String text, int horizontalAlignment) {
		super(text, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public Figura(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	/**Utilizando este m�todo podremos modificar las variables x e y.
	 * @param x
	 * @param y
	 */
	public void setPosicion (int x, int y)
	{
		this.x = x;
		this.y = y;
		this.setBounds(x, y, ancho, alto);
	}

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#getX()
	 */
	public int getX() {
		return x;
	}

	/**Este m�todo nos servir� para modificar la variable x de la clase.
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#getY()
	 */
	public int getY() {
		return y;
	}

	/**Con este m�todo podremos modificar la variable y de la clase.
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**Este m�todo nos devuelve la variable ruta.
	 * @return ruta
	 */
	public String getRuta() {
		return ruta;
	}

	/**Con este m�todo podremos modificar la variable ruta.
	 * @param ruta
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	/**Con este m�todo podremos obtener la anchura de la figura.
	 * @return ancho
	 */
	public int getAncho() {
		return ancho;
	}

	/**Con este m�todo podremos modificar la anchura de la figura.
	 * @param ancho
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**Este m�todo nos devolver� la altura de la figura.
	 * @return alto
	 */
	public int getAlto() {
		return alto;
	}

	/**A trav�s de este m�todo podremos modificar la altura de la figura.
	 * @param alto
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	
	
	/**Este es el programa principal de la clase en el que hay una peque�a prueba que verifica el
	 * funcionamiento de los m�todos y constructores.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("La coordenada x de la imagen que tiene la figura f es: ");
		System.out.println("La coordenada y de la imagen que tiene la figura f es: ");
		System.out.println("Introduce el numero de la cordenada x que va a tener la figura f: ");
		int x = Utilidades.leerEntero();
		System.out.println("Introduce el numero de la cordenada y que va a tener la figura f: ");
		int y = Utilidades.leerEntero();
		System.out.println("La nueva coordenada x de la figura es: ");
		System.out.println("La nueva coordenada y de la figura es: ");
		
	}

}
