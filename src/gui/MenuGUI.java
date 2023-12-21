package gui;

import dao.ReporteDAO;

public class MenuGUI extends javax.swing.JFrame {

    public MenuGUI() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mnuMante = new javax.swing.JMenu();
        manCliente = new javax.swing.JMenuItem();
        manDistrito = new javax.swing.JMenuItem();
        manEmpleado = new javax.swing.JMenuItem();
        manProducto = new javax.swing.JMenuItem();
        manSalir = new javax.swing.JMenuItem();
        mnuFacturacion = new javax.swing.JMenu();
        facGenerar = new javax.swing.JMenuItem();
        mnuReportes = new javax.swing.JMenu();
        repCliente = new javax.swing.JMenuItem();
        repDistrito = new javax.swing.JMenuItem();
        repFactura = new javax.swing.JMenuItem();
        repProducto = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuSeguridad = new javax.swing.JMenu();
        segBackup = new javax.swing.JMenuItem();
        segRestore = new javax.swing.JMenuItem();
        segAuditoria = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        ayuCerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ventas 2023");

        mnuMante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mantenimiento.png"))); // NOI18N
        mnuMante.setMnemonic('f');
        mnuMante.setText("Mantenimiento");

        manCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clasificacion.png"))); // NOI18N
        manCliente.setMnemonic('o');
        manCliente.setText("Cliente");
        mnuMante.add(manCliente);

        manDistrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/distrito-electoral.png"))); // NOI18N
        manDistrito.setMnemonic('s');
        manDistrito.setText("Distrito");
        manDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manDistritoActionPerformed(evt);
            }
        });
        mnuMante.add(manDistrito);

        manEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/empleados.png"))); // NOI18N
        manEmpleado.setText("Empleado");
        manEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manEmpleadoActionPerformed(evt);
            }
        });
        mnuMante.add(manEmpleado);

        manProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/paquete.png"))); // NOI18N
        manProducto.setMnemonic('a');
        manProducto.setText("Producto");
        manProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manProductoActionPerformed(evt);
            }
        });
        mnuMante.add(manProducto);

        manSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cerrar-sesion.png"))); // NOI18N
        manSalir.setMnemonic('x');
        manSalir.setText("Salir");
        manSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manSalirActionPerformed(evt);
            }
        });
        mnuMante.add(manSalir);

        menuBar.add(mnuMante);

        mnuFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/factura (1).png"))); // NOI18N
        mnuFacturacion.setMnemonic('e');
        mnuFacturacion.setText("Facturación");

        facGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/factura.png"))); // NOI18N
        facGenerar.setMnemonic('d');
        facGenerar.setText("Generar Factura");
        facGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facGenerarActionPerformed(evt);
            }
        });
        mnuFacturacion.add(facGenerar);

        menuBar.add(mnuFacturacion);

        mnuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reporte-de-negocios.png"))); // NOI18N
        mnuReportes.setText("Reportes");

        repCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reporte.png"))); // NOI18N
        repCliente.setText("Cliente");
        mnuReportes.add(repCliente);

        repDistrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/evaluacion.png"))); // NOI18N
        repDistrito.setText("Distrito");
        repDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repDistritoActionPerformed(evt);
            }
        });
        mnuReportes.add(repDistrito);

        repFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dinero.png"))); // NOI18N
        repFactura.setText("Factura");
        mnuReportes.add(repFactura);

        repProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/caja.png"))); // NOI18N
        repProducto.setText("Producto");
        repProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repProductoActionPerformed(evt);
            }
        });
        mnuReportes.add(repProducto);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/empleado.png"))); // NOI18N
        jMenuItem1.setText("Empleado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuReportes.add(jMenuItem1);

        menuBar.add(mnuReportes);

        mnuSeguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/proteger.png"))); // NOI18N
        mnuSeguridad.setText("Seguridad");

        segBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/archivo-de-respaldo.png"))); // NOI18N
        segBackup.setText("Backup");
        mnuSeguridad.add(segBackup);

        segRestore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/restaurar.png"))); // NOI18N
        segRestore.setText("Restore");
        mnuSeguridad.add(segRestore);

        segAuditoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/auditoria.png"))); // NOI18N
        segAuditoria.setText("Auditoria");
        segAuditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segAuditoriaActionPerformed(evt);
            }
        });
        mnuSeguridad.add(segAuditoria);

        menuBar.add(mnuSeguridad);

        mnuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ayuda.png"))); // NOI18N
        mnuAyuda.setMnemonic('h');
        mnuAyuda.setText("Ayuda");

        ayuCerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/acerca-de.png"))); // NOI18N
        ayuCerca.setMnemonic('c');
        ayuCerca.setText("Acerca de..");
        mnuAyuda.add(ayuCerca);

        menuBar.add(mnuAyuda);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_manSalirActionPerformed

    private void manDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manDistritoActionPerformed
        desktopPane.add(new DistritoGUI());
    }//GEN-LAST:event_manDistritoActionPerformed

    private void manProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manProductoActionPerformed
        desktopPane.add(new ProductoGUI());
    }//GEN-LAST:event_manProductoActionPerformed

    private void manEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manEmpleadoActionPerformed
        desktopPane.add(new EmpleadoGUI());
    }//GEN-LAST:event_manEmpleadoActionPerformed

    private void repProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repProductoActionPerformed
        /*
        try {
            Connection cn = ConMySql.getInstance().getConnection();
            String direccion = "src\\reportes\\repProducto.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(direccion);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer view = new JasperViewer(mostrarReporte, false);
            view.setTitle("Reporte de Productos");
            view.setExtendedState(MAXIMIZED_BOTH);
            view.setVisible(true);
        } catch (JRException e) {
            System.out.println("Error al generar reporte " + e);
        } catch (Exception ex) {
            System.out.println("Error inesperado" + ex);
        }
         */
        ReporteDAO.generarReportes("repProducto", "Reportes de Productos");
    }//GEN-LAST:event_repProductoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ReporteDAO.generarReportes("repEmpleado", "Reportes de Empleados");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void repDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repDistritoActionPerformed
        ReporteDAO.generarReportes("repDistrito", "Reportes de Distritos");
    }//GEN-LAST:event_repDistritoActionPerformed

    private void facGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facGenerarActionPerformed
        desktopPane.add(new FacturaGUI());
    }//GEN-LAST:event_facGenerarActionPerformed

    private void segAuditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segAuditoriaActionPerformed
        desktopPane.add(new AuditoriaFacturaGUI());
    }//GEN-LAST:event_segAuditoriaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ayuCerca;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem facGenerar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem manCliente;
    private javax.swing.JMenuItem manDistrito;
    private javax.swing.JMenuItem manEmpleado;
    private javax.swing.JMenuItem manProducto;
    private javax.swing.JMenuItem manSalir;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuFacturacion;
    private javax.swing.JMenu mnuMante;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JMenu mnuSeguridad;
    private javax.swing.JMenuItem repCliente;
    private javax.swing.JMenuItem repDistrito;
    private javax.swing.JMenuItem repFactura;
    private javax.swing.JMenuItem repProducto;
    private javax.swing.JMenuItem segAuditoria;
    private javax.swing.JMenuItem segBackup;
    private javax.swing.JMenuItem segRestore;
    // End of variables declaration//GEN-END:variables

}
