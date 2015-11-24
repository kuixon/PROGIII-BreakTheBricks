package Clases_Basicas;

import Clase_Utilidades.Utilidades;

/**Esta clase forma parte de una herencia, siendo esta, hija de la clase Figura. Esta clase tiene
 * dos atributos (aparte del atributo que hereda Imagen i) de tipo entero llamados coordX y coordY.
 * Estos dos nos indican las coordenadas x e y por donde se desplazara el objeto Pelota. Por otra
 * parte, el atributo heredado nos indicará la posición en la que se encuentra el objeto Pelota.
 * @author Endika Salgueiro
 *
 */
public class Pelota extends Figura {

	private int coordX;
	private int coordY;
	
	/**Con este constructor podemos crear objetos pelota en vacío.
	 * 
	 */
	public Pelota()
	{
		super();
		coordX = 0;
		coordY = 0;
	}
	
	/**Con este constructor podemos crear objetos Pelota pasandole como parámetro los atributos de
	 * esta clase.
	 * @param img
	 * @param cx
	 * @param cy
	 */
	public Pelota (int cx, int cy)
	{
		super ();
		coordX = cx;
		coordY = cy;
	}
	
	/**Este método nos devolverá el atributo coordX de los objetos Pelota.
	 * @return coordX
	 */
	public int getCoordX() {
		return coordX;
	}

	/**Este método nos devolverá el atributo coordY de los objetos Pelota.
	 * @return coordY
	 */
	public int getCoordY() {
		return coordY;
	}
	
	/**Este método modificará el atributo coordX de los objetos Pelota.
	 * @param cx
	 */
	public void setCoordX(int cx)
	{
		coordX = cx;
	}
	
	/**Este método modificará el atributo coordY de los objetos Pelota.
	 * @param cy
	 */
	public void setCoordY(int cy)
	{
		coordY = cy;
	}

	/**Este es el programa principal de la clase en el que hay una pequeña prueba que verifica el
	 * funcionamiento de los métodos y constructores.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Introduce la coordenada x de la pelota: ");
		int x = Utilidades.leerEntero();
		System.out.println("Introduce la coordenada y de la pelota: ");
		int y = Utilidades.leerEntero();
		System.out.println("Introduce el valor de x que desees que tenga la imagen de la pelota: ");
		int x2 = Utilidades.leerEntero();
		System.out.println("Introduce el valor de y que desees que tenga la imagen de la pelota: ");
		int y2 = Utilidades.leerEntero();
		Pelota p2 = new Pelota (x, y);
		System.out.println("Visualizacion de los datos de la pelota: ");
		System.out.println("-----------------------------------------");
		System.out.println("Valor x de la imagen que tiene la pelota: ");
		System.out.println("Valor y de la imagen que tiene la pelota: ");
		System.out.println("Coordenada x de la pelota: "+p2.getCoordX());
		System.out.println("Coordenada y de la pelota: "+p2.getCoordY());
	}

}
