package dao;

import conexion.ConMySql;
import dto.EmpleadoTO;
import interfaz.VentasInterface;
import java.io.File;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpleadoDAO implements VentasInterface<EmpleadoTO> {

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        Connection cn = ConMySql.getInstance().getConnection();
        String nombre = "%" + objObject + "%";
        String sql = "select * from vempleado where apatempl like ?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    @Override
    public void insert(EmpleadoTO objObject) throws Exception {
        Connection cn = ConMySql.getInstance().getConnection();
        String sql = "CALL sp_insert_empleado(?,?,?,?,?,?,?,?,?,?,?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setString(1, objObject.getNombempl());
        cs.setString(2, objObject.getApatempl());
        cs.setString(3, objObject.getAmatempl());
        cs.setString(4, objObject.getSexoempl());
        cs.setString(5, objObject.getDireempl());
        cs.setInt(6, objObject.getIddistrito());
        cs.setString(7, objObject.getTelfempl());
        cs.setString(8, objObject.getCeluempl());
        cs.setString(9, objObject.getEmaiempl());
        cs.setString(10, objObject.getObsvempl());
        File objFile= new File(objObject.getFotoempl());
        FileInputStream objFileInputStream=new FileInputStream(objFile);
        cs.setBinaryStream(11, objFileInputStream);
        cs.execute();
    }

    @Override
    public void update(EmpleadoTO objObject) throws Exception {
        Connection cn = ConMySql.getInstance().getConnection();
        String sql = "CALL sp_update_empleado(?,?,?,?,?,?,?,?,?,?,?,?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObject.getIdempleado());
        cs.setString(2, objObject.getNombempl());
        cs.setString(3, objObject.getApatempl());
        cs.setString(4, objObject.getAmatempl());
        cs.setString(5, objObject.getSexoempl());
        cs.setString(6, objObject.getDireempl());
        cs.setInt(7, objObject.getIddistrito());
        cs.setString(8, objObject.getTelfempl());
        cs.setString(9, objObject.getCeluempl());
        cs.setString(10, objObject.getEmaiempl());
        cs.setString(11, objObject.getObsvempl());
        File objFile= new File(objObject.getFotoempl());
        FileInputStream objFileInputStream=new FileInputStream(objFile);
        cs.setBinaryStream(12, objFileInputStream);
        cs.execute();
    }

    @Override
    public void delete(EmpleadoTO objObject) throws Exception {
        Connection cn = ConMySql.getInstance().getConnection();
        String sql = "CALL sp_delete_empleado(?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObject.getIdempleado());
        cs.execute();
    }

}
