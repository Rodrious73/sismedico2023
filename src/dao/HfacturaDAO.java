package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexion.ConMySql;
import dto.HfacturaTO;
import interfaz.VentasInterface;
import java.sql.ResultSet;

public class HfacturaDAO implements VentasInterface<HfacturaTO>{

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        Connection cn = (Connection) ConMySql.getInstance().getConnection();
        String sql = "select * from v_auditoria_factura";
        PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        return rs;
    }
    
    public ResultSet buscarPorFecha(Object objObject1, Object objObject2) throws Exception {
        Connection cn = (Connection) ConMySql.getInstance().getConnection();
        String fechaInicio = objObject1.toString();
        String fechaFinal = objObject2.toString();
        String sql = "select * from v_auditoria_factura where fechfact between ? and ?";
        PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
        ps.setString(1, fechaInicio);
        ps.setString(2, fechaFinal);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    @Override
    public void insert(HfacturaTO objObject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(HfacturaTO objObject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(HfacturaTO objObject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
