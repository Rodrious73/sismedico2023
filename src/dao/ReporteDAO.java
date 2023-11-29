package dao;

import java.sql.Connection;
import conexion.ConMySql;
import static java.awt.Frame.MAXIMIZED_BOTH;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class ReporteDAO {

    public static void generarReportes(String nombreReporte, String tituloReporte) {
        try {
            Connection cn = ConMySql.getInstance().getConnection();
            String direccion = "src\\reportes\\" + nombreReporte + ".jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(direccion);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer view = new JasperViewer(mostrarReporte, false);
            view.setTitle(tituloReporte);
            view.setExtendedState(MAXIMIZED_BOTH);
            view.setVisible(true);
        } catch (JRException e) {
            System.out.println("Error al generar reporte " + e);
        } catch (Exception ex) {
            System.out.println("Error inesperado" + ex);
        }
    }
}
