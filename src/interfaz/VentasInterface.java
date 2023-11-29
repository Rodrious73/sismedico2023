package interfaz;

import java.sql.ResultSet; 

public interface VentasInterface <Objecto>{
    public ResultSet buscar(Object objObject) throws Exception;
    public void insert(Objecto objObject) throws Exception;
    public void update(Objecto objObject) throws Exception;
    public void delete(Objecto objObject) throws Exception;
}
