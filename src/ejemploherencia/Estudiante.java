package ejemploherencia;
/**
 *
 * @author abrandarizdominguez
 */
public class Estudiante extends Persona{
    
    private String codigo;
    private int notaFinal;
    // Constructor por parámetros
    public Estudiante (String nombre, String apellido, int edad, String codigo, int notaFinal){
        // Usamos "super" para señalar lo heredado, debe ser declarado en la primera sentencia
        super(nombre, apellido, edad);
        this.codigo = codigo;
        this.notaFinal = notaFinal;
    }
    // GETS
    public String getCodigo(){
        return codigo;
    }
    public int getNotaFinal(){
        return notaFinal;
    }
    // Método "mostrar" que mostrará los datos
    public void mostrar(){
        System.out.println("Nombre: "+getNombre()+
        "\n Apellido: "+getApellido()+"\n Edad: "+getEdad()+
        "\n Codigo: "+getCodigo()+"\n Nota Final: "+getNotaFinal());
    }
}
