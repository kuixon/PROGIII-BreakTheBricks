package Ventanas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import Clases_Basicas.Jugador;
import Clases_Basicas.Partida;
import Clases_Gestoras.Sistema_Jugadores;
import Excepciones.LoginException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**En esta ventana está toda la información sobre la ventana de registro del juego. En ella se
 * encuentran todos los componentes de esta ventana.
 * @author Endika Salgueiro
 */
public class Registro extends javax.swing.JFrame implements ActionListener {
    /**
     * Crea una nueva ventana Registro.
     */
    public Registro() {
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
        texto_repitelacontraseña = new javax.swing.JPasswordField();
        texto_nombre = new javax.swing.JTextField();
        texto_apellidos = new javax.swing.JTextField();
        texto_nombredeusuario_reg = new javax.swing.JTextField();
        texto_contraseña_reg = new javax.swing.JPasswordField();
        enviar = new javax.swing.JButton();
        retroceso_registro = new javax.swing.JButton();
        sonido = new javax.swing.JButton();
        boton_condicion = new javax.swing.JRadioButton();
        leer_mas = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Onyx", 0, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Registro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 0, 120, 60);

        jLabel2.setFont(new java.awt.Font("Onyx", 0, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Repite la contraseña:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 270, 184, 30);

        jLabel3.setFont(new java.awt.Font("Onyx", 0, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 70, 70, 30);

        jLabel4.setFont(new java.awt.Font("Onyx", 0, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Apellidos:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 120, 80, 30);

        jLabel5.setFont(new java.awt.Font("Onyx", 0, 35)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Nombre de usuario:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 170, 164, 30);

        jLabel6.setFont(new java.awt.Font("Onyx", 0, 35)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Contraseña:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 220, 110, 30);

        texto_repitelacontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_repitelacontraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(texto_repitelacontraseña);
        texto_repitelacontraseña.setBounds(270, 270, 330, 30);

        texto_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(texto_nombre);
        texto_nombre.setBounds(160, 70, 440, 30);

        texto_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_apellidosActionPerformed(evt);
            }
        });
        getContentPane().add(texto_apellidos);
        texto_apellidos.setBounds(170, 120, 430, 30);

        texto_nombredeusuario_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_nombredeusuario_regActionPerformed(evt);
            }
        });
        getContentPane().add(texto_nombredeusuario_reg);
        texto_nombredeusuario_reg.setBounds(250, 170, 350, 30);

        texto_contraseña_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_contraseña_regActionPerformed(evt);
            }
        });
        getContentPane().add(texto_contraseña_reg);
        texto_contraseña_reg.setBounds(190, 220, 410, 30);

        enviar.setBackground(new java.awt.Color(102, 255, 102));
        enviar.setFont(new java.awt.Font("Onyx", 0, 30)); // NOI18N
        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        getContentPane().add(enviar);
        enviar.setBounds(270, 360, 130, 30);

        retroceso_registro.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\flecha-izquierda.jpg")); // NOI18N
        getContentPane().add(retroceso_registro);
        retroceso_registro.setBounds(10, 10, 40, 40);
        
        sonido.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\sonido-ubuntu.png")); // NOI18N
        getContentPane().add(sonido);
        sonido.setBounds(625, 10, 30, 30);

        boton_condicion.setFont(new java.awt.Font("Onyx", 0, 20)); // NOI18N
        boton_condicion.setForeground(new java.awt.Color(255, 255, 255));
        boton_condicion.setText("Acepto las condiciones y terminos de licencia");
        boton_condicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_condicionActionPerformed(evt);
            }
        });
        getContentPane().add(boton_condicion);
        boton_condicion.setBounds(80, 320, 270, 20);

        leer_mas.setFont(new java.awt.Font("Onyx", 0, 20)); // NOI18N
        leer_mas.setForeground(new java.awt.Color(0, 102, 255));
        leer_mas.setText("leer más");
        leer_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leer_masActionPerformed(evt);
            }
        });
        getContentPane().add(leer_mas);
        leer_mas.setBounds(350, 320, 80, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon("F:\\Program III\\Proyecto\\Programa\\Break the bricks\\src\\Fotos\\ImagenFondoUniverso.jpg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 680, 400);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(682, 420));

        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);

        //Para para poder utilizar los botones.
        boton_condicion.addActionListener(this);
        enviar.addActionListener(this);
        leer_mas.addActionListener(this);
        retroceso_registro.addActionListener(this);
        sonido.addActionListener(this);

        //Para que esta pantalla aparezca a sel pulsada por un boton en otra ventana.
        this.setVisible(true);

        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("F:/Program III/Proyecto/Programa/Break the bricks/src/Fotos/iconoJuego").getImage());
        
        //Para poner titulo.
        this.setTitle("Registro");
        
        //Ayuda en los botones.
        texto_nombre.setToolTipText("El campo nombre puede contener cualquier tipo de caracter y una longitud indefinida");
        texto_apellidos.setToolTipText("En este campo basta con introducir un espacio en blanco para separar los apellidos");
        texto_nombredeusuario_reg.setToolTipText("En este campo introducirás el nombre que utilizaras para acceder al juego en la ventana principal");
        texto_contraseña_reg.setToolTipText("En este campo introducirás la contraseña con la que luego podras acceder al juego desde la ventana principal");
        texto_repitelacontraseña.setToolTipText("En este campo debes introducir EXACTAMENTE la misma contraseña que en el campo anterior para evitar errores");
        enviar.setToolTipText("Al darle a este boton, te crearás un usuario con los datos que indicaste en el registro");
        
        pack();
    }// </editor-fold>

    private void texto_repitelacontraseñaActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void texto_nombreActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void texto_apellidosActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void texto_nombredeusuario_regActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                         

    private void texto_contraseña_regActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void boton_condicionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void leer_masActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JRadioButton boton_condicion;
    private javax.swing.JButton enviar;
    private javax.swing.JButton sonido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton leer_mas;
    private javax.swing.JButton retroceso_registro;
    private javax.swing.JTextField texto_apellidos;
    private javax.swing.JPasswordField texto_contraseña_reg;
    private javax.swing.JTextField texto_nombre;
    private javax.swing.JTextField texto_nombredeusuario_reg;
    private javax.swing.JPasswordField texto_repitelacontraseña;
    // End of variables declaration
	
	/**Este método nos devuelve una variable de tipo String. Esta variable contendrá un texto
	 * que nos indicará el error de registro que estamos comentiendo.
	 * @return
	 */
	public String error ()
	{
		String er = "";
		
		if (texto_contraseña_reg.getText().equals(""))
		{
			er = "Es obligatorio introducir algo en el campo 'Contraseña' antes de darle a 'ENVIAR'";
		}
		else
		{
			if ((texto_contraseña_reg.getText().equals(texto_repitelacontraseña.getText()))&&
				(!(texto_apellidos.getText().equals("")))&&(!(texto_nombre.getText().equals("")))&&(!(texto_nombredeusuario_reg.getText().equals("")))
				&&(boton_condicion.isSelected()==(true)))
			{
				er = "correcto";
			}
			else
			{
				if(((texto_apellidos.getText().equals(""))||(texto_nombre.getText().equals(""))||(texto_nombredeusuario_reg.getText().equals("")))
					&&(texto_contraseña_reg.getText().equals(texto_repitelacontraseña.getText()))
					&&(boton_condicion.isSelected()==(true)))
				{
					er = "Tienes algun campo sin rellenar";
				}
				if((!(texto_apellidos.getText().equals("")))&&(!(texto_nombre.getText().equals("")))&&(!(texto_nombredeusuario_reg.getText().equals("")))
					&&(!(texto_contraseña_reg.getText().equals(texto_repitelacontraseña.getText())))
					&&(boton_condicion.isSelected()==(true)))
				{
					er = "Las contraseñas introducidas no son iguales";
				}
				if((!(texto_apellidos.getText().equals("")))&&(!(texto_nombre.getText().equals("")))&&(!(texto_nombredeusuario_reg.getText().equals("")))
					&&(texto_contraseña_reg.getText().equals(texto_repitelacontraseña.getText()))
					&&(boton_condicion.isSelected()==(false)))
				{
					er = "No has aceptado los terminos y condiciones de licencia";
				}
				if(((texto_apellidos.getText().equals(""))||(texto_nombre.getText().equals(""))||(texto_nombredeusuario_reg.getText().equals("")))
					&&(!(texto_contraseña_reg.getText().equals(texto_repitelacontraseña.getText())))
					&&(boton_condicion.isSelected()==(true)))
				{
					er = "Tienes algun campo sin rellenar   |||   Las contraseñas introducidas no son iguales";
				}
				if(((texto_apellidos.getText().equals(""))||(texto_nombre.getText().equals(""))||(texto_nombredeusuario_reg.getText().equals("")))
					&&(texto_contraseña_reg.getText().equals(texto_repitelacontraseña.getText()))
					&&(boton_condicion.isSelected()==(false)))
				{
					er = "Tienes algun campo sin rellenar   |||   No has aceptado los terminos y condiciones de licencia";
				}
				if((!(texto_apellidos.getText().equals("")))&&(!(texto_nombre.getText().equals("")))&&(!(texto_nombredeusuario_reg.getText().equals("")))
					&&(!(texto_contraseña_reg.getText().equals(texto_repitelacontraseña.getText())))
					&&(boton_condicion.isSelected()==(false)))
				{
					er = "Las contraseñas introducidas no son iguales   |||   No has aceptado los terminos y condiciones de licencia";
				}
				if(((texto_apellidos.getText().equals(""))||(texto_nombre.getText().equals(""))||(texto_nombredeusuario_reg.getText().equals("")))
					&&(!(texto_contraseña_reg.getText().equals(texto_repitelacontraseña.getText())))
					&&(boton_condicion.isSelected()==(false)))
				{
					er = "Tienes algun campo sin rellenar   |||   Las contraseñas introducidas no son iguales   |||   No has aceptado los terminos y condiciones de licencia";
				}
			}
		}
		return er;
	}
	
	/* Este método lo utilizaremos para darle funcionalidad a los botones de la ventana.
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if((arg0.getSource()==enviar))
		{
			String er=error();
			if (er.equals("correcto"))
			{
				Sistema_Jugadores sj= new Sistema_Jugadores();
				if (sj.existeJugador(texto_nombredeusuario_reg.getText())==false)
				{
					Jugador j = new Jugador (texto_nombredeusuario_reg.getText(), texto_contraseña_reg.getText(), texto_nombre.getText(), texto_apellidos.getText(), new LinkedList <Partida>());
					sj.anyadirJugadorLista(j);
					Ventana_Principal vp = new Ventana_Principal();
					this.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(this, "Este usuario ya existe", "Error en el REGISTRO", JOptionPane.ERROR_MESSAGE);
				}
				
			}
			else
			{
				JOptionPane.showMessageDialog(this, er, "Tienes errores de registro", JOptionPane.ERROR_MESSAGE);
				try {
					throw new LoginException(er);
				} catch (LoginException e) {
					// TODO Auto-generated catch block
					System.out.println(er);
				}
			}
			
		}
		else if(arg0.getSource()==retroceso_registro)
		{
			Ventana_Principal vp = new Ventana_Principal();
			this.dispose();
		}
		else if(arg0.getSource()==leer_mas)
		{
			Leer_Mas le = new Leer_Mas();
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

