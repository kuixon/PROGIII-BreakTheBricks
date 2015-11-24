package Ventanas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import Audio.Sonido;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Clases_Gestoras.Sistema_Jugadores;
import Hilos.StarWars;

/**En esta ventana está toda la información sobre la ventana principal del juego. En ella se
 * encuentran todos los componentes de esta ventana.
 * @author Endika Salgueiro
 */
public class Ventana_Principal extends javax.swing.JFrame implements ActionListener {
    
	public static StarWars hilo;
	public static int cont = 0;
	
	/**
     * Crea una nueva ventana Ventana_Principal.
     */
    public Ventana_Principal() {
        initComponents();
        Sistema_Jugadores sj = new Sistema_Jugadores();
        try {
			sj.leerFichero();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * Este método se llama desde dentro del constructor para inicializar la ventana.
      * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
      *regenerado por el editor de ventanas.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        texto_nombredeusuario = new javax.swing.JTextField();
        texto_contraseña = new javax.swing.JPasswordField();
        aceptar = new javax.swing.JButton();
        registrarse = new javax.swing.JButton();
        cerrar_ventanaprincipal = new javax.swing.JButton();
        secreto = new javax.swing.JButton();
        sonido = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Onyx", 0, 55)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Break the Bricks");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 40, 220, 59);

        jLabel1.setFont(new java.awt.Font("Onyx", 0, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Nombre de Usuario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 140, 170, 30);

        jLabel3.setFont(new java.awt.Font("Onyx", 0, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 190, 102, 30);

        texto_nombredeusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_nombredeusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(texto_nombredeusuario);
        texto_nombredeusuario.setBounds(240, 140, 350, 31);

        texto_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_contraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(texto_contraseña);
        texto_contraseña.setBounds(170, 190, 420, 31);

        aceptar.setBackground(new java.awt.Color(102, 255, 102));
        aceptar.setFont(new java.awt.Font("Onyx", 0, 25)); // NOI18N
        aceptar.setText("ACEPTAR");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar);
        aceptar.setBounds(290, 240, 100, 40);

        registrarse.setBackground(new java.awt.Color(102, 255, 102));
        registrarse.setFont(new java.awt.Font("Onyx", 0, 25)); // NOI18N
        registrarse.setText("REGISTRARSE");
        getContentPane().add(registrarse);
        registrarse.setBounds(270, 300, 140, 40);

        cerrar_ventanaprincipal.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\cruz-roja-x-.jpg")); // NOI18N
        getContentPane().add(cerrar_ventanaprincipal);
        cerrar_ventanaprincipal.setBounds(640, 10, 32, 28);

        secreto.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\ImagenFondoUniverso.jpg")); // NOI18N
        secreto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secretoActionPerformed(evt);
            }
        });
        getContentPane().add(secreto);
        secreto.setBounds(0, 370, 73, 23);
        
        sonido.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\sonido-ubuntu.png")); // NOI18N
        getContentPane().add(sonido);
        sonido.setBounds(10, 10, 30, 30);
       
        jLabel4.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\ImagenFondoUniverso.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 680, 390);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(682, 415));

        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);

        //Para para poder utilizar los botones.
        aceptar.addActionListener(this);
        registrarse.addActionListener(this);
        secreto.addActionListener(this);
        cerrar_ventanaprincipal.addActionListener(this);
        sonido.addActionListener(this);

        //Para que esta pantalla aparezca a sel pulsada por un boton en otra ventana.
        this.setVisible(true);

        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("F:/Program III/Proyecto/Programa/Break the bricks/src/Fotos/iconoJuego").getImage());
        
        //Para poner titulo.
        this.setTitle("Ventana Principal");
        
        //Ayuda en los botones.
        texto_nombredeusuario.setToolTipText("Introduce tu nombre de usuario (en caso de haberte registrado)");
        texto_contraseña.setToolTipText("Introduce la contraseña (en caso de haberte registrado)");
        
        pack();
    }// </editor-fold>

    private void texto_nombredeusuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void texto_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void secretoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**Este es el programa principal de la clase el cual contiene un código necesario para
     * el correcto funcionamiento de la clase.
     * @param args the command line arguments
     * @throws Exception 
     */
    public static void main(String args[]) throws Exception {
       
       	//Hilos
    	hilo = new StarWars ("Proceso 1");
    	hilo.start();
    	
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
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Principal().setVisible(true);
            }
        });
    }
    
	// Variables declaration - do not modify
    private javax.swing.JButton aceptar;
    private javax.swing.JButton cerrar_ventanaprincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton registrarse;
    private javax.swing.JButton secreto;
    private javax.swing.JButton sonido;
    private javax.swing.JPasswordField texto_contraseña;
    public static javax.swing.JTextField texto_nombredeusuario;
    
	
	/*Este método lo utilizaremos para darle funcionalidad a los botones de la ventana.
	 *  (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
    @Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==aceptar)
		{
			Sistema_Jugadores sj = new Sistema_Jugadores();
			
			if (sj.existeJugadorYContraseña (texto_nombredeusuario.getText(), texto_contraseña.getText())==true)
				{
				Menu_Principal mp = new Menu_Principal(texto_nombredeusuario.getText());
				this.dispose();
				}
			else
				{
				JOptionPane.showMessageDialog(this, "Este usuario no esta creado o la contraseña introducida no es correcta", "Error en el LOGIN", JOptionPane.ERROR_MESSAGE);
				}			
		}
		else if(e.getSource()==registrarse)
		{
			Registro r = new Registro();
			this.dispose();
		}
		else if(e.getSource()==cerrar_ventanaprincipal)
		{
			Ventana_Cierre vc = new Ventana_Cierre("Ventana Principal");
			this.dispose();
		}
		else if (e.getSource()==secreto)
		{
			Programador p = new Programador();
			this.dispose();
		}
		else if(e.getSource()==sonido)
		{
			cont++;
			if (cont%2!=0)
			{
				hilo.parar();
				sonido.setIcon(new ImageIcon ("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\Audio-mute.png"));
			}
			else
			{
				hilo.reanudar();
				sonido.setIcon(new ImageIcon ("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\sonido-ubuntu.png"));
			}
		}
	}
}
