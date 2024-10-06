package logica;

public class Usuario {

    private String cedula;
    private String password;
    private String nombreCompleto;
    private boolean logueado;
    
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public boolean isLogueado() {
        return logueado;
    }

    public void setLogueado(boolean logueado) {
        this.logueado = logueado;
    }
    

    public Usuario() {
    }

    public Usuario(String cedula, String pwd, String nombre) {
        this.cedula = cedula;
        this.password = pwd;
        this.nombreCompleto = nombre;
        this.logueado = false;
    }

    public void datosValidos() throws UsuarioException {
         validarCedula();
         validarPwd();
         validarNombreCompleto();
    }

    private void validarCedula() throws UsuarioException {
        if (this.cedula.isBlank()) {
            throw new UsuarioException("La cedula no es valida");
        }
    }

    private void validarPwd() throws UsuarioException {
        if (this.password.isBlank()) {
            throw new UsuarioException("La contraseña no es valida");
        }
    }

    private void validarNombreCompleto() throws UsuarioException {
        if (this.nombreCompleto.isBlank()) {
            throw new UsuarioException("El nombre no es valido");
        }
    }

}
