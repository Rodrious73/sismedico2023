package gui;

import com.mysql.jdbc.Blob;
import dao.DistritoDAO;
import dao.EmpleadoDAO;
import dto.EmpleadoTO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class EmpleadoGUI extends javax.swing.JInternalFrame {

    EmpleadoDAO objEmpleadoDAO = new EmpleadoDAO();
    ResultSet rsEmpleado;
    int xidempleado;
    DefaultTableModel objDtm;
    boolean sw;
    ButtonGroup objButtonGroup = new ButtonGroup();
    DistritoDAO objDistritoDAO = new DistritoDAO();
    ResultSet rsDistrito;
    int xiddistrito;
    String ruta;

    public EmpleadoGUI() {
        initComponents();
        setSize(726, 670);
        setVisible(true);
        objDtm = (DefaultTableModel) jtblRegistros.getModel();
        objButtonGroup.add(jrbtFemenino);
        objButtonGroup.add(jrbtMasculino);
        jtxtRutaFota.setVisible(false);
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
        jtxtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtPaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtMaterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jrbtMasculino = new javax.swing.JRadioButton();
        jrbtFemenino = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jtxtDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcmbDistrito = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jtxtFijo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxtObservacion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtCelular = new javax.swing.JTextField();
        jlblFoto = new javax.swing.JLabel();
        jtbnSeleccionar = new javax.swing.JButton();
        jtxtRutaFota = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbtnCancelar = new javax.swing.JButton();
        jbtnNuevo = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jbtnGrabar = new javax.swing.JButton();
        jbtnBorrar = new javax.swing.JButton();

        setTitle("Mantenimiento de Empleados");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingrese apellido paterno a buscar :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 16, -1, -1));

        jtxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 11, 230, -1));

        jtblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "AP PATERNO", "AP MATERNO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 43, 666, 130));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("CODIGO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 15, -1, -1));

        jtxtCodigo.setEditable(false);
        jPanel1.add(jtxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 10, 130, -1));

        jLabel3.setText("NOMBRE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 47, -1, -1));

        jtxtNombre.setEditable(false);
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 42, 260, -1));

        jLabel4.setText("AP PATERNO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 79, -1, -1));

        jtxtPaterno.setEditable(false);
        jPanel1.add(jtxtPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 74, 260, -1));

        jLabel5.setText("AP MATERNO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 111, -1, -1));

        jtxtMaterno.setEditable(false);
        jPanel1.add(jtxtMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 106, 260, -1));

        jLabel6.setText("SEXO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 146, -1, -1));

        jrbtMasculino.setText("MASCULINO");
        jrbtMasculino.setEnabled(false);
        jPanel1.add(jrbtMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 144, -1, -1));

        jrbtFemenino.setText("FEMENINO");
        jrbtFemenino.setEnabled(false);
        jPanel1.add(jrbtFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 144, -1, -1));

        jLabel7.setText("DIRECCIÓN");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 176, -1, -1));

        jtxtDireccion.setEditable(false);
        jPanel1.add(jtxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 171, 260, -1));

        jLabel8.setText("DISTRITO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 208, -1, -1));

        jcmbDistrito.setEnabled(false);
        jPanel1.add(jcmbDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 203, 260, -1));

        jLabel9.setText("TEL FIJO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 240, -1, -1));

        jtxtFijo.setEditable(false);
        jPanel1.add(jtxtFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 235, 150, -1));

        jLabel10.setText("EMAIL");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 272, -1, -1));

        jtxtEmail.setEditable(false);
        jPanel1.add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 267, 150, -1));

        jLabel11.setText("OBSERVACIÓN");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 304, -1, -1));

        jtxtObservacion.setEditable(false);
        jPanel1.add(jtxtObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 299, 547, -1));

        jLabel12.setText("CELULAR");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jtxtCelular.setEditable(false);
        jPanel1.add(jtxtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 150, -1));

        jlblFoto.setText("FOTO");
        jlblFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel1.add(jlblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 220, 210));

        jtbnSeleccionar.setText("Seleccionar");
        jtbnSeleccionar.setEnabled(false);
        jtbnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(jtbnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        jtxtRutaFota.setEditable(false);
        jPanel1.add(jtxtRutaFota, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 30, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 666, 343));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancelar.png"))); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.setEnabled(false);
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nuevo-documento.png"))); // NOI18N
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/editar-codigo.png"))); // NOI18N
        jbtnEditar.setText("Editar");
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/salida.png"))); // NOI18N
        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jbtnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/disquete.png"))); // NOI18N
        jbtnGrabar.setText("Grabar");
        jbtnGrabar.setEnabled(false);
        jbtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarActionPerformed(evt);
            }
        });

        jbtnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/borrar.png"))); // NOI18N
        jbtnBorrar.setText("Borrar");
        jbtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 666, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        int op = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de salir?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        habilitarControles(true);
        limpiarControles();
        sw = true;
        llenaCombo();
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        habilitarControles(false);
        limpiarControles();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jtxtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyReleased
        try {
            limpiarJTable();
            if (!jtxtBuscar.getText().isEmpty()) {
                rsEmpleado = objEmpleadoDAO.buscar(jtxtBuscar.getText().trim());
                while (rsEmpleado.next()) {
                    Object registro[] = {rsEmpleado.getInt(1), rsEmpleado.getString(2), rsEmpleado.getString(3), rsEmpleado.getString(4)};
                    objDtm.addRow(registro);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jtxtBuscarKeyReleased

    private void jtblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblRegistrosMouseClicked
        try {
            xidempleado = Integer.parseInt(jtblRegistros.getValueAt(jtblRegistros.getSelectedRow(), 0).toString());
            rsEmpleado.first();
            do {
                if (xidempleado == rsEmpleado.getInt(1)) {
                    jtxtCodigo.setText(String.valueOf(rsEmpleado.getInt(1)));
                    jtxtNombre.setText(rsEmpleado.getString(2));
                    jtxtPaterno.setText(rsEmpleado.getString(3));
                    jtxtMaterno.setText(rsEmpleado.getString(4));
                    if (rsEmpleado.getString(5).equals("M")) {
                        jrbtMasculino.setSelected(true);
                    }
                    if (rsEmpleado.getString(5).equals("F")) {
                        jrbtFemenino.setSelected(true);
                    }
                    jtxtDireccion.setText(rsEmpleado.getString(6));
                    jcmbDistrito.removeAllItems();
                    jcmbDistrito.addItem(rsEmpleado.getString(7));
                    jtxtFijo.setText(rsEmpleado.getString(8));
                    jtxtCelular.setText(rsEmpleado.getString(9));
                    jtxtEmail.setText(rsEmpleado.getString(10));
                    jtxtObservacion.setText(rsEmpleado.getString(11));
                    Blob fotoBlob = (Blob) rsEmpleado.getBlob(12);
                    byte[] data = fotoBlob.getBytes(1, (int) fotoBlob.length());
                    BufferedImage foto = ImageIO.read(new ByteArrayInputStream(data));
                    ImageIcon imagen = new ImageIcon(foto);
                    Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(jlblFoto.getWidth(), jlblFoto.getHeight(), Image.SCALE_DEFAULT));
                    jlblFoto.setIcon(icon);
                    this.repaint();
                    rsEmpleado.last();
                }
            } while (rsEmpleado.next());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtblRegistrosMouseClicked

    private void jbtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarActionPerformed
        try {
            String rutaAlterna = "";
            String mensaje;
            EmpleadoTO objEmpleadoTO = new EmpleadoTO();
            objEmpleadoTO.setNombempl(jtxtNombre.getText().toUpperCase());
            objEmpleadoTO.setApatempl(jtxtPaterno.getText().toUpperCase());
            objEmpleadoTO.setAmatempl(jtxtMaterno.getText().toUpperCase());
            if (jrbtMasculino.isSelected()) {
                objEmpleadoTO.setSexoempl("M");
                rutaAlterna = "src\\fotos\\masculino.jpg";
            }
            if (jrbtFemenino.isSelected()) {
                objEmpleadoTO.setSexoempl("F");
                rutaAlterna = "src\\fotos\\femenino.jpg";
            }
            objEmpleadoTO.setDireempl(jtxtDireccion.getText().toUpperCase());
            obtenerIddistrito();
            objEmpleadoTO.setIddistrito(xiddistrito);
            objEmpleadoTO.setTelfempl(jtxtFijo.getText().toUpperCase());
            objEmpleadoTO.setCeluempl(jtxtCelular.getText().toUpperCase());
            objEmpleadoTO.setEmaiempl(jtxtEmail.getText().toUpperCase());
            objEmpleadoTO.setObsvempl(jtxtObservacion.getText().toUpperCase());
            objEmpleadoTO.setFotoempl(jtxtRutaFota.getText());
            if (jtxtRutaFota.getText().isEmpty()) {
                objEmpleadoTO.setFotoempl(rutaAlterna);
            }
            if (sw) {
                objEmpleadoDAO.insert(objEmpleadoTO);
                mensaje = "Registro Grabado";
            } else {
                objEmpleadoTO.setIdempleado(xidempleado);
                objEmpleadoDAO.update(objEmpleadoTO);
                mensaje = "Registro Actualizado";
            }
            habilitarControles(false);
            limpiarControles();
            JOptionPane.showMessageDialog(rootPane, mensaje);
            jtxtBuscar.grabFocus();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }//GEN-LAST:event_jbtnGrabarActionPerformed

    private void jbtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarActionPerformed
        if (!jtxtCodigo.getText().isEmpty()) {
            try {
                int op = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de eliminar al empleado?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (op == JOptionPane.YES_OPTION) {
                    EmpleadoTO objEmpleadoTO = new EmpleadoTO();
                    objEmpleadoTO.setIdempleado(xidempleado);
                    objEmpleadoDAO.delete(objEmpleadoTO);
                    limpiarControles();
                    JOptionPane.showMessageDialog(rootPane, "Empleado Eliminado.");
                }
            } catch (Exception e) {
                System.out.println("Error" + e);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un empleado.");
            jtxtBuscar.grabFocus();
        }
    }//GEN-LAST:event_jbtnBorrarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        if (!jtxtCodigo.getText().isEmpty()) {
            habilitarControles(true);
            sw = false;
            llenaCombo();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un empleado.");
            jtxtBuscar.grabFocus();
        }

    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jtbnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnSeleccionarActionPerformed
        JFileChooser objJFileChooser = new JFileChooser();
        int op = objJFileChooser.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            ruta = objJFileChooser.getSelectedFile().getAbsolutePath();
            jlblFoto.setIcon(new ImageIcon(ruta));
            jtxtRutaFota.setText(ruta);
        }
    }//GEN-LAST:event_jtbnSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBorrar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnGrabar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JComboBox<String> jcmbDistrito;
    private javax.swing.JLabel jlblFoto;
    private javax.swing.JRadioButton jrbtFemenino;
    private javax.swing.JRadioButton jrbtMasculino;
    private javax.swing.JTable jtblRegistros;
    private javax.swing.JButton jtbnSeleccionar;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextField jtxtCelular;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtDireccion;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtFijo;
    private javax.swing.JTextField jtxtMaterno;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtObservacion;
    private javax.swing.JTextField jtxtPaterno;
    private javax.swing.JTextField jtxtRutaFota;
    // End of variables declaration//GEN-END:variables

    private void habilitarControles(boolean b) {
        jbtnGrabar.setEnabled(b);
        jbtnCancelar.setEnabled(b);
        jbtnNuevo.setEnabled(!b);
        jbtnEditar.setEnabled(!b);
        jbtnBorrar.setEnabled(!b);
        jbtnSalir.setEnabled(!b);
        jtxtBuscar.setEditable(!b);
        jrbtFemenino.setEnabled(b);
        jrbtMasculino.setEnabled(b);
        jcmbDistrito.setEnabled(b);
        jtbnSeleccionar.setEnabled(b);
        JTextField[] objJTextFields = {jtxtCelular, jtxtDireccion, jtxtEmail, jtxtFijo, jtxtMaterno, jtxtPaterno, jtxtNombre, jtxtObservacion};
        for (JTextField objJTextField : objJTextFields) {
            objJTextField.setEditable(b);
        }
        jtxtNombre.grabFocus();
    }

    private void limpiarControles() {
        limpiarJTable();
        jcmbDistrito.removeAllItems();
        JTextField[] objJTextFields = {jtxtBuscar, jtxtCodigo, jtxtCelular, jtxtDireccion, jtxtEmail, jtxtFijo, jtxtMaterno, jtxtPaterno, jtxtNombre, jtxtObservacion, jtxtRutaFota};
        for (JTextField objJTextField : objJTextFields) {
            objJTextField.setText(null);
        }
        jlblFoto.setIcon(null);
        objButtonGroup.clearSelection();
    }

    private void limpiarJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }

    private void llenaCombo() {
        try {
            rsDistrito = objDistritoDAO.buscar("%");
            if (sw) {
                while (rsDistrito.next()) {
                    jcmbDistrito.addItem(rsDistrito.getString(2));
                }
            } else {
                String nombre = jcmbDistrito.getSelectedItem().toString();
                while (rsDistrito.next()) {
                    if (!nombre.equals(rsDistrito.getString(2))) {
                        jcmbDistrito.addItem(rsDistrito.getString(2));
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    private void obtenerIddistrito() {
        try {
            String nombre = jcmbDistrito.getSelectedItem().toString();
            rsDistrito.first();

            do {
                if (nombre.equals(rsDistrito.getString(2))) {
                    xiddistrito = rsDistrito.getInt(1);
                    break;
                }
            } while (rsDistrito.next());
        } catch (Exception e) {
            // Manejar excepciones
        }
    }
}
