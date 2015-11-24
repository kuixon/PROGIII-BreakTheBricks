package Hilos;

import Audio.Sonido;
import Audio.Sonido2;

/**Este hilo nos servirá para reproducir la canción de la clase Sonido2.
 * @author Endika Salgueiro
 *
 */
public class Combate extends Thread {
	public boolean parado;
	public Sonido2 s2;
	/**Este es el constructor por parámetros del thread que recivira un String.
	 * @param msg
	 */
	public Combate (String msg)
	{
		super(msg);
		parado = false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	public void run()
	{
		s2 = new Sonido2();
	}
	/**Este método nos servira para detener el thread; o lo que es lo mismo en este caso, para parar la canción.
	 * 
	 */
	public void parar()
	{
		s2.terminar();
		parado=true;
	}
	/**Este método nos servirá para reanudar el thread; o lo que es lo mismo en este caso, reanudar la canción.
	 * 
	 */
	public void reanudar()
	{
		s2.reanudar();
		parado=false;
	}
	/**Este método nos devolverá el atributo parado de la clase. Si parado es igual a true es que el thread (la canción) se ha
	 * detenido. Si parado es igual a false es que el thread (la canción) se ha detenido.
	 * @return parado
	 */
	public boolean estadoSonido()
	{
		return parado;
	}
	
}
