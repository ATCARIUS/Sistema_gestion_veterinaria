/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veterinaria;

import datos.conexionbd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
/**
 *
 * @author EGOGOD
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    conexionbd c = new conexionbd();
     if(c.conexion() != null)
            System.out.println("Conexion correcta");
     else
            System.out.println("Conexion erronea, la cagamos");
        
        
            
        
    }
    
}
