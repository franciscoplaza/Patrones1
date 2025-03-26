public interface IEmpleadoDAO {
    void agregarEmpleado(Empleado empleado);
    Empleado obtenerEmpleado(String nombre);
    void eliminarEmpleado(Empleado empleado);
    void actualizarEmpleado(Empleado empleado);
}
