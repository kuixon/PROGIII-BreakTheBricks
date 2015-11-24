package Hilos;

import Audio.Sonido;

/**Este hilo nos servir� para reproducir la canci�n de la clase Sonido.
 * @author Endika Salgueiro
 *
 */
public class StarWars extends Thread {
	public boolean parado;
	public Sonido s;
	
	/**Este es el constructor por par�metros del thread que recivira un String.
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
	/**Este m�todo nos servira para detener el thread; o lo que es lo mismo en este caso, para parar la canci�n.
	 * 
	 */
	public void parar()
	{
		s.terminar();
		parado=true;
	}
	/**Este m�todo nos servir� para reanudar el thread; o lo que es lo mismo en este caso, reanudar la canci�n.
	 * 
	 */
	public void reanudar()
	{
		s.reanudar();
		parado=false;
	}
	/**Este m�todo nos devolver� el atributo parado de la clase. Si parado es igual a true es que el thread (la canci�n) se ha
	 * detenido. Si parado es igual a false es que el thread (la canci�n) se ha detenido.
	 * @return parado
	 */
	public boolean estadoSonido()
	{
		return parado;
	}
	
}
