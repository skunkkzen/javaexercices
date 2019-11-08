public class Circle {

    //variaveis
    private double radius = 1.0;
    private String color = "red";

    //constructores
    public Circle (){

    }

    public Circle (double radius){
        this.radius = radius;
    }
    public Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    //metodos
    public double getRadius (){
        return radius;
    }
    public String getColor(){
            return color;
    }
    public void setRadius(double radius) {
            this.radius= radius;
    }

    public void setColor (String color){
         this.color = color;
    }

    public double getArea () {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle: Radius: 0.2f, Color= %s, Area: 0.2f", radius, color, getArea());

    }