package main;
public class Square implements Shape{
    
    public double lado=5;  
    public double area=0;
    public double perimetro=0;

    @Override
    public void getArea() {
       area=lado*lado;
        System.out.println("El area de un cuadrado es: "+area);
    }

    @Override
    public void getPerimeter() {
        perimetro=lado+lado+lado+lado;
        System.out.println("El perimetro es: "+perimetro);
    }  
}
