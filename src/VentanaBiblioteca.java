
import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VentanaBiblioteca extends javax.swing.JFrame {
   File archivo,archivo2;NodoCategoria temporal;NodoImagen temporalimg;
   ListaImagen listita = new ListaImagen();
     Serializacion guardarx = new Serializacion();
          

 //public static ListaCategoria listaCategoria = new ListaCategoria();
 public static String vacio;


    /**
     * Creates new form VentanaBiblioteca
     */
    public VentanaBiblioteca() {
        
             
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        etiquetaFoto = new javax.swing.JLabel();
        nombreFoto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setForeground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Categorias");

        jButton1.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jButton1.setText("Eliminar Imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jButton2.setText("Agregar  Imagen ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton3.setText("Eliminar  Categoria ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton4.setText("Agregar  Categoria ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextField1.setText("INGRESE NOMBRE DE CATEGORIA PARA AGREGAR O ELIMINAR");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jButton5.setText("<html>Agregar categoria general por defecto<p> y agregar categorias ingresadas antes<html>");
        jButton5.setActionCommand("Agregar categoria general por defecto \ny\n ver categorias agregadas anteriormente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Agency FB", 1, 45)); // NOI18N
        jButton6.setText("<");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Agency FB", 1, 45)); // NOI18N
        jButton7.setText(">");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        etiquetaFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        nombreFoto.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        nombreFoto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombreFoto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(nombreFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiquetaFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145))
        );

        jButton5.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int res;
        String nodoseleccionado = (String)jComboBox2.getSelectedItem();
       if(nodoseleccionado==null){
           JOptionPane.showMessageDialog(null, "Escoja o agrege una categoria");
       }
       else if(VentanaPrincipal.listaUsuario.seleccion.listacategoria.find(nodoseleccionado)=="Si"){
        //Buscando]
         temporal=VentanaPrincipal.listaUsuario.seleccion.listacategoria.nodoseleccion;
         temporal = VentanaPrincipal.listaUsuario.seleccion.listacategoria.inicio;
        while(temporal != null && !temporal.categoria.equals(nodoseleccionado)){
            temporal = temporal.siguiente;
        }
        if(temporal != null){ 
            VentanaPrincipal.listaUsuario.seleccion.listacategoria.nodoseleccion=temporal;
       }
       buscarimg buscador = new buscarimg();
       FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG,PNG Y GIF","jpg","png","gif","jpeg");
       buscador.choser.setFileFilter(filtro);
       res = buscador.choser.showOpenDialog(null);
       if(JFileChooser.APPROVE_OPTION==res){
           archivo = buscador.choser.getSelectedFile();
           nombreFoto.setText(archivo.getAbsolutePath());
          try{
              ImageIcon imagen = new ImageIcon(archivo.toString()); 
              Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(etiquetaFoto.getWidth(), etiquetaFoto.getHeight(), Image.SCALE_DEFAULT));
              etiquetaFoto.setIcon(icono);
              
          }catch(Exception ex){
               JOptionPane.showMessageDialog(null, "Error al abrir");
          }VentanaPrincipal.listaUsuario.seleccion.listacategoria.nodoseleccion.listaimagenes.add(archivo.getAbsoluteFile().toString());
          VentanaPrincipal.listaUsuario.seleccion.listacategoria.nodoseleccion.listaimagenes.mostrar_elementos();
           
       }
        guardarx.guardar();
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       VentanaPrincipal.listaUsuario.seleccion.listacategoria.delete(jTextField1.getText());
        jComboBox2.removeAllItems();
        llenar();
        guardarx.guardar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.out.println(VentanaPrincipal.listaUsuario.seleccion.usuario);
        
        if(VentanaPrincipal.listaUsuario.seleccion.listacategoria.find(jTextField1.getText())=="No"){
              VentanaPrincipal.listaUsuario.seleccion.listacategoria.add(jTextField1.getText());
              //VentanaPrincipal.listaUsuario.seleccion.listacategoria.nodoseleccion=VentanaPrincipal.listaUsuario.seleccion.listacategoria.inicio;
             jComboBox2.addItem(VentanaPrincipal.listaUsuario.seleccion.listacategoria.inicio.categoria);
             JOptionPane.showMessageDialog(null, "Categoria agregada");
          }else if(VentanaPrincipal.listaUsuario.seleccion.listacategoria.find(jTextField1.getText())=="Si"){
              JOptionPane.showMessageDialog(null, "La categoria ya existe");
          }
       
        VentanaPrincipal.listaUsuario.seleccion.listacategoria.mostrarLista();
         guardarx.guardar();
        
    }//GEN-LAST:event_jButton4ActionPerformed
    public void llenar(){
        VentanaPrincipal.listaUsuario.seleccion.listacategoria.recorrer = VentanaPrincipal.listaUsuario.seleccion.listacategoria.inicio;
       if(VentanaPrincipal.listaUsuario.seleccion.listacategoria.inicio!=null){
           while(VentanaPrincipal.listaUsuario.seleccion.listacategoria.recorrer!=null){
              jComboBox2.addItem(VentanaPrincipal.listaUsuario.seleccion.listacategoria.recorrer.categoria);
              VentanaPrincipal.listaUsuario.seleccion.listacategoria.recorrer =VentanaPrincipal.listaUsuario.seleccion.listacategoria.recorrer.siguiente;
           }
       } guardarx.guardar();
    }
    
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
                 // TODO add your handling code here:
                 guardarx.guardar();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        guardarx.guardar();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(VentanaPrincipal.listaUsuario.seleccion.listacategoria.inicio==null){
            JOptionPane.showMessageDialog(null, "No tiene categorias ingresadas anteriormente");
        }else{
            llenar();
        }
        guardarx.guardar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here
         String nodoseleccionadoimg = nombreFoto.getText();
         
       if(nodoseleccionadoimg==null){
           JOptionPane.showMessageDialog(null, "NO HAY IMAGEN PARA CAMBIAR");
       }
       else if(VentanaPrincipal.listaUsuario.seleccion.listacategoria.nodoseleccion.listaimagenes.find(nodoseleccionadoimg)=="Si"){
        //Buscando]
         temporalimg=VentanaPrincipal.listaUsuario.seleccion.listacategoria.nodoseleccion.listaimagenes.selec;
         temporalimg = VentanaPrincipal.listaUsuario.seleccion.listacategoria.nodoseleccion.listaimagenes.primero;
        if(nombreFoto.getText()!=temporalimg.siguiente.nombreImagen){
            try{
                VentanaPrincipal.listaUsuario.seleccion.listacategoria.nodoseleccion.listaimagenes.selec=temporalimg.siguiente;
                File arc = new File(VentanaPrincipal.listaUsuario.seleccion.listacategoria.nodoseleccion.listaimagenes.selec.nombreImagen);
                archivo2 = arc;
              ImageIcon imagen = new ImageIcon(archivo2.toString()); 
              Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(etiquetaFoto.getWidth(), etiquetaFoto.getHeight(), Image.SCALE_DEFAULT));
              etiquetaFoto.setIcon(icono);
              nombreFoto.setText(temporalimg.siguiente.nombreImagen);
              
          }catch(Exception ex){
               JOptionPane.showMessageDialog(null, "Error al abrir");
          }
        }
        
         
       } 
        
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
           String nodoseleccionadoimg = nombreFoto.getText();
         
       if(nodoseleccionadoimg==null){
           JOptionPane.showMessageDialog(null, "NO HAY IMAGEN PARA CAMBIAR");
       }
       else if(VentanaPrincipal.listaUsuario.seleccion.listacategoria.nodoseleccion.listaimagenes.find(nodoseleccionadoimg)=="Si"){
        //Buscando]
         temporalimg=VentanaPrincipal.listaUsuario.seleccion.listacategoria.nodoseleccion.listaimagenes.selec;
         temporalimg = VentanaPrincipal.listaUsuario.seleccion.listacategoria.nodoseleccion.listaimagenes.primero;
        if(nombreFoto.getText()!=temporalimg.siguiente.nombreImagen){
            try{
                VentanaPrincipal.listaUsuario.seleccion.listacategoria.nodoseleccion.listaimagenes.selec=temporalimg.anterior;
                File arc = new File(VentanaPrincipal.listaUsuario.seleccion.listacategoria.nodoseleccion.listaimagenes.selec.nombreImagen);
                archivo2 = arc;
              ImageIcon imagen = new ImageIcon(archivo2.toString()); 
              Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(etiquetaFoto.getWidth(), etiquetaFoto.getHeight(), Image.SCALE_DEFAULT));
              etiquetaFoto.setIcon(icono);
              nombreFoto.setText(temporalimg.anterior.nombreImagen);
              
          }catch(Exception ex){
               JOptionPane.showMessageDialog(null, "Error al abrir");
          }
        }
        
         
       } 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void nombreFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFotoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(nombreFoto.getText()==null){
            JOptionPane.showMessageDialog(null, "Seleccione una imagen para borrar");
        }else if(nombreFoto.getText()!=null){
        nombreFoto.setText("");
        etiquetaFoto.setIcon(null);
     JOptionPane.showMessageDialog(null, "Imagen eliminada");}
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(VentanaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaBiblioteca().setVisible(true);
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(VentanaBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaFoto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    public static javax.swing.JComboBox<Object> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nombreFoto;
    // End of variables declaration//GEN-END:variables
}
