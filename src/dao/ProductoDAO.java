package dao;

import conexion.ConMySql;
import dto.ProductoTO;
import interfaz.VentasInterface;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductoDAO implements VentasInterface<ProductoTO> {

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        Connection cn = ConMySql.getInstance().getConnection();
        String nombre = "%" + objObject + "%";
        String sql = "select * from vproducto where nombprod like ?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    @Override
    public void insert(ProductoTO objObject) throws Exception {
        Connection cn = ConMySql.getInstance().getConnection();
        String sql = "CALL sp_insert_producto(?,?,?,?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setString(1, objObject.getNombprod());
        cs.setDouble(2, objObject.getPrecprod());
        cs.setString(3, objObject.getObsvprod());
        File objFile= new File(objObject.getFotoprod());
        FileInputStream objFileInputStream=new FileInputStream(objFile);
        cs.setBinaryStream(4, objFileInputStream);
        cs.execute();
    }

    @Override
    public void update(ProductoTO objObject) throws Exception {
        Connection cn = ConMySql.getInstance().getConnection();
        String sql = "CALL sp_update_producto(?,?,?,?,?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObject.getIdproducto());
        cs.setString(2, objObject.getNombprod());
        cs.setDouble(3, objObject.getPrecprod());
        cs.setString(4, objObject.getObsvprod());
        File objFile= new File(objObject.getFotoprod());
        FileInputStream objFileInputStream=new FileInputStream(objFile);
        cs.setBinaryStream(5, objFileInputStream);
        cs.execute();
    }

    @Override
    public void delete(ProductoTO objObject) throws Exception {
        Connection cn = ConMySql.getInstance().getConnection();
        String sql = "CALL sp_delete_producto(?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObject.getIdproducto());
        cs.execute();
    }

}
