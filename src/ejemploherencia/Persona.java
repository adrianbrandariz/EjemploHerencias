package ejemploherencia;
/**
 *
 * @author abrandarizdominguez
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    // Constructor por defecto
    public Persona(){
    }
    // Constructor por parámetros
    public Persona (String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    // Gets
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
}
