package Ventanas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**En esta ventana está toda la información sobre la ventana de instrucciones del juego. 
 * En ella se encuentran todos los componentes de esta ventana.
 * @author Endika Salgueiro
 */
public class Instrucciones extends javax.swing.JFrame implements ActionListener {

    /**
     * Crea una nueva ventana Instrucciones.
     */
    public Instrucciones() {
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

        jLabel1 = new javax.swing.JLabel();
        retroceso_instrucciones = new javax.swing.JButton();
        sonido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Onyx", 0, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Instrucciones");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 10, 180, 50);

        retroceso_instrucciones.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\flecha-izquierda.jpg")); // NOI18N
        getContentPane().add(retroceso_instrucciones);
        retroceso_instrucciones.setBounds(10, 10, 40, 40);

        jTextPane1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jTextPane1.setText("La finalidad de este juego es muy sencilla: Tienes que evitar que la bola se pierda y destrozar todos los ladrillos de cada nivel. El juego tendrá un nivel. Para pasarte este nivel cada jugador tendrá solo 1 vida.  Si pierdes la vida tu partida habrá terminado." +
        		" Ahora es el momento de hablar de los controles del juego. El jugador controlará una barra para evitar que la pelota se pierda. Para iniciar la partida, tendrás que pulsar la barra espaciadora. Para mover la barra, se utilizarán los botones de dirección de derecha e izquierda. Si pulsamos el botón de dirección de la izquierda, la barra se desplazará hacia la izquierda; y si pulsamos el botón de la derecha, la barra se desplazará hacia el otro sentido."+" Una vez explicado los controles, pasamos a los contenidos de un nivel. Como he dicho antes, cada partida tiene 1 único nivel. Este nivel contiene una serie de ladrillos a destruir.");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 80, 540, 230);

        jLabel2.setFont(new java.awt.Font("Onyx", 0, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Ahora que está todo explicado solo queda ¡¡¡JUGAR!!!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 330, 460, 40);
        
        sonido.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\sonido-ubuntu.png")); // NOI18N
        getContentPane().add(sonido);
        sonido.setBounds(560, 10, 30, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\ImagenFondoUniverso.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 620, 400);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(615, 400));
        
        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);
        
        //Para para poder utilizar los botones.
        retroceso_instrucciones.addActionListener(this);
        sonido.addActionListener(this);
        
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
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instrucciones().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton retroceso_instrucciones;
    private javax.swing.JButton sonido;
    // End of variables declaration
    
    
	/*Este método lo utilizaremos para darle funcionalidad a los botones de la ventana.
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==retroceso_instrucciones)
		{
			Menu_Principal mp = new Menu_Principal("");
			this.dispose();
		}
		else if(arg0.getSource()==sonido)
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
