package dao;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import conexion.ConMySql;
import dto.FacturaTO;
import interfaz.VentasInterface;
import java.sql.ResultSet;

public class FacturaDAO implements VentasInterface<FacturaTO> {

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(FacturaTO objObject) throws Exception {
        Connection cn = (Connection) ConMySql.getInstance().getConnection();
        String sql = "CALL sp_insert_factura(?,?,?,?,?)";
        CallableStatement cs = (CallableStatement) cn.prepareCall(sql);
        cs.setInt(1, objObject.getIdcliente());
        cs.setInt(2, objObject.getIdempleado());
        cs.setDouble(3, objObject.getStotfact());
        cs.setDouble(4, objObject.getIgvfact());
        cs.setDouble(5, objObject.getTotafact());
        cs.execute();
    }

    @Override
    public void update(FacturaTO objObject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(FacturaTO objObject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
