package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    
    public Connection Connect(){
        Connection con;
        try {
            String myBD = "jdbc:mysql://localhost:3306/veterinaria?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root", "");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return null;
    }
}
