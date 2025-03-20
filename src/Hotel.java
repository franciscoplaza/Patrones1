class Hotel {
    public void hacerReserva(Cliente cliente){
        System.out.println("Reserva realizada para cliente" + cliente.getNombre());

    }
    public void realizarPago(Cliente cliente){
        System.out.println("Procesando pago con tarjeta de credito" + cliente.getTarjetaCredito());
    }
}