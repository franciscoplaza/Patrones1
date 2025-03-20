# Patrones1

1. El código original tiene problemas de encapsulamiento y ocultamiento de la información debido a que los atributos de la clase cliente son públicos, es decir, no están protegidos.
2. Además, tiene problemas de separación de responsabilidades, ya que en el método hacerReserva realiza tanto la reserva como el pago. Debería tener la lógica de pago por separado.
3. Respecto al acoplamiento, se presenta debido a que el método hacerReserva de la clase Hotel usa como parámetro a un objeto de la clase Cliente.
