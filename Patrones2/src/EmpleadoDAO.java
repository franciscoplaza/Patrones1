import java.util.ArrayList;

public class EmpleadoDAO implements IEmpleadoDAO {

    private ArrayList<Empleado> empleados;

    public EmpleadoDAO() {
        this.empleados = new ArrayList<>();
    }
    @Override
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public Empleado obtenerEmpleado(String nombre){
        int indice = obtenerIndiceEmpleado(nombre);

        if(indice != -1){
            return empleados.get(indice);
        }
        return null;
    }

    @Override
    public void eliminarEmpleado(String nombre) {
        int indice = obtenerIndiceEmpleado(nombre);

        if(indice != -1){
            empleados.remove(indice);
        }
    }

    @Override
    public void actualizarEmpleado(Empleado empleado) {
        int indice = obtenerIndiceEmpleado(empleado.getNombre());

        if (indice != -1){
            empleados.get(indice).setSalario(empleado.getSalario() + 1000);
        }
    }

    private int obtenerIndiceEmpleado(String nombre){
        for (int i = 0; i < empleados.size(); i++){
            if (empleados.get(i).getNombre().equals(nombre)){
                return i;
            }
        }
        return -1;
    }

}
