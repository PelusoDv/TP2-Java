
package Business;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;
    private String fechaNacimiento;
 
    public Persona() {
    }
    
    public Persona(String name, String sur, String dni, String dir, String tel, String nac) {
        this.nombre = name;
        this.apellido = sur;
        this.dni = dni;
        this.direccion = dir;
        this.telefono = tel;
        this.fechaNacimiento = nac;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDni() { return dni; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public String getFechaNacimiento() { return fechaNacimiento; }
    
}
