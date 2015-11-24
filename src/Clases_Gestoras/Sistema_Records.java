package Clases_Gestoras;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import Clases_Basicas.Record;

/**Esta clase la utilizaremos para gestionar objetos Records. Lo que haremos en esta clase ser� almacenar esos ficheros
 * utilizando listas y ficheros.
 * @author Endika Salgueiro
 *
 */
public class Sistema_Records {
	public static LinkedList <Record> lr;
	
	/**Constructor sin par�metros de la clase.
	 * 
	 */
	public Sistema_Records()
	{
		if (lr == null)
			lr = new LinkedList <Record>();
	}
	
	/**Este m�todo nos permitir� introducir un objeto Record en el atributo lr de la clase.
	 * @param r
	 */
	public void anyadirRecordLista (Record r)
	{
		lr.add(r);
	}
	
	/**Con este m�todo volcaremos toda la informaci�n almacenada en el atributo lr de la clase a un fichero
	 * llamado RECORDS.DAT.
	 * @throws Exception
	 */
	public void volvarFicheroRecords() throws Exception
	{
		FileOutputStream fos = new FileOutputStream("RECORDS.DAT");
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		for (int i = 0; i < lr.size(); i++)
		{
			oos.writeObject(lr.get(i));
		}
		oos.writeObject(null);
		oos.close();
	}
	
	/**Este m�todo nos permitir� leer el fichero RECORDS y almacenar todos los objetos Records al atributo lr
	 * de la clase para luego poder utilizar esta lista.
	 * @throws Exception
	 */
	public void leerFicheroRecords() throws Exception
	{
		FileInputStream fis = new FileInputStream("RECORDS.DAT");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Record r = (Record) ois.readObject();
		while (r != null)
		{
			lr.add(r);
			r = (Record) ois.readObject();
		}
		ois.close();
	}
	
	/**Este m�todo recivir� por par�metro el nombre y la puntuaci�n del Usuario que ha jugado una partida. Este m�todo recorrer�
	 * el atributo lr de la clase y nos devolcer� true en caso de que el nombre del usuario logeado y su puntuaci�n sean los
	 * mismos al nombre de usuario y puntuaci�n del usuario que ha jugado una partida. Nos devolver� false en caso contrario.
	 * @param nombre
	 * @param puntuacion
	 * @return true o false
	 */
	public boolean sonIguales(String nombre, int puntuacion)
	{
		int i = 0;
		while (i < lr.size())
		{
			Record r = (Record) lr.get(i);
			Record r2 = new Record(nombre, puntuacion);
			if ((r.getNom().equals(r2.getNom()))&&(r.getPuntos()==r2.getPuntos()))
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
