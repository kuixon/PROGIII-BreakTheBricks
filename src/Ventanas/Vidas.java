package Ventanas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import Clases_Basicas.Record;
import Clases_Gestoras.Sistema_Records;

/**Esta ventana nos informará de que nuestra partida ha terminado porque hemos agotado el número de vidas que poseíamos.
 * @author Endika Salgueiro
 *
 */
public class Vidas extends javax.swing.JFrame implements ActionListener {
	private int p;
	private String nombre;
    /**
     * Constructor por parámetros de la clase.
     */
    public Vidas(String nombre, int p) {
    	this.nombre = nombre;
    	this.p = p;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextPane();
        aceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Onyx", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("GAME OVER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 30, 120, 30);

        texto.setText("Has perdido. A continuación, selecciona la pantalla anterior y pulsa 'ESC' (esta desaparecerá). Despues selecciona la otra pantalla y az lo mismo para que desaparezca. Una vez desaparecidas las dos pantallas, pulsa 'ACEPTAR' para volver al Menu Principal del juego.");
        jScrollPane1.setViewportView(texto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 90, 390, 60);

        aceptar.setFont(new java.awt.Font("Onyx", 0, 24)); // NOI18N
        aceptar.setForeground(new java.awt.Color(0, 51, 153));
        aceptar.setText("ACEPTAR");
        getContentPane().add(aceptar);
        aceptar.setBounds(210, 150, 90, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\ImagenFondoUniverso.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 520, 210);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(520, 211));
        
        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);
        
        //Para para poder utilizar los botones.
        aceptar.addActionListener(this);
        
      //Para que esta pantalla aparezca a sel pulsada por un boton en otra ventana.
        this.setVisible(true);

        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("F:/Program III/Proyecto/Programa/Break the bricks/src/Fotos/iconoJuego").getImage());
        
        //Para poner titulo.
        this.setTitle("Información vidas");


        pack();
    }// </editor-fold>

    private void textoActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(Vidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vidas("", 0).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane texto;
    // End of variables declaration
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == aceptar)
		{
			this.dispose();
			Record r = new Record (nombre, p);
			Sistema_Records sr = new Sistema_Records();
	        sr.anyadirRecordLista(r);
	        try {
				sr.volvarFicheroRecords();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Mejores_Puntuaciones mp = new Mejores_Puntuaciones(nombre, p);
		}
	}
}
