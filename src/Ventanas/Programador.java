package Ventanas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**En esta ventana está toda la información sobre la ventana Programador del juego. En ella se
 * encuentran todos los componentes de esta ventana.
 * @author Endika Salgueiro
 */
public class Programador extends javax.swing.JFrame implements ActionListener {

    /**
     * Crea una nueva ventana Programador.
     */
    public Programador() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        retroceso_programador = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Onyx", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 51));
        jLabel1.setText("PROGRAMADOR DEL JUEGO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("PROGRAMADOR DEL JUEGO");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 30, 440, 36);

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("¡¡¡GRACIAS POR JUGAR AL JUEGO!!!");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 330, 420, 30);

        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 120, 190, 30);

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 0));
        jLabel5.setText("Nombre: Endika");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 110, 160, 30);

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 0));
        jLabel6.setText("Apellidos: Salgueiro, Barquin");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 160, 310, 30);

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 0));
        jLabel7.setText("Aficiones: Jugar al futbol y programar");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 210, 400, 30);

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 0));
        jLabel8.setText("Universidad: Universidad de Deusto");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 260, 360, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\yo.jpg")); // NOI18N
        jLabel9.setText("");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(440, 100, 140, 190);

        retroceso_programador.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\flecha-izquierda.jpg")); // NOI18N
        jPanel1.add(retroceso_programador);
        retroceso_programador.setBounds(10, 10, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 620, 410);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(620, 408));
        
        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);
        
        //Para para poder utilizar los botones. 
        retroceso_programador.addActionListener(this);
        
        //Para que esta pantalla aparezca a sel pulsada por un boton en otra ventana.
        this.setVisible(true);
        
        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("F:/Program III/Proyecto/Programa/Break the bricks/src/Fotos/iconoJuego").getImage());
        
        //Para poner titulo.
        this.setTitle("Ventana secreta");

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
            java.util.logging.Logger.getLogger(Programador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton retroceso_programador;
    // End of variables declaration
    
	/* Este método lo utilizaremos para darle funcionalidad a los botones de la ventana.
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==retroceso_programador)
		{
			Ventana_Principal mp = new Ventana_Principal();
			this.dispose();
		}
	}
}
