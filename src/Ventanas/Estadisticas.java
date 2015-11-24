package Ventanas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**En esta ventana está toda la información sobre la ventana de estadisticas del juego.
 * En ella se encuentran todos los componentes de esta ventana.
 * @author Endika Salgueiro
 */
public class Estadisticas extends javax.swing.JFrame implements ActionListener {
	
	public static int puntTotal = 0;
    /**
     * Crea una nueva ventana Estadisticas.
     */
    public Estadisticas() {
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
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        retroceso_estadistica = new javax.swing.JButton();
        texto_ndepartidascompletadasenunaño = new javax.swing.JTextField();
        texto_puntuaciontotal = new javax.swing.JTextField();
        texto_mediadepuntospornivel = new javax.swing.JTextField();
        texto_ndenivelessuperados = new javax.swing.JTextField();
        texto_ndeladrillosdestruidos = new javax.swing.JTextField();
        texto_ndepartidascompletadas = new javax.swing.JTextField();
        texto_ndepartidasjugadasenunaño = new javax.swing.JTextField();
        texto_mediadevidasconsumidaspornivel = new javax.swing.JTextField();
        sonido = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        texto_mediadepuntospornivel.setText("0");
        texto_mediadevidasconsumidaspornivel.setText("0");
        texto_ndeladrillosdestruidos.setText("0");
        texto_ndenivelessuperados.setText("0");
        texto_ndepartidascompletadas.setText("0");
        texto_ndepartidascompletadasenunaño.setText("0");
        texto_ndepartidasjugadasenunaño.setText("0");
        texto_puntuaciontotal.setText("0");
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Onyx", 0, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Estadísticas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 0, 160, 50);

        jLabel2.setFont(new java.awt.Font("Onyx", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Puntuacion total:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 50, 130, 30);

        jLabel3.setFont(new java.awt.Font("Onyx", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Media de puntos por nivel:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 90, 200, 30);

        jLabel4.setFont(new java.awt.Font("Onyx", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Nº de niveles superados:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 130, 180, 30);

        jLabel6.setFont(new java.awt.Font("Onyx", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Nº de ladrillos destruidos:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 170, 190, 30);

        jLabel5.setFont(new java.awt.Font("Onyx", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Nº de partidas completadas:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 210, 220, 30);

        jLabel7.setFont(new java.awt.Font("Onyx", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Nº de partidas jugadas en un año:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 250, 250, 30);

        jLabel8.setFont(new java.awt.Font("Onyx", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("Media de vidas consumidas por nivel:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 290, 280, 33);

        jLabel9.setFont(new java.awt.Font("Onyx", 0, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("Nº de partidas completadas en un año:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 330, 290, 30);

        retroceso_estadistica.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\flecha-izquierda.jpg")); // NOI18N
        getContentPane().add(retroceso_estadistica);
        retroceso_estadistica.setBounds(10, 10, 40, 40);

        texto_ndepartidascompletadasenunaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_ndepartidascompletadasenunañoActionPerformed(evt);
            }
        });
        getContentPane().add(texto_ndepartidascompletadasenunaño);
        texto_ndepartidascompletadasenunaño.setBounds(320, 330, 320, 30);

        texto_puntuaciontotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_puntuaciontotalActionPerformed(evt);
            }
        });
        getContentPane().add(texto_puntuaciontotal);
        texto_puntuaciontotal.setBounds(170, 50, 470, 30);

        texto_mediadepuntospornivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_mediadepuntospornivelActionPerformed(evt);
            }
        });
        getContentPane().add(texto_mediadepuntospornivel);
        texto_mediadepuntospornivel.setBounds(230, 90, 410, 30);

        texto_ndenivelessuperados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_ndenivelessuperadosActionPerformed(evt);
            }
        });
        getContentPane().add(texto_ndenivelessuperados);
        texto_ndenivelessuperados.setBounds(220, 130, 420, 30);

        texto_ndeladrillosdestruidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_ndeladrillosdestruidosActionPerformed(evt);
            }
        });
        getContentPane().add(texto_ndeladrillosdestruidos);
        texto_ndeladrillosdestruidos.setBounds(230, 170, 410, 30);

        texto_ndepartidascompletadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_ndepartidascompletadasActionPerformed(evt);
            }
        });
        getContentPane().add(texto_ndepartidascompletadas);
        texto_ndepartidascompletadas.setBounds(250, 210, 390, 30);

        texto_ndepartidasjugadasenunaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_ndepartidasjugadasenunañoActionPerformed(evt);
            }
        });
        getContentPane().add(texto_ndepartidasjugadasenunaño);
        texto_ndepartidasjugadasenunaño.setBounds(280, 250, 360, 30);

        texto_mediadevidasconsumidaspornivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_mediadevidasconsumidaspornivelActionPerformed(evt);
            }
        });
        getContentPane().add(texto_mediadevidasconsumidaspornivel);
        texto_mediadevidasconsumidaspornivel.setBounds(310, 290, 330, 30);
        
        sonido.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\sonido-ubuntu.png")); // NOI18N
        getContentPane().add(sonido);
        sonido.setBounds(625, 10, 30, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\ImagenFondoUniverso.jpg")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 680, 390);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(682, 391));
        
        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);
        
        //Para para poder utilizar los botones.
        retroceso_estadistica.addActionListener(this);
        sonido.addActionListener(this);
        
        //Para que esta pantalla aparezca a sel pulsada por un boton en otra ventana.
        this.setVisible(true);
        
        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("F:/Program III/Proyecto/Programa/Break the bricks/src/Fotos/iconoJuego").getImage());
        
        //Para poner titulo.
        this.setTitle("Estadisticas");

        pack();
    }// </editor-fold>

    private void texto_ndepartidascompletadasenunañoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void texto_puntuaciontotalActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void texto_mediadepuntospornivelActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void texto_ndenivelessuperadosActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void texto_ndeladrillosdestruidosActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void texto_ndepartidascompletadasActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void texto_ndepartidasjugadasenunañoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void texto_mediadevidasconsumidaspornivelActionPerformed(java.awt.event.ActionEvent evt) {                                            
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
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadisticas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sonido;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton retroceso_estadistica;
    public static javax.swing.JTextField texto_mediadepuntospornivel;
    public static javax.swing.JTextField texto_mediadevidasconsumidaspornivel;
    public static javax.swing.JTextField texto_ndeladrillosdestruidos;
    public static javax.swing.JTextField texto_ndenivelessuperados;
    public static javax.swing.JTextField texto_ndepartidascompletadas;
    public static javax.swing.JTextField texto_ndepartidascompletadasenunaño;
    public static javax.swing.JTextField texto_ndepartidasjugadasenunaño;
    public static javax.swing.JTextField texto_puntuaciontotal;
    // End of variables declaration
    
    
	/*Este método lo utilizaremos para darle funcionalidad a los botones de la ventana.
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==retroceso_estadistica)
		{
			Menu_Principal m = new Menu_Principal("");
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
