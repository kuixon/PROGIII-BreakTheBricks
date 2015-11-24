package Ventanas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import Clases_Basicas.Record;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**En esta ventana está toda la información sobre el menu principal del juego. En ella se
 * encuentran todos los componentes de esta ventana.
 * @author Endika Salgueiro
 */
public class Menu_Principal extends javax.swing.JFrame implements ActionListener {
	
	private String nombre;
	
    /**
     * Crea una nueva ventana Menu_Principal.
     */
    public Menu_Principal(String nombre) {
    	this.nombre = nombre;
    	if (nombre.equals("Habilitar"))
    	{
    		listamejorespuntuaciones.setEnabled(true);
    	}
    	initComponents();
        if (Ventana_Principal.hilo.estadoSonido())
        {
        	Ventana_Principal.hilo.reanudar();
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

        jLabel1 = new javax.swing.JLabel();
        estadisticas = new javax.swing.JButton();
        sonido = new javax.swing.JButton();
        nueva_partida = new javax.swing.JButton();
        como_jugar = new javax.swing.JButton();
        cerrar_menuprincipal = new javax.swing.JButton();
        listamejorespuntuaciones = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Onyx", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Menu Principal");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 30, 220, 65);

        estadisticas.setBackground(new java.awt.Color(51, 255, 102));
        estadisticas.setFont(new java.awt.Font("Onyx", 0, 30)); // NOI18N
        estadisticas.setText("Estadisticas");
        getContentPane().add(estadisticas);
        estadisticas.setBounds(260, 180, 140, 50);
        estadisticas.setEnabled(false);
        
        sonido.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\sonido-ubuntu.png")); // NOI18N
        getContentPane().add(sonido);
        sonido.setBounds(10, 10, 30, 30);

        nueva_partida.setBackground(new java.awt.Color(51, 255, 102));
        nueva_partida.setFont(new java.awt.Font("Onyx", 0, 30)); // NOI18N
        nueva_partida.setText("Nueva Partida");
        getContentPane().add(nueva_partida);
        nueva_partida.setBounds(260, 110, 140, 50);

        como_jugar.setBackground(new java.awt.Color(51, 255, 102));
        como_jugar.setFont(new java.awt.Font("Onyx", 0, 30)); // NOI18N
        como_jugar.setText("¿Como jugar?");
        como_jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                como_jugarActionPerformed(evt);
            }
        });
        getContentPane().add(como_jugar);
        como_jugar.setBounds(260, 320, 140, 50);

        cerrar_menuprincipal.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\cruz-roja-x-.jpg")); // NOI18N
        getContentPane().add(cerrar_menuprincipal);
        cerrar_menuprincipal.setBounds(640, 10, 30, 30);

        listamejorespuntuaciones.setBackground(new java.awt.Color(51, 255, 102));
        listamejorespuntuaciones.setFont(new java.awt.Font("Onyx", 0, 30)); // NOI18N
        listamejorespuntuaciones.setText("Lista de mejores puntuaciones");
        getContentPane().add(listamejorespuntuaciones);
        listamejorespuntuaciones.setBounds(200, 250, 260, 50);
        listamejorespuntuaciones.setEnabled(false);

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\ImagenFondoUniverso.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 680, 390);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(682, 410));
        
        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);
        
        //Para para poder utilizar los botones.
        cerrar_menuprincipal.addActionListener(this);
        estadisticas.addActionListener(this);
        sonido.addActionListener(this);
        listamejorespuntuaciones.addActionListener(this);
        nueva_partida.addActionListener(this);
        como_jugar.addActionListener(this);
        
        //Para que esta pantalla aparezca a sel pulsada por un boton en otra ventana.
        this.setVisible(true);
        
        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("F:/Program III/Proyecto/Programa/Break the bricks/src/Fotos/iconoJuego").getImage());
        
        //Para poner titulo.
        this.setTitle("Menu Principal");

        pack();
    }// </editor-fold>

    private void como_jugarActionPerformed(java.awt.event.ActionEvent evt) {                                                         
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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal("").setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify
    private javax.swing.JButton cerrar_menuprincipal;
    private javax.swing.JButton como_jugar;
    private javax.swing.JButton estadisticas;
    private javax.swing.JButton sonido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton listamejorespuntuaciones;
    private javax.swing.JButton nueva_partida;
    // End of variables declaration
    
    
	/*Este método lo utilizaremos para darle funcionalidad a los botones de la ventana.
	 *  (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
			if (e.getSource()==cerrar_menuprincipal)
			{
				Ventana_Cierre vc = new Ventana_Cierre("Menu Principal");
				this.dispose();
			}
			if(e.getSource()==estadisticas)
			{
				Estadisticas es = new Estadisticas();
				this.dispose();
			}
			if(e.getSource()==listamejorespuntuaciones)
			{
				Mejores_Puntuaciones mp = new Mejores_Puntuaciones("", 0);
				this.dispose();
			}
			if(e.getSource()==nueva_partida)
			{
				this.dispose();
				Ventana_Principal.hilo.parar();
				Consola c = new Consola(nombre);
			}
			if (e.getSource()==como_jugar)
			{
				Instrucciones i = new Instrucciones();
				this.dispose();
			}
			else if(e.getSource()==sonido)
			{
				Ventana_Principal.cont++;
				if (Ventana_Principal.cont%2!=0)
				{
					Ventana_Principal.hilo.parar();
					sonido.setIcon(new ImageIcon ("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\Audio-mute.png"));
				}
				else
				{
					Ventana_Principal.hilo.reanudar();
					sonido.setIcon(new ImageIcon ("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\sonido-ubuntu.png"));
				}
			}
	}
}
