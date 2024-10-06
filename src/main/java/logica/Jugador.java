package logica;

public class Jugador extends Usuario {
    
    private long saldo;
    
    public Jugador(){
        super();
    }
    
    public Jugador(String cedula ,String pwd ,String nombre ,long saldo){
        super(cedula,pwd,nombre);
        this.saldo = saldo;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    @Override
    public void datosValidos() throws UsuarioException {
         super.datosValidos();
         validarSaldo(); 
    }

    private void validarSaldo() throws UsuarioException {
        if(this.saldo >=0){
            throw new UsuarioException("El saldo no es valido");
        }
    }
    
    
    
}
