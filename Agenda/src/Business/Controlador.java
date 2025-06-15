
package Business;

import Persistencia.ArchivoPersona;
import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List<Persona> personas;
    private int indice = 0;
    private ArchivoPersona archivo = new ArchivoPersona();
    
    public Controlador() {
        try {
            personas = archivo.leerPersonas();
        } catch (Exception e) {
            personas = new ArrayList<>();
        }

        if (personas.isEmpty()) {
            personas.add(new Persona());
        }
    }
    
    public void guardarTodo() throws Exception {
        archivo.guardarPersonas(personas);
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
            Long.valueOf(dni);
            Long.valueOf(telefono);
        } catch (NumberFormatException e) {
            throw new Exception("DNI y Teléfono deben ser números");
        }

        Persona nueva = new Persona(nombre, apellido, dni, direccion, telefono, fechaNacimiento);
        personas.set(indice, nueva);
    }
}
