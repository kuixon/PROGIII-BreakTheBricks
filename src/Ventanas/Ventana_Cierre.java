package Ventanas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;

import Clases_Gestoras.Sistema_Jugadores;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**En esta ventana está toda la información sobre la ventana de cierre del juego. En ella se
 * encuentran todos los componentes de esta ventana.
 * @author Endika Salgueiro
 */
public class Ventana_Cierre extends javax.swing.JFrame implements ActionListener {

	private String origen;
	/**
     * Crea una nueva ventana Ventana_Cierre.
     */
    public Ventana_Cierre(String origen) {
        initComponents();
        this.origen=origen;
    }

    /**
     * Este método se llama desde dentro del constructor para inicializar la ventana.
      * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
      *regenerado por el editor de ventanas.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        si = new javax.swing.JButton();
        no = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        si.setBackground(new java.awt.Color(102, 255, 102));
        si.setFont(new java.awt.Font("Onyx", 0, 22)); // NOI18N
        si.setText("SI");
        si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siActionPerformed(evt);
            }
        });
        getContentPane().add(si);
        si.setBounds(110, 90, 45, 30);

        no.setBackground(new java.awt.Color(102, 255, 102));
        no.setFont(new java.awt.Font("Onyx", 0, 22)); // NOI18N
        no.setText("NO");
        getContentPane().add(no);
        no.setBounds(200, 90, 47, 30);

        jLabel1.setFont(new java.awt.Font("Onyx", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("¿Realmente desea abandonar el juego?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 40, 230, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 20, 290, 130);

        jLabel4.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\ImagenFondoUniverso.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 370, 170);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(372, 191));
        
        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);
        
        //Para para poder utilizar los botones. 
        si.addActionListener(this);
        no.addActionListener(this);
        
        //Para que esta pantalla aparezca a sel pulsada por un boton en otra ventana.
        this.setVisible(true);
        
        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("F:/Program III/Proyecto/Programa/Break the bricks/src/Fotos/iconoJuego").getImage());
        
        //Para poner titulo.
        this.setTitle("Ventana de salida");

        pack();
    }// </editor-fold>

    private void siActionPerformed(java.awt.event.ActionEvent evt) {                                   
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
            java.util.logging.Logger.getLogger(Ventana_Cierre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Cierre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Cierre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Cierre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Cierre("").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton no;
    private javax.swing.JButton si;
    // End of variables declaration
    
	/* Este método lo utilizaremos para darle funcionalidad a los botones de la ventana.
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if ((arg0.getSource()==si)&&(origen.equals("Menu Principal")||origen.equals("Ventana Principal"))||origen.equals("Pantalla Guardado"))
		{
			Sistema_Jugadores sj = new Sistema_Jugadores();
			try {
				sj.volcarFichero();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.dispose();
		}
		if ((arg0.getSource()==no)&&(origen.equals("Menu Principal")))
		{
			Menu_Principal mp = new Menu_Principal("");
			this.dispose();
		}
		if((arg0.getSource()==no)&&(origen.equals("Ventana Principal")))
		{
			Ventana_Principal vp = new Ventana_Principal();
			this.dispose();
		}
		if((arg0.getSource()==no)&&(origen.equals("Consola")))
		{
			this.dispose();
			Consola c = new Consola("");
		}
		if((arg0.getSource()==si)&&(origen.equals("Consola")))
		{
			this.dispose();
		}
	}
}
