/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

/**
 *
 * @author EGOGOD
 */
public class loginc {

        private String Correo;
        private String contraseña;

        public loginc() {
        }
        public loginc(String Correo, String contraseña) {
            this.Correo = Correo;
            this.contraseña = contraseña;
        }

        
        public String getCorreo() {
            return Correo;
        }

        public void setCorreo(String Correo) {
            this.Correo = Correo;
        }

        public String getContraseña() {
            return contraseña;
        }

        public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }

        @Override
        public String toString() {
            return "Loginc{" + "Correo=" + Correo + ", contrase\u00f1a=" + contraseña + '}';
        }
    }
       