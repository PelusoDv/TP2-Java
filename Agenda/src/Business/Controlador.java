
package Business;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List<Persona> personas = new ArrayList<>();
    private int indice = 0;
    
    public Controlador() {
        personas.add(new Persona());
    }

    public Persona getPersona() {
        return personas.get(indice);
    }

    public int getIndice() {
        return indice;
    }

    public void avanzar() {
        indice++;
        if (indice >= personas.size()) {
            personas.add(new Persona());
        }
    }

    public void retroceder() {
        if (indice > 0) {
            indice--;
        }
    }

    public void guardarPersona(String nombre, String apellido, String dni, String direccion, String telefono, String fechaNacimiento) throws Exception {
        if (nombre.isBlank() || apellido.isBlank() || dni.isBlank() || direccion.isBlank() || telefono.isBlank() || fechaNacimiento.isBlank()) {
            throw new Exception("No guardar campos vacíos");
        }

        try {
            Long.parseLong(dni);
            Long.parseLong(telefono);
        } catch (NumberFormatException e) {
            throw new Exception("DNI y Teléfono deben ser números");
        }

        Persona nueva = new Persona(nombre, apellido, dni, direccion, telefono, fechaNacimiento);
        personas.set(indice, nueva);
    }
}
