
package ClasesMetodos.manejo.newpackage;

import java.sql.*;

public class conexion {
    //CADENA DE CONEXION,USUARIO,CLAVE
    private static final String JDBC_URL ="jdbc:mysql://localhost:3306/cajero";
    private static final String JDBC_USER ="scch94";
    private static final String JDBC_PASSWORD ="Santiago1994.";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
}
