// VARIAVEIS


public class Retângulo {

    private float length = 1.0f;
    private float width = 1.0f;

//CONSTRUTORES

    public Retângulo() {

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
public double getArea() {return length * width;}
public double getPerimeter() {return width + length + width + length;}

    public String toString() {
        return String.format("Retângulo: Length: %f, Width= %f, Area:%f, Perimeter: %f", length, width, getArea(), getPerimeter()); }

}