package Audio;

/* Inicio clase Sonido */ 

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.*;

public class Sonido extends JFrame {
public Clip ol;
 /**Esta clase nos servirá para reproducir una canción.
 * @author Endika Salgueiro
 */
private static final long serialVersionUID = 1L;

	/**Este sera el constructor de la clase. En el contructor especificaremos, entre otras cosas, la canción que queramos
	 * reproducir.
	 * 
	 */
	public Sonido()
    {
        File sf = new File("F:/Program III/Proyecto/Programa/Break the bricks/src/Audio/StarWars.wav");
        AudioFileFormat aff;
        AudioInputStream ais;
   try
        {
         aff=AudioSystem.getAudioFileFormat(sf);
         ais=AudioSystem.getAudioInputStream(sf);
         AudioFormat af=aff.getFormat();
         DataLine.Info info = new DataLine.Info(
                                          Clip.class,
                                          ais.getFormat(),
                                          ((int) ais.getFrameLength() *
                                              af.getFrameSize()));
       ol = (Clip) AudioSystem.getLine(info);
       ol.open(ais);
       ol.loop(Clip.LOOP_CONTINUOUSLY);
        
       }
        catch(UnsupportedAudioFileException ee){}
        catch(IOException ea){}
        catch(LineUnavailableException LUE){};
        }

	/**Este método le utilizaremos para detener la canción.
	 * 
	 */
	public void terminar() {
		// TODO Auto-generated method stub
		ol.stop();
	}
	/**Este método le utilizaremos para reanudar la canción.
	 * 
	 */
	public void reanudar()
	{
		ol.start();
	}
}

/* fin clase Sonido */