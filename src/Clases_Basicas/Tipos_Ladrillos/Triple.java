package Clases_Basicas.Tipos_Ladrillos;

import Clases_Basicas.Ladrillo;


/**Esta clase forma parte de un jeraquia de herencia. Triple hereda de Ladrillo que a su vez hereda
 * de Figura. Esta clase tiene los mismos atributos que la clase Ladrillo; dos atributos de tipo entero
 * llamados intentos y puntuacion. Intentos indica el nº de intentos necesarios para romper el ladrillo y puntuacion
 * indica la puntuacion que obtienes al destruirlo.
 * @author Endika Salgueiro
 *
 */
public class Triple extends Ladrillo {
	
	/**Con este constructor podemos crear objetos Triple en vacío.
	 * 
	 */
	
	/**Con este constructor podemos crear objetos Triple pasandole como parametros los atributos de
	 * esta clase.
	 * @param img
	 * @param i
	 * @param p
	 */
	public Triple(int i, int p)
	{
		super(i, p);
	}
	
	/**Este es el programa principal de la clase en el que hay una pequeña prueba que verifica el
	 * funcionamiento de los métodos y constructores.
	 * @param args
	 */
	public static void main(String[] args) {
		Basico b = new Basico (1, 5);
		b.setIntentos(3);
		b.setPuntuacion(15);
		System.out.println("Nº de intentos del ladrillo basico: "+b.getIntentos());
		System.out.println("Puntuacion que se consigue al destruir el ladrillo: "+b.getPuntuacion());
	}

}
