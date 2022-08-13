
package ClasesMetodos.manejo.newpackage;

import ClasesMetodos.Usuario;
import java.sql.*;
import java.util.ArrayList;


public class manejo {
    //guardar datos de toda la tabla usuario.
    private static final String SQL_SELECT ="select * from usuario";
    private static final String SQL_INSERT ="insert into usuario (id,nombre,tipo_cuenta,direccion,cantidad_dinero,correo,contraseña) values (?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE ="update usuario set nombre=?,tipo_cuenta=?,direccion=?,cantidad_dinero=?,correo=?,contraseña=? where id =?";
    private static final String SQL_DELETE ="delete from usuario where id =?";
    
    public ArrayList<Usuario> seleccionar() {
        //instancio variables
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try{
            //utilizo el metodo conexion para conectarme a la base de datos el cual retorna un elemento de tipo connection
            conn =conexion.getConnection();
            //hago el prepared statement con la instruccion a utilizar en este caso de topar todos los datos
            stmt =conn.prepareStatement(SQL_SELECT);
            //guardo los valores entregados por la consulta en la variable rs
            rs=stmt.executeQuery();
            //utilizo el metodo while para guardar todos los datos de cada linea de la tabla y los guardo en una clase
            while(rs.next()){
                //recuperamos las variables de cada fila atraves del nombre de la fila tambien puedes poner por pocicion
                String id=rs.getString("id");
                String nombre=rs.getString("nombre");
                String tipo=rs.getString("tipo_cuenta");
                String direccion=rs.getString("direccion");
                String dinero=rs.getString("cantidad_dinero");
                String correo=rs.getString("correo");
                String contrasena=rs.getString("contraseña");
                //creamos el objeto tipo usuario y lo guardamos en el arraylist
                usuario=new Usuario(id,nombre,tipo,direccion,dinero,correo,contrasena);
                usuarios.add(usuario);
            }
        }catch(Exception e){
            System.out.println("no encontramos base de datos");
        }
        return usuarios;
    }
    public int agregar(Usuario usuario){
       Connection conn = null;
       PreparedStatement stmt = null;
       int registros=0;
        try {
            conn=conexion.getConnection();
            stmt=conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getId());
            stmt.setString(2, usuario.getNombre());
            stmt.setString(3, usuario.getTipo());
            stmt.setString(4, usuario.getDireccion());
            stmt.setString(5, usuario.getMonto());
            stmt.setString(6, usuario.getCorreo());
            stmt.setString(7, usuario.getContraseña());
            //el metodo executeupdate entrega un entero de las modificaciones echas y puede borrar agregar o modificar el valor de una tabla
            registros=stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("errore en la conexion de base de datos");
        }
       return registros;
    }
    public int actualizar(Usuario usuario){
       Connection conn = null;
       PreparedStatement stmt = null;
       int registros=0;
        try {
            conn=conexion.getConnection();
            stmt=conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getTipo());
            stmt.setString(3, usuario.getDireccion());
            stmt.setString(4, usuario.getMonto());
            stmt.setString(5, usuario.getCorreo());
            stmt.setString(6, usuario.getContraseña());
            stmt.setString(7, usuario.getId());
            //el metodo executeupdate entrega un entero de las modificaciones echas y puede borrar agregar o modificar el valor de una tabla
            registros=stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("errore en la conexion de base de datos");
        }
       return registros;
    }
    public int borrar(Usuario usuario){
        Connection conn = null;
       PreparedStatement stmt = null;
       int registros=0;
        try {
            conn=conexion.getConnection();
            stmt=conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, usuario.getId());
            //el metodo executeupdate entrega un entero de las modificaciones echas y puede borrar agregar o modificar el valor de una tabla
            registros=stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("errore en la conexion de base de datos");
        }
       return registros;
    }
}
