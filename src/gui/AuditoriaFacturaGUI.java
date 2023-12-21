package gui;

import com.mysql.jdbc.Connection;
import conexion.ConMySql;
import dao.HfacturaDAO;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class AuditoriaFacturaGUI extends javax.swing.JInternalFrame {

    HfacturaDAO objHfacturaDAO = new HfacturaDAO();
    ResultSet rsFactura;
    DefaultTableModel objDtm;
    SimpleDateFormat objDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public AuditoriaFacturaGUI() {
        initComponents();
        objDtm = (DefaultTableModel) jtblRegistrosAuditoria.getModel();
        setVisible(true);
    }

    public void limpiarJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRegistrosAuditoria = new javax.swing.JTable();
        jbtnImprimir = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jdtcFechaInicio = new com.toedter.calendar.JDateChooser();
        jdtcFechaFin = new com.toedter.calendar.JDateChooser();

        jLabel1.setText("Fecha Inicio:");

        jLabel2.setText("Fecha Fin:");

        jbtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lupa-de-busqueda.png"))); // NOI18N
        jbtnBuscar.setText("Buscar");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        jtblRegistrosAuditoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FACTURA", "FECHA", "CLIENTE", "NOMB_EMPL", "APAT_EMPL", "AMAT_EMPL", "TOTAL", "TRANSAC", "USUARIO", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblRegistrosAuditoria);

        jbtnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/imprimir.png"))); // NOI18N
        jbtnImprimir.setText("Imprimir");
        jbtnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnImprimirActionPerformed(evt);
            }
        });

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
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdtcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jdtcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnBuscar)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jbtnImprimir)
                .addGap(47, 47, 47)
                .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(395, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jbtnBuscar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdtcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdtcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnImprimir)
                    .addComponent(jbtnSalir))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        try {
            limpiarJTable();
            String fechaInicio = objDateFormat.format(jdtcFechaInicio.getDate());
            String fechaFin = objDateFormat.format(jdtcFechaFin.getDate());
            rsFactura = objHfacturaDAO.buscarPorFecha(fechaInicio, fechaFin);
            while (rsFactura.next()) {
                Object[] registro = {rsFactura.getString(1), rsFactura.getString(2), rsFactura.getString(3),
                    rsFactura.getString(4), rsFactura.getString(5), rsFactura.getString(6), rsFactura.getDouble(7),
                    rsFactura.getString(8), rsFactura.getString(9), rsFactura.getString(10)
                };
                objDtm.addRow(registro);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, closable);
        }
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        int op = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de salir?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnImprimirActionPerformed
        try {
            //error Error net.sf.jasperreports.engine.fill.JRExpressionEvalException: Error evaluating expression for source text:
            String fechaInicio = objDateFormat.format(jdtcFechaInicio.getDate());
            String fechaFin = objDateFormat.format(jdtcFechaFin.getDate());
            Connection cn = (Connection) ConMySql.getInstance().getConnection();
            String direccion = "src\\reportes\\repAuditoria.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(direccion);
            Map parametros = new HashMap();
            parametros.put("fechaInicio", fechaInicio);
            parametros.put("fechaFinal", fechaFin);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parametros, cn);
            JasperViewer view = new JasperViewer(mostrarReporte, false);
            view.setTitle("Reporte Auditoria Factura");
            view.setExtendedState(MAXIMIZED_BOTH);
            view.setVisible(true);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }//GEN-LAST:event_jbtnImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnImprimir;
    private javax.swing.JButton jbtnSalir;
    private com.toedter.calendar.JDateChooser jdtcFechaFin;
    private com.toedter.calendar.JDateChooser jdtcFechaInicio;
    private javax.swing.JTable jtblRegistrosAuditoria;
    // End of variables declaration//GEN-END:variables
}
