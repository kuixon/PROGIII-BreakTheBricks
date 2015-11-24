package Clases_Gestoras;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import Clases_Basicas.Jugador;

/**Esta clase la utilizaremos para gestionar objetos Jugador. Lo que haremos en esta clase ser� almacenar esos ficheros
 * utilizando listas y ficheros.
 * @author Endika Salgueiro
 *
 */
public class Sistema_Jugadores {
	
	private static LinkedList <Jugador> listaJugadores;
	
	/**Constructor sin par�metros de la clase.
	 * 
	 */
	public Sistema_Jugadores()
	{
		if (listaJugadores==null)
			listaJugadores = new LinkedList <Jugador>();
	}	
	
	/**Este m�todo nos permitir� introducir un objeto Jugador en el atributo listaJugadores de la clase.
	 * @param u
	 */
	public void anyadirJugadorLista(Jugador u)  
	{
		listaJugadores.add(u);		
	}
		
	/**Con este m�todo volcaremos toda la informaci�n almacenada en el atributo listaJugadores de la clase a un fichero
	 * llamado USUARIOS.DAT.
	 * @throws IOException
	 */
	public void volcarFichero() throws IOException{
			FileOutputStream fos = new FileOutputStream("USUARIOS.DAT");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			for(int i = 0; i < listaJugadores.size(); i++){
				oos.writeObject(listaJugadores.get(i));
			}
			oos.writeObject(null);
			oos.close();
	}
	
	/**Este m�todo nos permitir� leer el fichero USUARIOS.DAT y almacenar todos los objetos Jugador al atributo listaJugadores
	 * de la clase para luego poder utilizar esta lista.
	 * @throws Exception
	 */
	public void leerFichero() throws Exception
	{
		FileInputStream fis = new FileInputStream("USUARIOS.DAT");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Jugador j = (Jugador)ois.readObject();
		while(j != null)
		{
			listaJugadores.add(j);
			j = (Jugador)ois.readObject();
		}
		ois.close();
	}
	
	/**Este m�todo recivir� un nombre y buscara ese nombre en el atributo listaJugadores de la clase para ver si existe. En caso
	 * de que exista, nos devolver� true; en caso contrario, false.
	 * @param user
	 * @return true o false
	 */
	public boolean existeJugador(String user)
	{
		int i = 0;
		while (i<listaJugadores.size())
		{
			Jugador j = new Jugador();
			j = listaJugadores.get(i);
			if (j.getUsername().equals(user))
			{
				return true;
			}
			else
			{
				i++;
			}
		}
		return false;
	}
	/**Este m�todo recivir� un nombre y una contrase�a y buscara en el atributo listaJugadores de la clase haber si existe
	 * ese nombre y haber si le corresponde esta contrase�a. En caso de que este todo correcto, nos devolver� true; y en caso
	 * contrario, nos devolver� false.
	 * @param usern
	 * @param pass
	 * @return true o false
	 */
	public boolean existeJugadorYContrase�a (String usern, String pass)
	{
		int i = 0;
		while (i<listaJugadores.size())
		{
			Jugador j = new Jugador();
			j = listaJugadores.get(i);
			if (j.getUsername().equals(usern)&&j.getPassword().equals(pass))
			{
				return true;
			}
			else
			{
				i++;
			}
		}
		return false;
	}
}