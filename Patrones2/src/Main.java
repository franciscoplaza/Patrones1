//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IEmpleadoDAO empleadoDAO = new EmpleadoDAO();

        IEmpleadoService empleadoService = new EmpleadoService(empleadoDAO);

        Empleado empleado = new Empleado("Felipe", "Gerente", 3000);

        empleadoService.agregarEmpleado(empleado);

        Empleado empleadoObtenido = empleadoService.obtenerEmpleado("Felipe");

        mostrarInformacionEmpleado(empleadoObtenido);

        //-----------------------------------------------------------------------------------
        empleadoService.actualizarEmpleado(empleado); //sube el sueldo en 1000

        empleadoObtenido = empleadoService.obtenerEmpleado("Felipe");
        mostrarInformacionEmpleado(empleadoObtenido);

        //-----------------------------------------------------------------------------------

        empleadoService.eliminarEmpleado("Felipe");

        empleadoObtenido = empleadoService.obtenerEmpleado("Felipe");
        mostrarInformacionEmpleado(empleadoObtenido);

    }

    private static void mostrarInformacionEmpleado(Empleado empleadoObtenido) {
        if (empleadoObtenido != null) {
            System.out.println("Empleado encontrado:");
            System.out.println("Nombre: " + empleadoObtenido.getNombre());
            System.out.println("Puesto: " + empleadoObtenido.getPuesto());
            System.out.println("Salario: " + empleadoObtenido.getSalario());
        } else {
            System.out.println("No se encontró el empleado.");
        }
    }

}
