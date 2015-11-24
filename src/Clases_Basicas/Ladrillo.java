package Clases_Basicas;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import Clase_Utilidades.Utilidades;

/**Esta clase, forma parte de una pequeña jerarquia de herencia. La clase ladrillo será la clase
 * hija de Figura y a su vez será la clase padre de Basico, Fijo, Doble y Triple. Estas últimas
 * clases son un tipo de Ladrillo; cada una con sus propias características. Aparte de esto, esta
 * clase contiene dos atributos de tipo entero (aparte del atributo que hereda Imagen i), intentos
 * y puntuacion. Intentos indica el nº de intentos necesarios para romper el ladrillo y puntuacion
 * indica la puntuacion que obtienes al destruirlo.
 * @author Endika Salgueiro
 *
 */
public class Ladrillo extends Figura {
	
	protected int intentos;
	protected int puntuacion;
	protected int f;
	protected int c;
	protected URL rutaLadrillo;
	
	/**Este constructor nos sirve para crear un objeto Ladrillo en vacío.
	 * 
	 */
	public Ladrillo(int x, int y)
	{
		super(x, y, "", 0, 0);
		intentos = 0;
		puntuacion = 0;
		rutaLadrillo = getClass().getClassLoader().getResource("F:/Program III/Proyecto/Programa/Break the bricks/src/Fotos/barra");
		Image image1 = null;
		try {
			image1 = ImageIO.read(rutaLadrillo);
		} catch (IOException e) {
		}
		ImageIcon icon1 = new ImageIcon(image1);
		this.setIcon(icon1);
		this.setBounds(x, y, icon1.getIconWidth(), icon1.getIconHeight());
		
		ancho=icon1.getIconWidth();
		alto=icon1.getIconHeight();
		ruta="F:/Program III/Proyecto/Programa/Break the bricks/src/Fotos/barra";
	}
	
	/**Con este constructor podemos crear un objeto Ladrillo pasandole como paremetro los atributos
	 * del Objeto. En este caso, tendríamos que pasarle un Objeto Imagen (el atributo que hereda de
	 * Figura) y sus otros dos atributos de tipo entero intentos y puntuacion.
	 * @param img
	 * @param i
	 * @param p
	 */
	
	/**Este método nos devolverá el atributo intentos del objeto Ladrillo.
	 * @return intentos
	 */
	public int getIntentos() {
		return intentos;
	}

	/**Este método nos devolverá el atributo puntuacion del objeto Ladrillo.
	 * @return puntuacion
	 */
	public int getPuntuacion() {
		return puntuacion;
	}
	
	/**Con este método podemos modificar el atributo intentos del objeto Ladrillo.
	 * @param i
	 */
	public void setIntentos(int i)
	{
		intentos = i;
	}
	
	/**Con este método podemos modificar el atributo puntuacion del objeto Ladrillo.
	 * @param p
	 */
	public void setPuntuacion(int p)
	{
		puntuacion = p;
	}
	
	/**Este es el programa principal de la clase en el que hay una pequeña prueba que verifica el
	 * funcionamiento de los métodos y constructores.
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		Ladrillo l = new Ladrillo(1, 30);
		int num;
		do{
		System.out.println("Introduce el numero de intentos que serían necesarios para romper el ladrillo (1, 2, 3 o 0): ");
		num = Utilidades.leerEntero();
		l.setIntentos(num);
		}while (num!=0&num!=1&num!=2&num!=3);
		System.out.println("-------------------------------------------------");
		System.out.println("Si el numero de intentos es 0 no hay puntuacion");
		System.out.println("Si el numero de intentos es 1 la puntuacion es 5");
		System.out.println("Si el numero de intentos es 2 la puntuacion es 10");
		System.out.println("Si el numero de intentos es 3 la puntuacion es 15");
		System.out.println("-------------------------------------------------");
		switch (num)
		{
		case 0: System.out.println("Con "+l.getIntentos()+" numero de intentos el tipo de ladrillo es FIJO"); break;
		case 1: System.out.println("Con "+l.getIntentos()+" numero de intentos el tipo de ladrillo es BASICO"); break;
		case 2: System.out.println("Con "+l.getIntentos()+" numero de intentos el tipo de ladrillo es DOBLE"); break;
		case 3: System.out.println("Con "+l.getIntentos()+" numero de intentos el tipo de ladrillo es TRIPLE"); break;
		}
	}

}

