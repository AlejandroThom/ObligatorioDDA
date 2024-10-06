package logica;

public class Mesa {
    
    public enum Estado{
        ABIERTA,
        INICIADA,
        CERRADA,
    }
    
    private long numeroMesa;
    private int maxJugadores;
    private Usuario[] jugadores;
    private int cantidadActualJugadores;
    private long apuestaBase;
    private int comision;
    private Estado estado;

    public long getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(long numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getMaxJugadores() {
        return maxJugadores;
    }

    public void setMaxJugadores(int maxJugadores) {
        this.maxJugadores = maxJugadores;
    }

    public Usuario[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Usuario[] jugadores) {
        this.jugadores = jugadores;
    }

    public int getCantidadActualJugadores() {
        return cantidadActualJugadores;
    }

    public void setCantidadActualJugadores(int cantidadActualJugadores) {
        this.cantidadActualJugadores = cantidadActualJugadores;
    }

    public long getApuestaBase() {
        return apuestaBase;
    }

    public void setApuestaBase(long apuestaBase) {
        this.apuestaBase = apuestaBase;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
    
    public Mesa(long numeroMesa, int maxJugadores, long apuestaBase, int comision){
        estado = Estado.ABIERTA;
        this.numeroMesa = numeroMesa;
        this.maxJugadores = maxJugadores;
        jugadores = new Usuario[maxJugadores];
        this.apuestaBase = apuestaBase;
        this.comision = comision;
        cantidadActualJugadores=0;
    }
    
}
