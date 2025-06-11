package Persistencia;

import Business.Persona;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoPersona {

    private final String archivo = "personas.txt";

    public void guardarPersonas(List<Persona> personas) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Persona p : personas) {
                String linea = String.join(";",
                        p.getNombre(),
                        p.getApellido(),
                        p.getDni(),
                        p.getDireccion(),
                        p.getTelefono(),
                        p.getFechaNacimiento()
                );
                bw.write(linea);
                bw.newLine();
            }
        }
    }

    public List<Persona> leerPersonas() throws IOException {
        List<Persona> personas = new ArrayList<>();

        File file = new File(archivo);
        if (!file.exists()) return personas;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 6) {
                    personas.add(new Persona(
                            datos[0], datos[1], datos[2],
                            datos[3], datos[4], datos[5]
                    ));
                }
            }
        }

        return personas;
    }
}
