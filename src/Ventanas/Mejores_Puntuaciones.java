package Ventanas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import Clases_Basicas.Record;
import Clases_Gestoras.Sistema_Records;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**En esta ventana está toda la información sobre la ventana de las mejores puntuaciones
 * del juego. En ella se encuentran todos los componentes de esta ventana.
 * @author Endika Salgueiro
 */
public class Mejores_Puntuaciones extends javax.swing.JFrame implements ActionListener {
	
	private String nombre;
	private int p; 
    /**
     * Crea una nueva ventana Mejores_Puntuaciones.
     */
    public Mejores_Puntuaciones(String nombre, int p)
    {
    	this.nombre = nombre;
    	this.p = p;
    	initComponents(nombre, p);
    }

    /**
     * Este método se llama desde dentro del constructor para inicializar la ventana.
      * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
      *regenerado por el editor de ventanas.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents(String nombre, int p) {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        retroceso_listamejorespuntuaciones = new javax.swing.JButton();
        sonido = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Onyx", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Lista de mejores puntuaciones");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 20, 360, 60);
        
        tabla.setBackground(new java.awt.Color(0, 153, 204));
        tabla.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        tabla.setFont(new java.awt.Font("Onyx", 0, 11)); // NOI18N
        jScrollPane2.setViewportView(tabla);
        tabla.setBackground(new java.awt.Color(0, 153, 204));
        tabla.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        tabla.setFont(new java.awt.Font("Onyx", 0, 11)); // NOI18N
        
        Sistema_Records sr = new Sistema_Records();
        try {
			sr.leerFicheroRecords();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        boolean v = sr.sonIguales(nombre, p);
        if (v == true)
        {
        	tabla.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                        {nombre, p},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                    },
                    new String [] {
                        "Nick", "Puntuacion"
                    }
                ) {
                    Class[] types = new Class [] {
                        java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
                    };

                    public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                    }
                });

        }

        
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 120, 600, 190);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 120, 600, 190);

        retroceso_listamejorespuntuaciones.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\flecha-izquierda.jpg")); // NOI18N
        getContentPane().add(retroceso_listamejorespuntuaciones);
        retroceso_listamejorespuntuaciones.setBounds(10, 10, 40, 40);
        
        sonido.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\sonido-ubuntu.png")); // NOI18N
        getContentPane().add(sonido);
        sonido.setBounds(625, 10, 30, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\ImagenFondoUniverso.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 680, 390);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(682, 391));
        
        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);
        
        //Para para poder utilizar los botones.
        retroceso_listamejorespuntuaciones.addActionListener(this);
        sonido.addActionListener(this);
        
        //Para que esta pantalla aparezca a sel pulsada por un boton en otra ventana.
        this.setVisible(true);
        
        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("F:/Program III/Proyecto/Programa/Break the bricks/src/Fotos/iconoJuego").getImage());
        
        //Para poner titulo.
        this.setTitle("Lista de mejores puntuaciones");

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
            java.util.logging.Logger.getLogger(Mejores_Puntuaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mejores_Puntuaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mejores_Puntuaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mejores_Puntuaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mejores_Puntuaciones("", 0).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton retroceso_listamejorespuntuaciones;
    private javax.swing.JButton sonido;
    private javax.swing.JTable tabla;
    private DefaultTableModel dtm;
    // End of variables declaration
    
    
	/*Este método lo utilizaremos para darle funcionalidad a los botones de la ventana.
	 *  (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==retroceso_listamejorespuntuaciones)
		{
			this.dispose();
			Menu_Principal mp = new Menu_Principal("Habilitar");
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
