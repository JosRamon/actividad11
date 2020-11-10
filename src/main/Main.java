/*@Ramon Martinez */
package main;
import java.util.Scanner;
import java.util.Collections;
public class Main {
    static Scanner scanner = new Scanner(System.in); 
    static int x = -1;     
    public static void main(String[] args) {        
         Circle circulo = new Circle ();
         Triangle triangulo = new Triangle();
         Square cuadrado = new Square();
         Pentagon pentagono = new Pentagon();                  
         while(x != 0){			
			try{
                             System.out.println("Bienvenidos a Geometria Basica"); 
                             System.out.println("0. Salir");
                             System.out.println("1. Circulo");
                             System.out.println("2. Triangulo");
                             System.out.println("3. Cuadrado");
                             System.out.println("4. Pentagono");                             
                             System.out.print("Introduce una opción: ");
			     x = Integer.parseInt(scanner.nextLine()); 					
				switch(x){                                   
				case 1: 
					circulo.getArea();
                                        circulo.getPerimeter();
					break;
				case 2: 
					triangulo.getArea();
                                        triangulo.getPerimeter();
					break;
				case 3: 
					cuadrado.getArea();
                                        cuadrado.getPerimeter();
					break;	
                                case 4:
                                        pentagono.getArea();
                                        pentagono.getPerimeter();
                                        break;                                      
				case 0: 
					System.out.println("Gracias por jugar");
					break;
				default:
					System.out.println("Numero invalido, intente otra vez");
                                        break;
				}				
			}catch(Exception e){
				System.out.println("Opcion no valida, intente de nuevo");
			}
		}                 
    }    
}
