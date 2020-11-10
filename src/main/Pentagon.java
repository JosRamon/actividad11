package main;
public class Pentagon implements Shape{

    //pentagono regular
    
    public double apotema=2.5;
    public double longitud = 5;
    public double area=0;
    public double perimetro=0;
    
    @Override
    public void getArea() {
       area = (5*longitud*apotema)/2;
        System.out.println("El area de un pentagono regular es: "+area);
    }

    @Override
    public void getPerimeter() {
       perimetro = 5 * longitud;
        System.out.println("El perimetro de un pentagono regular es: "+perimetro);
    }
    
}
