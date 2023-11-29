package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConMySql {

    static ConMySql instance = null;
    Connection connection = null;

    public ConMySql() throws Exception {
        String url = "jdbc:mysql://localhost:3306/ventas20232";
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, "root", "2363201");
    }

    public static ConMySql getInstance() throws Exception {
        if (instance == null) {
            instance = new ConMySql();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    @Override
    protected void finalize() throws Throwable {
        connection.close();
        connection = null;
        super.finalize();
    }
}
