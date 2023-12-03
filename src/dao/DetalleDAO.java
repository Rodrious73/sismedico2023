package dao;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import conexion.ConMySql;
import dto.DetalleTO;
import interfaz.VentasInterface;
import java.sql.ResultSet;

public class DetalleDAO implements VentasInterface<DetalleTO>{

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(DetalleTO objObject) throws Exception {
        Connection cn = (Connection) ConMySql.getInstance().getConnection();
        String sql = "CALL sp_insert_detalle(?,?,?,?,?)";
        CallableStatement cs = (CallableStatement) cn.prepareCall(sql);
        cs.setInt(1, objObject.getIdfactura());
        cs.setInt(2, objObject.getIdproducto());
        cs.setDouble(3, objObject.getPrecprod());
        cs.setDouble(4, objObject.getCantidad());
        cs.setDouble(5, objObject.getImporte());
        cs.execute();
    }

    @Override
    public void update(DetalleTO objObject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(DetalleTO objObject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
