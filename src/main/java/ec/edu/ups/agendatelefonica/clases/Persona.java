package ec.edu.ups.agendatelefonica.clases;
import java.util.Date;
/**
 *
 * @author Asus
 */
public class Persona {
    private int cedula;
    private String nombre;
    private Date fechaNacimiento;

    public Persona(int cedula, String nombre, Date fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int calcularEdad(Date fechaActual){
        return fechaActual.getYear() - fechaNacimiento.getYear();
    }

    
    @Override
    public String toString() {
        return "\ncedula=" + cedula + "\nnombre=" + nombre ;
    }    
    
}
