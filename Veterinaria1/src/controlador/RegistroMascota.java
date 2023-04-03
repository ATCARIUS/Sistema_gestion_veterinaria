/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import datos.conexionbd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Mascota;

/**
 *
 * @author EGOGOD
 */
public class RegistroMascota {

    conexionbd cn = new conexionbd();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean Registro(Mascota mas) {

        String sql = "INSERT INTO mascotas(Raza, Peso, Color, codigo_mascota, nombre_mascota)VALUES(?,?,?,?,?)";

        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, mas.getRaza());
            ps.setInt(2, mas.getPeso());
            ps.setString(3, mas.getColor());
            ps.setInt(4, mas.getCodigo_mascota());
            ps.setString(5, mas.getNombre_mascota());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }

        }
    }

    public List ListarMascota() {
        List<Mascota> Listamascota = new ArrayList();
        String sql = "SELECT * FROM mascotas";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Mascota mas = new Mascota();
                mas.setCodigo_mascota(rs.getInt("codigo_mascota"));
                mas.setRaza(rs.getString("Raza"));
                mas.setColor(rs.getString("Color"));
                mas.setNombre_mascota(rs.getString("Nombre_mascota"));
                mas.setPeso(rs.getInt("Peso_mascota"));
                Listamascota.add(mas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listamascota;
    }

    public boolean EliminarMascota(int Codigo_mascota) {
        String sql = "DELETE FROM mascotas WHERE codigo_mascota = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, Codigo_mascota);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }

    }

    public boolean ModificarMascota(Mascota mas) {
        String sql = "UPDATE Mascotas SET Raza = ?,Peso = ?,Color = ?,Codigo_mascota = ?,Nombre_mascota = ? WHERE codigo_mascota = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mas.getRaza());
            ps.setInt(2, mas.getPeso());
            ps.setString(3, mas.getColor());
            ps.setInt(4, mas.getCodigo_mascota());
            ps.setString(5, mas.getNombre_mascota());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public Mascota BuscarMascota(int codigo_mascota) {
        Mascota mas = new Mascota();
        String sql = "SELECT * FROM Mascota WHERE Codigo_mascota = ?";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo_mascota);
            rs = ps.executeQuery();
            if (rs.next()) {
                mas.setCodigo_mascota(rs.getInt("codigo_mascota"));
                mas.setRaza(rs.getString("Raza"));
                mas.setColor(rs.getString("Color"));
                mas.setNombre_mascota(rs.getString("Nombre_mascota"));
                mas.setPeso(rs.getInt("Peso_mascota"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return mas;
    }
}
