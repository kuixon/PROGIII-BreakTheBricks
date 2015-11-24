package Clases_Basicas.Tipos_Ladrillos;

import Clases_Basicas.Ladrillo;


/**Esta clase forma parte de un jeraquia de herencia. Basico hereda de Ladrillo que a su vez hereda
 * de Figura. Esta clase tiene los mismos atributos que la clase Ladrillo; dos atributos de tipo entero
 * llamados intentos y puntuacion. Intentos indica el nº de intentos necesarios para romper el ladrillo y puntuacion
 * indica la puntuacion que obtienes al destruirlo.
 * @author Endika Salgueiro
 *
 */
public class Basico extends Ladrillo {
	
	/**Con este constructor podemos crear objetos Basico en vacío.
	 * 
	 */
	
	/**Con este constructor podemos crear objetos Basico pasandole como parametros los atributos de
	 * esta clase.
	 * @param img
	 * @param i
	 * @param p
	 */
	public Basico(int i, int p)
	{
		super(i, p);
	}
	
	/**Este es el programa principal de la clase en el que hay una pequeña prueba que verifica el
	 * funcionamiento de los métodos y constructores.
	 * @param args
	 */
	public static void main(String[] args) {
		Basico b = new Basico (3, 10);
		b.setIntentos(1);
		b.setPuntuacion(5);
		System.out.println("Nº de intentos del ladrillo basico: "+b.getIntentos());
		System.out.println("Puntuacion que se consigue al destruir el ladrillo: "+b.getPuntuacion());
	}

}
