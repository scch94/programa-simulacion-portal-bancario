package ClasesMetodos;


public class Usuario {
    //atributos
    private String id;
    private String nombre;
    private String tipo;
    private String direccion;
    private String monto;
    private String correo;
    private String contraseña;

    public Usuario(String id, String nombre, String tipo, String direccion, String monto, String correo, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.monto = monto;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public Usuario(String id) {
        this.id = id;
    }
    

 

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
