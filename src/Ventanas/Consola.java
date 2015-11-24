package Ventanas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Audio.Sonido;
import Audio.Sonido2;
import Clases_Basicas.Ladrillo;
import Hilos.Combate;
import Hilos.StarWars;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**Este thread nos servira para controla la barra del juego.
 * @author Endika Salgueiro
 *
 */
class Mov_Barra extends Thread
{
	/**Constructor sin parámetros del Thread.
	 * 
	 */
	public Mov_Barra()
	{
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	public void run()
	{
		while (true)
		{
			if (Consola.izquierda)
			{
				if (Consola.pos_inicial != 0)
				{
					Consola.casillas[19][Consola.pos_inicial-1].setBackground(Color.GRAY);
					Consola.casillas[19][Consola.pos_inicial+4].setBackground(Color.BLACK);
					Consola.pos_inicial = Consola.pos_inicial-1;
					try {
						this.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			if (Consola.derecha)
			{
				if (Consola.pos_inicial != 15)
				{
					Consola.casillas[19][Consola.pos_inicial+5].setBackground(Color.GRAY);
					Consola.casillas[19][Consola.pos_inicial].setBackground(Color.BLACK);
					Consola.pos_inicial = Consola.pos_inicial+1;
					try {
						this.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
	}
	
}

/**Este tread nos servira para controla los revotes de la pelota del juego.
 * @author Endika Salgueiro
 *
 */
class Mov_Pelota extends Thread
{
	public boolean dir_reloj = true;
	/**Constructor sin parámetros del thread.
	 * 
	 */
	public Mov_Pelota()
	{
		super();
	}
	public void run()
	{
		int opc = 0;
		boolean permiso = false;
		boolean permiso2 = false;
		while (Consola.muere == false)
		{
			if(Consola.x_pelota != 19)
			{
				//Control borde izquierdo
				if ((Consola.y_pelota == 0)||(opc == 1))
				{
					opc = 1;
					if (dir_reloj == true)
					{
						System.out.println("Paso 2");
						Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.BLACK);
						Consola.x_pelota = Consola.x_pelota-1;
						Consola.y_pelota = Consola.y_pelota+1;
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.GREEN)
						{
							Consola.punt += 5;
							Consola.puntuacion.setText(""+Consola.punt);
						}
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.YELLOW)
						{
							Consola.punt += 10;
							Consola.puntuacion.setText(""+Consola.punt);						
						}
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.RED)
						{
							Consola.punt += 15;
							Consola.puntuacion.setText(""+Consola.punt);
						}
						Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.WHITE);
						try {
							this.sleep(50);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else
					{
						System.out.println("Paso 13");
						Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.BLACK);
						Consola.x_pelota = Consola.x_pelota+1;
						Consola.y_pelota = Consola.y_pelota+1;
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.GREEN)
						{
							Consola.punt += 5;
							Consola.puntuacion.setText(""+Consola.punt);
						}
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.YELLOW)
						{
							Consola.punt += 10;
							Consola.puntuacion.setText(""+Consola.punt);						
						}
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.RED)
						{
							Consola.punt += 15;
							Consola.puntuacion.setText(""+Consola.punt);
						}
						Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.WHITE);
						try {
							this.sleep(50);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
				
				//Control fila bloques verdes
				if ((Consola.x_pelota == 2)||(opc == 2))
				{
					opc = 2;
					if ((dir_reloj == false)&&(permiso == true))
					{
						if (Consola.x_pelota == 2)
						{
							if ((Consola.y_pelota == 17)||(Consola.y_pelota == 18)||(Consola.y_pelota == 19))
							{
								System.out.println("Paso 16");
								Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.BLACK);
								Consola.x_pelota = Consola.x_pelota+1;
								Consola.y_pelota = Consola.y_pelota-1;
								if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.GREEN)
								{
									Consola.punt += 5;
									Consola.puntuacion.setText(""+Consola.punt);
								}
								if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.YELLOW)
								{
									Consola.punt += 10;
									Consola.puntuacion.setText(""+Consola.punt);						
								}
								if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.RED)
								{
									Consola.punt += 15;
									Consola.puntuacion.setText(""+Consola.punt);
								}
								Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.WHITE);
								try {
									this.sleep(50);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								permiso2 = true;
							}
							
						}
						System.out.println("Paso 12");
						Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.BLACK);
						Consola.x_pelota = Consola.x_pelota+1;
						Consola.y_pelota = Consola.y_pelota-1;
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.GREEN)
						{
							Consola.punt += 5;
							Consola.puntuacion.setText(""+Consola.punt);
						}
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.YELLOW)
						{
							Consola.punt += 10;
							Consola.puntuacion.setText(""+Consola.punt);						
						}
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.RED)
						{
							Consola.punt += 15;
							Consola.puntuacion.setText(""+Consola.punt);
						}
						Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.WHITE);
						try {
							this.sleep(50);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
 					}
					else
					{
						if (((Consola.y_pelota == 0)||(Consola.y_pelota == 1)||(Consola.y_pelota == 2)||(Consola.y_pelota == 3))&&
								(Consola.x_pelota == 2))
								{
									System.out.println("Paso 8");
									dir_reloj = false;
									Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.BLACK);
									Consola.x_pelota = Consola.x_pelota+1;
									Consola.y_pelota = Consola.y_pelota+1;
									if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.GREEN)
									{
										Consola.punt += 5;
										Consola.puntuacion.setText(""+Consola.punt);
									}
									if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.YELLOW)
									{
										Consola.punt += 10;
										Consola.puntuacion.setText(""+Consola.punt);						
									}
									if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.RED)
									{
										Consola.punt += 15;
										Consola.puntuacion.setText(""+Consola.punt);
									}
									Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.WHITE);
									try {
										this.sleep(50);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								else
								{
									System.out.println("Paso 3");
									Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.BLACK);
									Consola.x_pelota = Consola.x_pelota+1;
									Consola.y_pelota = Consola.y_pelota+1;
									if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.GREEN)
									{
										Consola.punt += 5;
										Consola.puntuacion.setText(""+Consola.punt);
									}
									if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.YELLOW)
									{
										Consola.punt += 10;
										Consola.puntuacion.setText(""+Consola.punt);						
									}
									if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.RED)
									{
										Consola.punt += 15;
										Consola.puntuacion.setText(""+Consola.punt);
									}
									Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.WHITE);
									try {
										this.sleep(50);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
						
					}
								
				}
				
				
				//Control borde derecho
				if ((Consola.y_pelota == 19)||(opc == 3))
				{
					opc = 3;
					if (dir_reloj == true)
					{
						System.out.println("Paso 4");
						Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.BLACK);
						Consola.x_pelota = Consola.x_pelota+1;
						Consola.y_pelota = Consola.y_pelota-1;
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.GREEN)
						{
							Consola.punt += 5;
							Consola.puntuacion.setText(""+Consola.punt);
						}
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.YELLOW)
						{
							Consola.punt += 10;
							Consola.puntuacion.setText(""+Consola.punt);						
						}
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.RED)
						{
							Consola.punt += 15;
							Consola.puntuacion.setText(""+Consola.punt);
						}
						Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.WHITE);
						try {
							this.sleep(50);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else if (dir_reloj == false)
					{
						System.out.println("Paso 11");
						Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.BLACK);
						Consola.x_pelota = Consola.x_pelota-1;
						Consola.y_pelota = Consola.y_pelota-1;
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.GREEN)
						{
							Consola.punt += 5;
							Consola.puntuacion.setText(""+Consola.punt);
						}
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.YELLOW)
						{
							Consola.punt += 10;
							Consola.puntuacion.setText(""+Consola.punt);						
						}
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.RED)
						{
							Consola.punt += 15;
							Consola.puntuacion.setText(""+Consola.punt);
						}
						Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.WHITE);
						try {
							this.sleep(50);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						permiso = true;
					}
				}
				
				
				//Control inicio
				if ((opc == 0)&&(Consola.x_pelota != 0)&&(Consola.x_pelota != 19)&&(Consola.y_pelota != 0)&&
						(Consola.y_pelota != 19))
				{
					System.out.println("Paso 1");
					Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.BLACK);
					Consola.x_pelota = Consola.x_pelota-1 ;
					Consola.y_pelota = Consola.y_pelota-1 ;
					if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.GREEN)
					{
						Consola.punt += 5;
						Consola.puntuacion.setText(""+Consola.punt);
					}
					if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.YELLOW)
					{
						Consola.punt += 10;
						Consola.puntuacion.setText(""+Consola.punt);						
					}
					if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.RED)
					{
						Consola.punt += 15;
						Consola.puntuacion.setText(""+Consola.punt);
					}
					Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.WHITE);
					try {
						this.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
				//Control fila encima de barra
				if ((Consola.x_pelota == 18)||(opc == 4))
				{
					opc = 4;	
					
					if ((Consola.casillas[Consola.x_pelota+1][Consola.y_pelota].getBackground() == Color.GRAY)&&
					(dir_reloj == true))
					{
						System.out.println("Paso 5");
						Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.BLACK);
						Consola.x_pelota = Consola.x_pelota-1;
						Consola.y_pelota = Consola.y_pelota-1;
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.GREEN)
						{
							Consola.punt += 5;
							Consola.puntuacion.setText(""+Consola.punt);
						}
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.YELLOW)
						{
							Consola.punt += 10;
							Consola.puntuacion.setText(""+Consola.punt);						
						}
						if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.RED)
						{
							Consola.punt += 15;
							Consola.puntuacion.setText(""+Consola.punt);
						}
						Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.WHITE);
						try {
							this.sleep(50);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						opc = 0;
					}
					else if ((Consola.casillas[Consola.x_pelota+1][Consola.y_pelota].getBackground() == Color.GRAY)&&
					(dir_reloj == false))
					{
						if (permiso2 == true)
						{
							System.out.println("Paso 18");
							Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.BLACK);
							Consola.x_pelota = Consola.x_pelota-1;
							Consola.y_pelota = Consola.y_pelota-1;
							if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.GREEN)
							{
								Consola.punt += 5;
								Consola.puntuacion.setText(""+Consola.punt);
							}
							if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.YELLOW)
							{
								Consola.punt += 10;
								Consola.puntuacion.setText(""+Consola.punt);						
							}
							if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.RED)
							{
								Consola.punt += 15;
								Consola.puntuacion.setText(""+Consola.punt);
							}
							Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.WHITE);
							try {
								this.sleep(50);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							dir_reloj = true;
						}
						else
						{
							System.out.println("Paso 10");
							Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.BLACK);
							Consola.x_pelota = Consola.x_pelota-1;
							Consola.y_pelota = Consola.y_pelota+1;
							if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.GREEN)
							{
								Consola.punt += 5;
								Consola.puntuacion.setText(""+Consola.punt);
							}
							if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.YELLOW)
							{
								Consola.punt += 10;
								Consola.puntuacion.setText(""+Consola.punt);						
							}
							if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.RED)
							{
								Consola.punt += 15;
								Consola.puntuacion.setText(""+Consola.punt);
							}
							Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.WHITE);
							try {
								this.sleep(50);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							opc = 4;
							dir_reloj = false;
						}
					}
					
					else if (dir_reloj == false)
					{
						if((Consola.x_pelota == 18)&&(Consola.casillas[Consola.x_pelota+1][Consola.y_pelota].getBackground()==Color.BLACK))
						{
							Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.BLACK);
							Consola.x_pelota = Consola.x_pelota+1;
							Consola.y_pelota = Consola.y_pelota+1;
							if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.GREEN)
							{
								Consola.punt += 5;
								Consola.puntuacion.setText(""+Consola.punt);
							}
							if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.YELLOW)
							{
								Consola.punt += 10;
								Consola.puntuacion.setText(""+Consola.punt);						
							}
							if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.RED)
							{
								Consola.punt += 15;
								Consola.puntuacion.setText(""+Consola.punt);
							}
							Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.WHITE);
							try {
								this.sleep(50);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							opc = 4;
							dir_reloj = false;
						}
						else if (Consola.casillas[Consola.x_pelota+1][Consola.y_pelota].getBackground()==Color.BLACK)
						{
							Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.BLACK);
							Consola.x_pelota = Consola.x_pelota-1;
							Consola.y_pelota = Consola.y_pelota+1;
							if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.GREEN)
							{
								Consola.punt += 5;
								Consola.puntuacion.setText(""+Consola.punt);
							}
							if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.YELLOW)
							{
								Consola.punt += 10;
								Consola.puntuacion.setText(""+Consola.punt);						
							}
							if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.RED)
							{
								Consola.punt += 15;
								Consola.puntuacion.setText(""+Consola.punt);
							}
							Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.WHITE);
							try {
								this.sleep(50);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							opc = 4;
							dir_reloj = false;
						}
					}
					
					else if (dir_reloj == true)
					{
						if((Consola.x_pelota == 18)&&(Consola.casillas[Consola.x_pelota+1][Consola.y_pelota].getBackground()==Color.BLACK))
						{
							Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.BLACK);
							Consola.x_pelota = Consola.x_pelota+1;
							Consola.y_pelota = Consola.y_pelota-1;
							if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.GREEN)
							{
								Consola.punt += 5;
								Consola.puntuacion.setText(""+Consola.punt);
							}
							if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.YELLOW)
							{
								Consola.punt += 10;
								Consola.puntuacion.setText(""+Consola.punt);						
							}
							if (Consola.casillas[Consola.x_pelota][Consola.y_pelota].getBackground() == Color.RED)
							{
								Consola.punt += 15;
								Consola.puntuacion.setText(""+Consola.punt);
							}
							Consola.casillas[Consola.x_pelota][Consola.y_pelota].setBackground(Color.WHITE);
							try {
								this.sleep(50);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							opc = 4;
						}
					}
				}
				
			}
			else
			{
				Consola.muere = true;
			}
		}
		
		if (Consola.muere = true)
		{
			Consola.corazon2.setVisible(false);
			Consola.hiloJuego.parar();
			Consola c = new Consola("Kuixon");
			Vidas v = new Vidas(Consola.nombre, Consola.punt);
		}
	}
	
}

/**En esta ventana está toda la información sobre la consola del juego. En ella se
 * encuentran todos los componentes de esta ventana.
 * @author Endika Salgueiro
 */
public class Consola extends javax.swing.JFrame implements ActionListener, KeyListener {
	
	public static Combate hiloJuego;
	public static int cont2 = 0;
	public static boolean izquierda = false, derecha = false;
	public static int pos_inicial;
	public static int x_pelota;
	public static int y_pelota;
	public static JPanel [][] casillas;
	private Mov_Barra mb;
	private Mov_Pelota mp;
	public static boolean muere = false;
	public static int punt = 0;
	public static String nombre;
	/**
     * Crea una nueva ventana Consola.
     */
    public Consola(String nombre) {
    	this.nombre = nombre;
    	if (hiloJuego == null)
    	{
    		//Hilos
        	hiloJuego = new Combate("proceso 2");
        	hiloJuego.start();
        
    	}
    	else if (hiloJuego.estadoSonido())
        {
        	hiloJuego.reanudar();
        }
    	initComponents();
    }

    /**
     * Este método se llama desde dentro del constructor para inicializar la ventana.
      * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
      *regenerado por el editor de ventanas.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
    	
        panelJuego = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        puntuacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nivel = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        corazon2 = new javax.swing.JLabel();
        salir_consola = new javax.swing.JButton();
        sonido = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        casillas = new JPanel[20][20];
        
		if (nombre != "Kuixon")
		{
			JOptionPane.showMessageDialog(this, "No podrás quitar la musica dentro de la consola porque si lo haces se te desactivarán los controles =P. ¡Asi que toca controlar los nervios! ¡¡¡MUCHA SUERTE!!!", "Información para el jugador", 0);
		}
               
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelJuego.setLayout(new GridLayout(20,20));
        //Añadir los objetos al panel de juego
        
        if (nombre == "Kuixon")
        	Nivel2();
        else
            inicializarJuego();
        
        getContentPane().add(panelJuego);
        panelJuego.setBounds(130, 100, 660, 520);
        panelJuego.setVisible(true);

        jLabel2.setFont(new java.awt.Font("Onyx", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("NIVEL:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(530, 40, 70, 30);

        puntuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntuacionActionPerformed(evt);
            }
        });
        getContentPane().add(puntuacion);
        puntuacion.setBounds(340, 40, 120, 30);
        puntuacion.setText("0");

        jLabel3.setFont(new java.awt.Font("Onyx", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("PUNTUACION:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 40, 140, 30);
        getContentPane().add(nivel);
        nivel.setBounds(610, 40, 70, 30);
        nivel.setText("1");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Onyx", 1, 36)); // NOI18N
        jLabel1.setText("VIDAS:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 10, 67, 39);

        corazon2.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\Corazon.gif")); // NOI18N
        jPanel1.add(corazon2);
        corazon2.setBounds(250, 10, 50, 39);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(250, 650, 420, 50);

        salir_consola.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\cruz-roja-x-.jpg")); // NOI18N
        getContentPane().add(salir_consola);
        salir_consola.setBounds(873, 10, 30, 30);
        
        sonido.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\sonido-ubuntu.png")); // NOI18N
        getContentPane().add(sonido);
        sonido.setBounds(10, 10, 30, 30);
        
        jLabel4.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\videosonic.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 920, 750);
      
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(917, 753));

        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);

        //Para para poder utilizar los botones.
        salir_consola.addActionListener(this);
        sonido.addActionListener(this);
        
        //Para que esta pantalla aparezca a sel pulsada por un boton en otra ventana.
        this.setVisible(true);

        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("F:/Program III/Proyecto/Programa/Break the bricks/src/Fotos/iconoJuego").getImage());
        
        //Para poner titulo.
        this.setTitle("Consola");
        
        this.setFocusable(true);
        this.requestFocus();
        
        //Para poder utilizar el teclado
        this.addKeyListener(this);
        
        pack();
    }// </editor-fold>
    
    /**Este método nos servirá para inicializar el tablero de juego de un modo al terminar la partida.
     * 
     */
    public void Nivel2()
    {
    	for (int fila=0;fila<20;fila++)
		{
			for (int columna=0;columna<20;columna++)
			{
				casillas[fila][columna] = new JPanel();
				casillas[fila][columna].setBackground(Color.BLACK);
				
				//Coloco 1º ladrillo
				if (fila==4)
				{		
					if (columna==2)
					{	
						casillas[fila][columna].setBackground(Color.GREEN);
					}	
				}
				//Fin colocar 1º ladrillo
				
				//Coloco 2º ladrillo
				if (columna == 1)
				{
					if ((fila == 2)||(fila == 3)||(fila == 4)||(fila == 5)||(fila == 6))
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 2º ladrillo
				
				//Coloco 3º ladrillo
				if (columna == 3)
				{
					if (fila == 3)
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 3º Ladrillo
				
				//Coloco 4º ladrillo
				if (fila == 2)
				{
					if (columna == 4)
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 4º ladrillo
				
				//Coloco 5º ladrillo
				if (fila == 5)
				{
					if (columna == 3)
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 5º ladrillo
				
				//Coloco 6º ladrillo
				if (fila == 6)
				{
					if (columna == 4)
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 6º ladrillo
				
				//Coloco 7º ladrillo
				if (columna == 6)
				{
					if ((fila == 2)||(fila == 3)||(fila == 4)||(fila==5))
					{
						casillas[fila][columna].setBackground(Color.RED);
					}
				}
				//Fin colocar 7º ladrillo
				
				//Coloco 8º ladrillo
				if (fila == 6)
				{
					if ((columna == 6)||(columna == 7)||(columna == 8)||(columna == 9))
					{
						casillas[fila][columna].setBackground(Color.RED);
					}
				}
				//Fin colocar 8º ladrillo
				
				//Coloco 9º ladrillo
				if (columna == 9)
				{
					if ((fila == 2)||(fila == 3)||(fila == 4)||(fila == 5))
					{
						casillas[fila][columna].setBackground(Color.RED);
					}
				}
				//Fin colocar 9º ladrillo
				
				//Coloco 10º ladrillo
				if ((columna == 11)||(columna == 12))
				{
					if ((fila == 2)||(fila == 3)||(fila == 4)||(fila == 5)||(fila == 6))
					{
						casillas[fila][columna].setBackground(Color.WHITE);
					}
				}
				//Fin colocar 10º ladrillo
				
				//Coloco 11º ladrillo
				if (fila == 2)
				{
					if (columna == 14)
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 11º ladrillo
				
				//Coloco 12º ladrillo
				if (fila == 3)
				{
					if (columna == 15)
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 12º ladrillo
				
				//Coloco 13º ladrillo
				if (fila == 4)
				{
					if (columna == 16)
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 13º ladrillo
				
				//Coloco 14º ladrillo
				if (fila == 3)
				{
					if (columna == 17)
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 14º ladrillo
				
				//Coloco 15º ladrillo
				if (fila == 2)
				{
					if (columna == 18)
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 15º ladrillo
				
				//Coloco 16º ladrillo
				if (fila == 5)
				{
					if (columna == 15)
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 16º ladrillo
				
				//Coloco 17º ladrillo
				if (fila == 6)
				{
					if (columna == 14)
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 17º ladrillo
				
				//Coloco 18º ladrillo
				if (fila == 5)
				{
					if (columna == 17)
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 18º ladrillo
				
				//Coloco 19º ladrillo
				if (fila == 6)
				{
					if (columna == 18)
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 19º ladrillo
				
				//Colocar 20º ladrillo
				if (fila == 11)
				{
					if ((columna == 1)||(columna == 2)||(columna == 3)||(columna ==4))
					{
						casillas[fila][columna].setBackground(Color.RED);						
					}
				}
				//Fin colocar 20º ladrillo
				
				//Colocar 21º ladrillo
				if (columna == 1)
				{
					if ((fila == 12)||(fila == 13)||(fila == 14))
					{
						casillas[fila][columna].setBackground(Color.RED);						
					}
				}
				//Fin colocar 21º ladrillo
				
				//Colocar 22º ladrillo
				if (fila == 15)
				{
					if ((columna == 1)||(columna == 2)||(columna == 3)||(columna ==4))
					{
						casillas[fila][columna].setBackground(Color.RED);						
					}
				}
				//Fin colocar 22º ladrillo
				
				//Colocar 23º ladrillo
				if (fila == 13)
				{
					if ((columna == 3)||(columna ==4))
					{
						casillas[fila][columna].setBackground(Color.RED);
					}
				}
				//Fin colocar 23º ladrillo
				
				//Colocar 24º ladrillo
				if (fila == 14)
				{
					if (columna == 4)
					{
						casillas[fila][columna].setBackground(Color.RED);
					}
				}
				//Fin colocar 24º ladrillo
				
				//Colocar 25º ladrillo
				if (columna == 6)
				{
					if ((fila == 11)||(fila == 12)||(fila == 13)||(fila == 14)||(fila == 15))
					{
						casillas[fila][columna].setBackground(Color.WHITE);
					}
				}
				//Fin colocar 25º ladrillo
				
				//Colocar 26º ladrillo
				if (fila == 11)
				{
					if ((columna == 7)||(columna == 8))
					{
						casillas[fila][columna].setBackground(Color.WHITE);
					}
				}
				//Fin colocar 26º ladrillo
				
				//Colocar 27º ladrillo
				if (fila == 13)
				{
					if ((columna == 7)||(columna == 8))
					{
						casillas[fila][columna].setBackground(Color.WHITE);
					}
				}
				//Fin colocar 27º ladrillo
				
				//Colocar 28º ladrillo
				if (columna == 9)
				{
					if ((fila == 11)||(fila == 12)||(fila == 13)||(fila == 14)||(fila == 15))
					{
						casillas[fila][columna].setBackground(Color.WHITE);						
					}
				}
				//Fin colocar 28º ladrillo
				
				//Colocar 29º ladrillo
				if (columna == 11)
				{
					if ((fila == 11)||(fila == 12)||(fila == 13)||(fila == 14)||(fila == 15))
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 29º ladrillo
				
				//Colocar 30º ladrillo
				if (fila == 12)
				{
					if ((columna == 12)||(columna == 13))
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 30º ladrillo
				
				//Colocar 31º ladrillo
				if (columna == 14)
				{
					if ((fila == 11)||(fila == 12)||(fila == 13)||(fila == 14)||(fila == 15))
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 31º ladrillo
				
				//Colocar 32º ladrillo
				if (columna == 16)
				{
					if ((fila == 12)||(fila == 13)||(fila == 14))
					{
						casillas[fila][columna].setBackground(Color.RED);
					}
				}
				//Fin colocar 32º ladrillo
				
				//Colocar 33º ladrillo
				if (fila == 11)
				{
					if ((columna == 16)||(columna == 17)||(columna == 18))
					{
						casillas[fila][columna].setBackground(Color.RED);
					}
				}
				//Fin colocar 33º ladrillo
				
				//Colocar 34º ladrillo
				if (fila == 15)
				{
					if ((columna == 16)||(columna == 17)||(columna == 18))
					{
						casillas[fila][columna].setBackground(Color.RED);
					}
				}
				//Fin colocar 34º ladrillo
				
				//Coloco 35º ladrillo
				if (fila == 13)
				{
					if (columna == 17)
					{
						casillas[fila][columna].setBackground(Color.RED);
					}
				}
				//Fin colocar 35º ladrillo
				
				//Coloco barra
				if (fila==19)
				{
					if (columna==7||columna==8||columna==9||columna==10||columna==11)
					{
						casillas [fila][columna].setBackground(Color.BLACK);
					}
				}
				//Fin coloco barra
				
				//Coloco pelota
				if (fila==18)
				{
					if(columna==9)
					{
						casillas [fila][columna].setBackground(Color.BLACK);
					}
				}
				//Fin coloco pelota
				
				//casillas[fila][columna].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
				panelJuego.add(casillas[fila][columna]);
				pos_inicial = 7;
				x_pelota = 18;
				y_pelota = 9;
			}
			
		}	

    }
    
    /**Este método inicializará los bloques en el tablero de juego antes de empezar la partida.
     * 
     */
    public void inicializarJuego() {
		// TODO Auto-generated method stub
		for (int fila=0;fila<20;fila++)
		{
			for (int columna=0;columna<20;columna++)
			{
				casillas[fila][columna] = new JPanel();
				casillas[fila][columna].setBackground(Color.BLACK);
				
				//Coloco 1º ladrillo
				if (fila == 0)
				{
					if ((columna == 0)||(columna == 1)||(columna == 2)||(columna == 3)||(columna == 4)||(columna == 5)||
							(columna == 6)||(columna == 7)||(columna == 8)||(columna == 9)||(columna == 10)||
							(columna == 11)||(columna == 12)||(columna == 13)||(columna == 14)||(columna == 15)||
							(columna == 16)||(columna == 17)||(columna == 18)||(columna == 19))
							{
								casillas[fila][columna].setBackground(Color.RED);
							}
				}
				//Fin colocar 1º ladrillo
				
				//Coloco 2º ladrillo
				if (fila == 1)
				{
					if ((columna == 0)||(columna == 1)||(columna == 2)||(columna == 3)||(columna == 4)||(columna == 5)||
							(columna == 6)||(columna == 7)||(columna == 8)||(columna == 9)||(columna == 10)||
							(columna == 11)||(columna == 12)||(columna == 13)||(columna == 14)||(columna == 15)||
							(columna == 16)||(columna == 17)||(columna == 18)||(columna == 19))
					{
						casillas[fila][columna].setBackground(Color.YELLOW);
					}
				}
				//Fin colocar 2º ladrillo
				
				//Coloco 3º ladrillo
				if (fila == 2)
				{
					if ((columna == 0)||(columna == 1)||(columna == 2)||(columna == 3)||(columna == 4)||(columna == 5)||
							(columna == 6)||(columna == 7)||(columna == 8)||(columna == 9)||(columna == 10)||
							(columna == 11)||(columna == 12)||(columna == 13)||(columna == 14)||(columna == 15)||
							(columna == 16)||(columna == 17)||(columna == 18)||(columna == 19))
					{
						casillas[fila][columna].setBackground(Color.GREEN);
					}
				}
				//Fin colocar 3º Ladrillo
					
				//Coloco barra
				if (fila==19)
				{
					if (columna==7||columna==8||columna==9||columna==10||columna==11)
					{
						casillas [fila][columna].setBackground(Color.GRAY);
					}
				}
				//Fin coloco barra
				
				//Coloco pelota
				if (fila==18)
				{
					if(columna==9)
					{
						casillas [fila][columna].setBackground(Color.WHITE);
					}
				}
				//Fin coloco pelota
				
				//casillas[fila][columna].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
				panelJuego.add(casillas[fila][columna]);
				pos_inicial = 7;
				x_pelota = 18;
				y_pelota = 9;
			}
			
		}	
		
	}
   
	private void puntuacionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**Este es el programa principal de la clase el cual contiene un código necesario para
     * el correcto funcionamiento de la clase.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    	
    	/* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consola("").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    public static javax.swing.JLabel corazon2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelJuego;
    private javax.swing.JTextField nivel;
    public static javax.swing.JTextField puntuacion;
    private javax.swing.JButton salir_consola;
    private javax.swing.JButton sonido;
    // End of variables declaration
    
    
	/*Este método lo utilizaremos para darle funcionalidad a los botones de la ventana.
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==salir_consola)
		{
			Ventana_Cierre vc = new Ventana_Cierre("Consola");
			this.dispose();
		}
		else if(e.getSource()==sonido)
		{
			cont2++;
			if (cont2%2!=0)
			{
				hiloJuego.parar();
				sonido.setIcon(new ImageIcon ("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\Audio-mute.png"));
			}
			else
			{
				hiloJuego.reanudar();
				sonido.setIcon(new ImageIcon ("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\sonido-ubuntu.png"));
			}
		}	
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (Character.isWhitespace(arg0.getKeyCode()))
		{
			if ((mb == null)&&(mp == null)){
				mb = new Mov_Barra();
				mb.start();
				mp = new Mov_Pelota();
				mp.start();
			}
		}
		else
		{
			actualiza (arg0.getKeyCode(), true);
		}
		
	}

	private void actualiza(int keyCode, boolean b) {
		// TODO Auto-generated method stub
		switch (keyCode)
		{
		case KeyEvent.VK_LEFT:
			izquierda = b; break;
		case KeyEvent.VK_RIGHT:
			derecha = b; break;
		case KeyEvent.VK_ESCAPE:
			this.dispose();
		default:
			izquierda=false;derecha=false;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		actualiza (arg0.getKeyCode(), false);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
