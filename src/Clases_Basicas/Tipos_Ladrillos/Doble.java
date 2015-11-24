package Clases_Basicas.Tipos_Ladrillos;

import Clases_Basicas.Ladrillo;


/**Esta clase forma parte de un jeraquia de herencia. Doble hereda de Ladrillo que a su vez hereda
 * de Figura. Esta clase tiene los mismos atributos que la clase Ladrillo; dos atributos de tipo entero
 * llamados intentos y puntuacion. Intentos indica el n� de intentos necesarios para romper el ladrillo y puntuacion
 * indica la puntuacion que obtienes al destruirlo.
 * @author Endika Salgueiro
 *
 */
public class Doble extends Ladrillo {
	
	/**Con este constructor podemos crear objetos Doble en vac�o.
	 * 
	 */
	
	/**Con este constructor podemos crear objetos Doble pasandole como parametros los atributos de
	 * esta clase.
	 * @param img
	 * @param i
	 * @param p
	 */
	public Doble(int i, int p)
	{
		super(i, p);
	}
	
	/**Este es el programa principal de la clase en el que hay una peque�a prueba que verifica el
	 * funcionamiento de los m�todos y constructores.
	 * @param args
	 */
	public static void main(String[] args) {
		Basico b = new Basico (3, 15);
		b.setIntentos(2);
		b.setPuntuacion(10);
		System.out.println("N� de intentos del ladrillo basico: "+b.getIntentos());
		System.out.println("Puntuacion que se consigue al destruir el ladrillo: "+b.getPuntuacion());
		
	}

}
