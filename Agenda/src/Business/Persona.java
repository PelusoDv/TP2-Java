
package Business;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private String direc;
    private int telef;
    private String nac;
 
    public Persona() {
    }
    
    public Persona(String nombre, String apellido, int dni, String direc, int telef, String nac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direc = direc;
        this.telef = telef;
        this.nac = nac;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public String getDirec() {
        return direc;
    }

    public int getTelef() {
        return telef;
    }

    public String getNac() {
        return nac;
    }
    
}
