import java.util.ArrayList;

public class EmpleadoDAO implements IEmpleadoDAO {

    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    @Override
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public Empleado obtenerEmpleado(String nombre){
        for (Empleado empleado : empleados){
            if (empleado.getNombre().equals(nombre)){
                return empleado;
            }
        }
        return null;
    }

    @Override
    public void eliminarEmpleado(String nombre) {
        for (Empleado empleado : empleados){
            if (empleado.getNombre().equals(nombre)){
                empleados.remove(empleado);
            }
        }
    }

    @Override
    public void actualizarEmpleado(Empleado empleado) {
        for (int i = 0; i < empleados.size(); i++){
            if (empleados.get(i).getNombre().equals(empleado.getNombre())){
                empleados.set(i, empleado);
                break;
            }
        }
    }
}
