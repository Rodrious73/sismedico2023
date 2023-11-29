package gui;

import dao.ClienteDAO;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarClienteGUI extends javax.swing.JInternalFrame {

    ClienteDAO objClienteDAO = new ClienteDAO();
    ResultSet rsCliente;
    DefaultTableModel objDtm;

    public BuscarClienteGUI() {
        initComponents();
        objDtm = (DefaultTableModel) jtblRegistros.getModel();
        this.setVisible(true);
        this.setLocation(670, 130);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxtBuscarClie = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRegistros = new javax.swing.JTable();
        jbtnSalir = new javax.swing.JButton();

        jLabel1.setText("Ingrese el nombre del cliente a buscar");

        jtxtBuscarClie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarClieKeyReleased(evt);
            }
        });

        jtblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "RUC", "NOMBRE", "DIRECCIÓN"
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtBuscarClie, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jbtnSalir)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtBuscarClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnSalir)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtBuscarClieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarClieKeyReleased
        try {
            limpiarJTable();
            if (!jtxtBuscarClie.getText().isEmpty()) {
                rsCliente = objClienteDAO.buscar(jtxtBuscarClie.getText().trim());
                while (rsCliente.next()) {
                    Object[] registro = {rsCliente.getInt(1), rsCliente.getString(2), rsCliente.getString(3), rsCliente.getString(4)};
                    objDtm.addRow(registro);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtxtBuscarClieKeyReleased

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jtblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblRegistrosMouseClicked
        try {
            int op = JOptionPane.showConfirmDialog(rootPane, "¿Quieres traer los datos del empleado " + jtblRegistros.getValueAt(jtblRegistros.getSelectedRow(), 2).toString() + " ?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (op == JOptionPane.YES_OPTION) {
                FacturaGUI.jtxtIdCliente.setText(jtblRegistros.getValueAt(jtblRegistros.getSelectedRow(), 0).toString());
                FacturaGUI.jtxtRucCliente.setText(jtblRegistros.getValueAt(jtblRegistros.getSelectedRow(), 1).toString());
                FacturaGUI.jtxtNombClie.setText(jtblRegistros.getValueAt(jtblRegistros.getSelectedRow(), 2).toString());
                FacturaGUI.jtxtDireccionCliente.setText(jtblRegistros.getValueAt(jtblRegistros.getSelectedRow(), 3).toString());
                dispose();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtblRegistrosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JTable jtblRegistros;
    private javax.swing.JTextField jtxtBuscarClie;
    // End of variables declaration//GEN-END:variables

    private void limpiarJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }
}
