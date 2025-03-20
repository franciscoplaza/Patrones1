class Cliente{
    private String nombre;
    private String tarjetaCredito;

    public Cliente(String nombre, String tarjetaCredito){
        this.nombre = nombre;
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
}
