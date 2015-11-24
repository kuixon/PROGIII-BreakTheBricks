package Hilos;

import Audio.Sonido;

/**Este hilo nos servirá para reproducir la canción de la clase Sonido.
 * @author Endika Salgueiro
 *
 */
public class StarWars extends Thread {
	public boolean parado;
	public Sonido s;
	
	/**Este es el constructor por parámetros del thread que recivira un String.
	 * @param msg
	 */
	public StarWars (String msg)
	{
		super(msg);
		parado=false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	public void run()
	{
		s = new Sonido();
	}
	/**Este método nos servira para detener el thread; o lo que es lo mismo en este caso, para parar la canción.
	 * 
	 */
	public void parar()
	{
		s.terminar();
		parado=true;
	}
	/**Este método nos servirá para reanudar el thread; o lo que es lo mismo en este caso, reanudar la canción.
	 * 
	 */
	public void reanudar()
	{
		s.reanudar();
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
