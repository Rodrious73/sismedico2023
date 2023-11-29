package gui;

import dao.ProductoDAO;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarProductoGUI extends javax.swing.JInternalFrame {

    ProductoDAO objEmpleadoDAO = new ProductoDAO();
    ResultSet rsProducto;
    DefaultTableModel objDtm;

    public BuscarProductoGUI() {
        initComponents();
        objDtm = (DefaultTableModel) jtblRegistros.getModel();
        this.setVisible(true);
        this.setLocation(670, 130);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxtBuscarProd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRegistros = new javax.swing.JTable();
        jbtnSalir = new javax.swing.JButton();

        jLabel1.setText("Ingrese el nombre del producto a buscar");

        jtxtBuscarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarProdKeyReleased(evt);
            }
        });

        jtblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/salida.png"))); // NOI18N
        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtxtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jbtnSalir)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnSalir)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblRegistrosMouseClicked
        try {
            int op = JOptionPane.showConfirmDialog(rootPane, "¿Quieres traer los datos del producto " + jtblRegistros.getValueAt(jtblRegistros.getSelectedRow(), 1).toString() + " ?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (op == JOptionPane.YES_OPTION) {
                FacturaGUI.jtxtCodProd.setText(jtblRegistros.getValueAt(jtblRegistros.getSelectedRow(), 0).toString());
                FacturaGUI.jtxtNombProducto.setText(jtblRegistros.getValueAt(jtblRegistros.getSelectedRow(), 1).toString());
                FacturaGUI.jtxtPrecioProd.setText(jtblRegistros.getValueAt(jtblRegistros.getSelectedRow(), 2).toString());
                dispose();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtblRegistrosMouseClicked

    private void jtxtBuscarProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarProdKeyReleased
        try {
            limpiarJTable();
            if (!jtxtBuscarProd.getText().isEmpty()) {
                rsProducto = objEmpleadoDAO.buscar(jtxtBuscarProd.getText().trim());
                while (rsProducto.next()) {
                    Object[] registro = {rsProducto.getInt(1), rsProducto.getString(2), rsProducto.getString(3), rsProducto.getString(4)};
                    objDtm.addRow(registro);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtxtBuscarProdKeyReleased

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JTable jtblRegistros;
    private javax.swing.JTextField jtxtBuscarProd;
    // End of variables declaration//GEN-END:variables

    private void limpiarJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }
}
