package main;

public class Triangle implements Shape{
    public double base=12;
    public double area=0;
    public double altura=15;
    public double perimetro=0;
    public double ladoB=16.16;
    public double ladoC=16.16;
   
    @Override
    public void getArea() {
        area = (base * altura)/2;
        System.out.println("El area de un triangulo es: "+area);
    }

    @Override
    public void getPerimeter() {
      perimetro = base + ladoB + ladoC;
        System.out.println("El perimetro de un triangulo es: "+perimetro);
    }   
}
