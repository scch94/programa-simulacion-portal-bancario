
package ClasesMetodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import ClasesMetodos.manejo.newpackage.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;




public class Metodos {
    public Usuario igualdad(String cedula, String contraseña){
        String pregunta ="select * from usuario where id =? and contraseña =?";  
        Connection conn=null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(pregunta);
            stmt.setString(1, cedula);
            stmt.setString(2, contraseña);
            rs =stmt.executeQuery();
            while(rs.next()){
                String id=rs.getString("id");
                String nombre=rs.getString("nombre");
                String tipo=rs.getString("tipo_cuenta");
                String direccion=rs.getString("direccion");
                String dinero=rs.getString("cantidad_dinero");
                String correo=rs.getString("correo");
                String contrasena=rs.getString("contraseña");
                usuario=new Usuario(id,nombre,tipo,direccion,dinero,correo,contrasena);
            }
        } catch (SQLException ex) {
            System.out.println("error en la conexion");
        }

        
        
        return usuario;
    }
    public int hacer(String opcion,String id,String clave){
        Usuario us =igualdad(id, clave);
        if(opcion.equalsIgnoreCase("saldo")){
            JOptionPane.showMessageDialog(null, "el saldo de tu cuenta es igual a: "+ us.getMonto());
        }
        if(opcion.equalsIgnoreCase("consignar")){
            if(us.getTipo().equalsIgnoreCase("pensionada")){
                JOptionPane.showMessageDialog(null, "no puedes consignar esta cuenta ya que es una cuenta tipo pension");
            }else{
                int monto =Integer.parseInt(JOptionPane.showInputDialog("cuanto dinero deseas consignar"));
                int monto2 =Integer.parseInt(us.getMonto())+monto;
                us.setMonto(String.valueOf(monto2));
                manejo ms = new manejo();
                ms.actualizar(us);
                JOptionPane.showMessageDialog(null, "tu nuevo saldo es "+us.getMonto());
            }
            JOptionPane.showMessageDialog(null, "el saldo de tu cuenta es igual a: "+ us.getMonto());
        }
        if(opcion.equalsIgnoreCase("retirar")){
            
            int monto =Integer.parseInt(JOptionPane.showInputDialog("cuanto dinero deseas retirar"));
            if (monto>Integer.parseInt(us.getMonto())){
                JOptionPane.showMessageDialog(null, "el saldo de tu cuenta no es suficiente vuelve a intentarlo: ");
            }else{
                int monto2 =Integer.parseInt(us.getMonto())-monto;
                us.setMonto(String.valueOf(monto2));
                manejo ms = new manejo();
                ms.actualizar(us);
                JOptionPane.showMessageDialog(null, "tu nuevo saldo es "+us.getMonto());
            }
        }
        if(opcion.equalsIgnoreCase("volver")){
            return 1;
        }
        
        return 0;
    }
}
