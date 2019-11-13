// VARIAVEIS

public class Retângulo {

    private float length = 1.0f;
    private float width = 1.0f;

//CONSTRUTORES

    public Retângulo() {

    }

    public Retângulo(float length) {
        this.length = length;
    }

    public Retângulo(float length, float width) {
        this.length = length;
        this.width = width;
    }


//MÉTODOS
public float getLength () {return length;}
public float getWidth() {return width;}

public void setLength(float length)  {this.length = length;}
public void setWidth(float width) {this.width = width;}
public double getArea() {return Math.PI * length * length;}
public double getPerimeter() {return Math.PI * length * length;}

    public String toString() {
        return String.format("Retângulo: Length: 1.0f, Color= 1.0f, Area: 0.2f", length, width, getArea()); }

}