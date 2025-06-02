
package Business;

public class Mensaje {
    private String mensaje;

    public void setMensaje(float IMC) {
        if (IMC < 18.5){
            this.mensaje = "Delgadez (Necesita aumentar de peso)";
        } else if (IMC < 20) {
            this.mensaje = "Saludable (Intenta no bajar mas de peso)";
        } else if (IMC < 22.5) {
            this.mensaje = "Saludable (Estas en tu peso ideal, sigue asi!)";
        } else if (IMC < 25) {
            this.mensaje = "Saludable (Intenta no subir mas de peso)";
        } else if (IMC < 30) {
            this.mensaje = "Sobrepeso (Necesitas adelgazar un poco)";
        } else {
            this.mensaje = "Obecidad (Cuidado! estas poniendo en peligro tu salud)";
        }
    }
    
    public String getMensaje() {
        return this.mensaje;
    }
}
