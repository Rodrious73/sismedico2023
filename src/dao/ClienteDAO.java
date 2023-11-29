package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexion.ConMySql;
import dto.ClienteTO;
import interfaz.VentasInterface;
import java.sql.ResultSet;

public class ClienteDAO implements VentasInterface<ClienteTO>{

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        Connection cn = (Connection) ConMySql.getInstance().getConnection();
        String nombre = "%" + objObject + "%";
        String sql = "SELECT idcliente, rucclie, nombclie, direclie FROM vcliente where nombclie like ?";
        PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    @Override
    public void insert(ClienteTO objObject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(ClienteTO objObject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(ClienteTO objObject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
