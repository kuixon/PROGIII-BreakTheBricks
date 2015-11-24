package Clases_Gestoras;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import Clases_Basicas.Jugador;

/**Esta clase la utilizaremos para gestionar objetos Jugador. Lo que haremos en esta clase será almacenar esos ficheros
 * utilizando listas y ficheros.
 * @author Endika Salgueiro
 *
 */
public class Sistema_Jugadores {
	
	private static LinkedList <Jugador> listaJugadores;
	
	/**Constructor sin parámetros de la clase.
	 * 
	 */
	public Sistema_Jugadores()
	{
		if (listaJugadores==null)
			listaJugadores = new LinkedList <Jugador>();
	}	
	
	/**Este método nos permitirá introducir un objeto Jugador en el atributo listaJugadores de la clase.
	 * @param u
	 */
	public void anyadirJugadorLista(Jugador u)  
	{
		listaJugadores.add(u);		
	}
		
	/**Con este método volcaremos toda la información almacenada en el atributo listaJugadores de la clase a un fichero
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
	
	/**Este método nos permitirá leer el fichero USUARIOS.DAT y almacenar todos los objetos Jugador al atributo listaJugadores
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
	
	/**Este método recivirá un nombre y buscara ese nombre en el atributo listaJugadores de la clase para ver si existe. En caso
	 * de que exista, nos devolverá true; en caso contrario, false.
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
	/**Este método recivirá un nombre y una contraseña y buscara en el atributo listaJugadores de la clase haber si existe
	 * ese nombre y haber si le corresponde esta contraseña. En caso de que este todo correcto, nos devolverá true; y en caso
	 * contrario, nos devolverá false.
	 * @param usern
	 * @param pass
	 * @return true o false
	 */
	public boolean existeJugadorYContraseña (String usern, String pass)
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