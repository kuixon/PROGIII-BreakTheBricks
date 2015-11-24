package Ventanas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**En esta ventana está toda la información sobre la ventana de terminos y condiciones de
 * licencia del juego. En ella se encuentran todos los componentes de esta ventana.
 * @author Endika Salgueiro
 */
public class Leer_Mas extends javax.swing.JFrame implements ActionListener {

    /**
     * Crea una nueva ventana Leer_Mas.
     */
    public Leer_Mas() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        retroceso_leer_mas = new javax.swing.JButton();
        sonido = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Break the Bricks condiciones y terminos de licencia");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 50, 520, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Estos términos y condiciones se aplican al juego \"Break the bricks\" así como a sus muchos ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 120, 570, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("componentes tales como imagenes, sonidos, etc.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 140, 300, 14);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Lea atentamente estos términos y condiciones antes de acceder a este juego o utilizarlo.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 170, 570, 14);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 160, 570, 0);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Al utilizar el juego o acceder a él expresa que ha leído, comprendido y aceptado todos los términos y condiciones que");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 200, 610, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("rigen dicho juego o cualquier parte del mismo, incluyendo, entre otras cosas, todas y cada una de las expresiones que");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 220, 610, 14);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("de responsabilidad, reglas, directrices y políticas o declaraciones de privacidad, cuyos terminos y condiciones");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 240, 570, 14);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("compromete a respetar, entrarán en vigor de forma inmediata la primera vez que use el juego.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 260, 560, 14);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("En el caso de algunos términos, condiciones, exenciones, reglas, directrices y políticas o declaraciones que rigen parte");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 290, 620, 20);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("del juego podría hacerse referencia a ellos solo en dicha parte del juego, ser mostrados solo en él o accederse a los");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 310, 600, 20);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 290, 0, 0);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("mismos solo desde la mencionada parte del juego. Dichos términos, condiciones, o declaraciones se consideran");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(60, 330, 580, 20);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("incorporados por referencia a los presentes términos y condiciones del juego.");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(60, 350, 570, 14);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setText("De no comprometerse a aceptar todos los términos y condiciones de este juego, no deberá acceder a dicho juego,");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(60, 380, 610, 20);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setText("ni utilizarlo, y no tendrá permiso para hacerlo.");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(60, 400, 290, 14);

        retroceso_leer_mas.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\flecha-izquierda.jpg")); // NOI18N
        retroceso_leer_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retroceso_leer_masActionPerformed(evt);
            }
        });
        getContentPane().add(retroceso_leer_mas);
        retroceso_leer_mas.setBounds(10, 10, 40, 40);
        
        sonido.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\sonido-ubuntu.png")); // NOI18N
        getContentPane().add(sonido);
        sonido.setBounds(690, 20, 30, 30);

        jLabel17.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\certificado merito4.jpg")); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 0, 730, 480);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(733, 478));

        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);

        //Para para poder utilizar los botones.
        retroceso_leer_mas.addActionListener(this);
        sonido.addActionListener(this);

        //Para que esta pantalla aparezca a sel pulsada por un boton en otra ventana.
        this.setVisible(true);

        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("F:/Program III/Proyecto/Programa/Break the bricks/src/Fotos/iconoJuego").getImage());
        
        //Para poner titulo.
        this.setTitle("Terminos y condiciones de licencia");

        pack();
    }// </editor-fold>

    private void retroceso_leer_masActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(Leer_Mas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leer_Mas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leer_Mas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leer_Mas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Leer_Mas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton retroceso_leer_mas;
    private javax.swing.JButton sonido;
    // End of variables declaration
    
    
	/*Este método lo utilizaremos para darle funcionalidad a los botones de la ventana.
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==retroceso_leer_mas)
		{
			Registro r = new Registro();
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

