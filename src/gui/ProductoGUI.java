package gui;

import com.mysql.jdbc.Blob;
import dao.ProductoDAO;
import dto.ProductoTO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductoGUI extends javax.swing.JInternalFrame {

    DefaultTableModel objDtm;
    ResultSet rsProducto;
    ProductoDAO objProductoDAO = new ProductoDAO();
    int xidproducto;
    boolean sw = false;
    String ruta;

    public ProductoGUI() {
        initComponents();
        setSize(530, 562);
        objDtm = (DefaultTableModel) jtblRegistros.getModel();
        setVisible(true);
        jtxtRutaFoto.setVisible(false);
    }

    private void limpiarJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRegistros = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtObservacion = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jlblFoto = new javax.swing.JLabel();
        jbtnSeleccionarFoto = new javax.swing.JButton();
        jtxtRutaFoto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbtnEditar = new javax.swing.JButton();
        jbtnNuevo = new javax.swing.JButton();
        jbtnGrabar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jbtnBorrar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();

        setTitle("Mantenimiento de Producto");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingrese nombre del producto:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jtxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 238, -1));

        jtblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblRegistros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 52, 450, 120));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("CODIGO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jtxtCodigo.setEditable(false);
        jPanel1.add(jtxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 207, -1));

        jLabel3.setText("PRECIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jtxtPrecio.setEditable(false);
        jPanel1.add(jtxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 207, -1));

        jLabel5.setText("OBSERVACIÓN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jtxtObservacion.setEditable(false);
        jPanel1.add(jtxtObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 207, -1));

        jtxtNombre.setEditable(false);
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 207, -1));

        jLabel4.setText("NOMBRE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jlblFoto.setText("FOTO");
        jlblFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel1.add(jlblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 130, 170));

        jbtnSeleccionarFoto.setText("Seleccionar Foto");
        jbtnSeleccionarFoto.setEnabled(false);
        jbtnSeleccionarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSeleccionarFotoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSeleccionarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 200, -1));

        jtxtRutaFoto.setEditable(false);
        jPanel1.add(jtxtRutaFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 10, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 178, 450, 190));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/editar-codigo.png"))); // NOI18N
        jbtnEditar.setText("Editar");
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 20, 110, 42));

        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nuevo-documento.png"))); // NOI18N
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 20, 110, 42));

        jbtnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/disquete.png"))); // NOI18N
        jbtnGrabar.setText("Grabar");
        jbtnGrabar.setEnabled(false);
        jbtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 20, 110, 42));

        jbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancelar.png"))); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.setEnabled(false);
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 80, 110, 42));

        jbtnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/borrar.png"))); // NOI18N
        jbtnBorrar.setText("Borrar");
        jbtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 80, 110, 42));

        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/salida.png"))); // NOI18N
        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 80, 110, 42));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 450, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        habilitarControles(true);
        limpiarControles();
        sw = true;
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        habilitarControles(false);
        limpiarControles();
     }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        int op = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de salir?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jtxtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyReleased
        try {
            limpiarJTable();
            if (!jtxtBuscar.getText().isEmpty()) {
                rsProducto = objProductoDAO.buscar(jtxtBuscar.getText());
                while (rsProducto.next()) {
                    Object registro[] = {rsProducto.getInt(1), rsProducto.getString(2)};
                    objDtm.addRow(registro);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtxtBuscarKeyReleased

    private void jtblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblRegistrosMouseClicked
        try {
            xidproducto = Integer.parseInt(jtblRegistros.getValueAt(jtblRegistros.getSelectedRow(), 0).toString());
            rsProducto.first();
            do {
                if (xidproducto == rsProducto.getInt(1)) {
                    jtxtCodigo.setText(String.valueOf(rsProducto.getInt(1)));
                    jtxtNombre.setText(rsProducto.getString(2));
                    jtxtPrecio.setText(String.format("%.2f", rsProducto.getDouble(3)));
                    jtxtObservacion.setText(rsProducto.getString(4));
                    Blob fotoBlob = (Blob) rsProducto.getBlob(5);
                    if (fotoBlob.length() == 0) {
                        jlblFoto.setIcon(null);
                        jlblFoto.setText("No tiene foto");
                    } else {
                        byte[] data = fotoBlob.getBytes(1, (int) fotoBlob.length());
                        BufferedImage foto = ImageIO.read(new ByteArrayInputStream(data));
                        ImageIcon imagen = new ImageIcon(foto);
                        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(jlblFoto.getWidth(), jlblFoto.getHeight(), Image.SCALE_DEFAULT));
                        jlblFoto.setIcon(icon);
                    }
                    this.repaint();
                    rsProducto.last();
                }
            } while (rsProducto.next());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtblRegistrosMouseClicked

    private void jbtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarActionPerformed
        try {
            String mensaje = "";
            String rutaAlterna = "src\\fotos\\producto.png";
            ProductoTO objProductoTO = new ProductoTO();
            objProductoTO.setNombprod(jtxtNombre.getText());
            objProductoTO.setPrecprod(Double.parseDouble(jtxtPrecio.getText()));
            objProductoTO.setObsvprod(jtxtObservacion.getText());
            if (!jtxtRutaFoto.getText().isEmpty()) {
                objProductoTO.setFotoprod(jtxtRutaFoto.getText());
            } else {
                objProductoTO.setFotoprod(rutaAlterna);
            }
            if (sw) {
                objProductoDAO.insert(objProductoTO);
                mensaje = "Registro Grabado";
            } else {
                objProductoTO.setIdproducto(xidproducto);
                objProductoDAO.update(objProductoTO);
                mensaje = "Registro Actualizado";
            }
            habilitarControles(false);
            JOptionPane.showMessageDialog(rootPane, mensaje);
            limpiarControles();
            jtxtBuscar.grabFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jbtnGrabarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        if (!jtxtCodigo.getText().isEmpty()) {
            habilitarControles(true);
            sw = false;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Busque un distrito para editar.");
        }
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarActionPerformed
        if (!jtxtCodigo.getText().isEmpty()) {
            try {
                int op = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de eliminar el producto?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (op == JOptionPane.YES_OPTION) {
                    ProductoTO objProductoTO = new ProductoTO();
                    objProductoTO.setIdproducto(xidproducto);
                    objProductoDAO.delete(objProductoTO);
                    limpiarControles();
                    JOptionPane.showMessageDialog(rootPane, "Producto Eliminado.");
                }
            } catch (Exception e) {
                System.out.println("Error" + e);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un producto.");
        }
    }//GEN-LAST:event_jbtnBorrarActionPerformed

    private void jbtnSeleccionarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSeleccionarFotoActionPerformed
        JFileChooser objJFileChooser = new JFileChooser();
        int op = objJFileChooser.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            ruta = objJFileChooser.getSelectedFile().getAbsolutePath();
            //jlblFoto.setIcon(new ImageIcon(ruta));
            ImageIcon imagen = new ImageIcon(ruta);
            Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(jlblFoto.getWidth(), jlblFoto.getHeight(), Image.SCALE_DEFAULT));
            jlblFoto.setIcon(icon);
            jtxtRutaFoto.setText(ruta);
        }
    }//GEN-LAST:event_jbtnSeleccionarFotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBorrar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnGrabar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JButton jbtnSeleccionarFoto;
    private javax.swing.JLabel jlblFoto;
    private javax.swing.JTable jtblRegistros;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtObservacion;
    private javax.swing.JTextField jtxtPrecio;
    private javax.swing.JTextField jtxtRutaFoto;
    // End of variables declaration//GEN-END:variables

    private void habilitarControles(boolean b) {
        jtxtNombre.setEditable(b);
        jtxtPrecio.setEditable(b);
        jtxtObservacion.setEditable(b);
        jtxtBuscar.setEditable(!b);
        jbtnGrabar.setEnabled(b);
        jbtnCancelar.setEnabled(b);
        jbtnNuevo.setEnabled(!b);
        jbtnBorrar.setEnabled(!b);
        jbtnEditar.setEnabled(!b);
        jbtnSalir.setEnabled(!b);
        jbtnSeleccionarFoto.setEnabled(b);
        jtxtNombre.grabFocus();
    }

    private void limpiarControles() {
        jtxtBuscar.setText(null);
        jtxtCodigo.setText(null);
        jtxtPrecio.setText(null);
        jtxtNombre.setText(null);
        jtxtObservacion.setText(null);
        jtxtRutaFoto.setText(null);
        jlblFoto.setIcon(null);
        limpiarJTable();
    }

}
