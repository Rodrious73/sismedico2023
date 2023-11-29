package gui;

import dao.DistritoDAO;
import dto.DistritoTO;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DistritoGUI extends javax.swing.JInternalFrame {

    DefaultTableModel objDtm;
    ResultSet rsDistrito;
    DistritoDAO objDistritoDAO = new DistritoDAO();
    int xiddistrito;
    boolean sw = false;

    public DistritoGUI() {
        initComponents();
        setSize(530, 562);
        objDtm = (DefaultTableModel) jtblRegistros.getModel();
        setVisible(true);
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
        jtxtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtObservacion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbtnEditar = new javax.swing.JButton();
        jbtnNuevo = new javax.swing.JButton();
        jbtnGrabar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jbtnBorrar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();

        setTitle("Mantenimiento de Distrito");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingrese nombre del distrito:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jtxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 238, -1));

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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jtxtCodigo.setEditable(false);
        jPanel1.add(jtxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 207, -1));

        jLabel3.setText("NOMBRE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jtxtNombre.setEditable(false);
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 207, -1));

        jLabel5.setText("OBSERVACIÓN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jtxtObservacion.setEditable(false);
        jPanel1.add(jtxtObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 207, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 178, 450, 140));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 450, 150));

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
                rsDistrito = objDistritoDAO.buscar(jtxtBuscar.getText());
                while (rsDistrito.next()) {
                    Object registro[] = {rsDistrito.getInt(1), rsDistrito.getString(2)};
                    objDtm.addRow(registro);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtxtBuscarKeyReleased

    private void jtblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblRegistrosMouseClicked
        try {
            xiddistrito = Integer.parseInt(jtblRegistros.getValueAt(jtblRegistros.getSelectedRow(), 0).toString());
            rsDistrito.first();
            do {
                if (xiddistrito == rsDistrito.getInt(1)) {
                    jtxtCodigo.setText(String.valueOf(rsDistrito.getInt(1)));
                    jtxtNombre.setText(rsDistrito.getString(2));
                    jtxtObservacion.setText(rsDistrito.getString(3));
                    rsDistrito.last();
                }
            } while (rsDistrito.next());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtblRegistrosMouseClicked

    private void jbtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarActionPerformed
        try {
            String mensaje = "";
            DistritoTO objDistritoTO = new DistritoTO();
            objDistritoTO.setNombdist(jtxtNombre.getText());
            objDistritoTO.setObsvdist(jtxtObservacion.getText());
            if (sw) {
                objDistritoDAO.insert(objDistritoTO);
                mensaje = "Registro Grabado";
            } else {
                objDistritoTO.setIddistrito(xiddistrito);
                objDistritoDAO.update(objDistritoTO);
                mensaje = "Registro Actualizado";
            }
            habilitarControles(false);
            JOptionPane.showMessageDialog(rootPane, mensaje);
            limpiarControles();
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
                int op = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de eliminar el distrito?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (op == JOptionPane.YES_OPTION) {
                    DistritoTO objDistritoTO = new DistritoTO();
                    objDistritoTO.setIddistrito(xiddistrito);
                    objDistritoDAO.delete(objDistritoTO);
                    limpiarControles();
                    JOptionPane.showMessageDialog(rootPane, "Distrito Eliminado.");
                }
            } catch (Exception e) {
                System.out.println("Error" + e);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un distrito.");
        }
    }//GEN-LAST:event_jbtnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JTable jtblRegistros;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtObservacion;
    // End of variables declaration//GEN-END:variables

    private void habilitarControles(boolean b) {
        jtxtNombre.setEditable(b);
        jtxtObservacion.setEditable(b);
        jtxtBuscar.setEditable(!b);
        jbtnGrabar.setEnabled(b);
        jbtnCancelar.setEnabled(b);
        jbtnNuevo.setEnabled(!b);
        jbtnBorrar.setEnabled(!b);
        jbtnEditar.setEnabled(!b);
        jbtnSalir.setEnabled(!b);
        jtxtNombre.grabFocus();
    }

    private void limpiarControles() {
        jtxtBuscar.setText(null);
        jtxtCodigo.setText(null);
        jtxtNombre.setText(null);
        jtxtObservacion.setText(null);
        limpiarJTable();
    }

}
