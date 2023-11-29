package dao;

import conexion.ConMySql;
import dto.DistritoTO;
import interfaz.VentasInterface;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;

public class DistritoDAO implements VentasInterface<DistritoTO>{

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        Connection cn = ConMySql.getInstance().getConnection();
        String nombre="%"+ objObject + "%";
        String sql = "select * from vdistrito where nombdist like ?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, nombre);
        ResultSet rs=ps.executeQuery();
        return rs;
    }

    @Override
    public void insert(DistritoTO objObject) throws Exception {
       Connection cn = ConMySql.getInstance().getConnection();
       String sql = "CALL sp_insert_distrito(?,?)";
       CallableStatement cs = cn.prepareCall(sql);
       cs.setString(1, objObject.getNombdist());
       cs.setString(2, objObject.getObsvdist());
       cs.execute();
    }

    @Override
    public void update(DistritoTO objObject) throws Exception {
        Connection cn = ConMySql.getInstance().getConnection();
        String sql = "CALL sp_update_distrito(?,?,?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObject.getIddistrito());
        cs.setString(2, objObject.getNombdist());
        cs.setString(3, objObject.getObsvdist());
        cs.execute();
    }

    @Override
    public void delete(DistritoTO objObject) throws Exception {
        Connection cn = ConMySql.getInstance().getConnection();
        String sql = "CALL sp_delete_distrito(?)";
        
    }
    
}
