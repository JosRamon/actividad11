
package main;

/**
 *
 * @author user
 */
public class Circle implements Shape {
    
    public double radio=2;
    public double area=0;
    public double pi=3.1416;
    public double diametro=5;
    public double perimetro=0;
    
    
    @Override
    public void getArea() {
        
       area=pi * Math.pow(radio,2);
        System.out.println("El area de un circulo es: "+area);
    }

    @Override
    public void getPerimeter() {
        perimetro = (2 * pi)*radio;
        System.out.println("El perimetro de un circulo es: "+perimetro);
    }
}
