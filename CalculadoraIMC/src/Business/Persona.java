
package Business;

public class Persona {
    private float altura;
    private float peso;
    private float IMC;

    public Persona() {
    }
    
    public Persona(float altura, float peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void setIMC() {
        float calc = this.peso/(this.altura*this.altura);
        this.IMC = calc;
    }
    
    public float getIMC() {
        return IMC;
    }
    
}
