package logica;

import java.util.ArrayList;

public class SistemaUsuario {
    private ArrayList<Usuario> usuarios;
    
    public SistemaUsuario(){
        this.usuarios = new ArrayList<>();
    }
    
    public Usuario login(String cedula, String pwd) throws UsuarioException{
        Usuario user = null;
        for(int i = 0; i < usuarios.size() && user == null; i++){
            Usuario actual = usuarios.get(i);
            if(actual.getCedula().equals(cedula) && actual.getPassword().equals(pwd)){
                if(actual.isLogueado()){
                    throw new UsuarioException("Acceso denegado. El usuario ya está logueado.");
                }
                actual.setLogueado(true);
                user = actual;
            }else{
                throw new UsuarioException("Credenciales incorrectas");
            }
        }
        return user;
    }
    
}
