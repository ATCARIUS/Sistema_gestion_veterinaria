/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import veterinaria.loginc;

/**
 *
 * @author EGOGOD
 */
public class logindb {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    conexionbd cn = new conexionbd();

    public loginc log(String correo, String contraseña) {
        loginc logg = new loginc();
        String sql = "SELECT * FROM usuarios WHERE correo = ? AND contraseña = ?";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();
            if (rs.next()) {
                logg.setCorreo(rs.getString("correo"));
                logg.setContraseña(rs.getString("contraseña"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return logg;
    }
}
