package org.sample.Tarea1_CarlosBarahona;
import java.util.Scanner;
import java.text.DecimalFormat;

public class App
{
	public static DecimalFormat formato = new DecimalFormat("#.00");
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("-----Menu de Calculo de Areas-----");
            System.out.println("1. Area de un Circulo");
            System.out.println("2. Area de un Cuadrado");
            System.out.println("3. Area de un Rectangulo");
            System.out.println("4. Area de un Triangulo");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1: {
                    System.out.print("Ingrese el radio del circulo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("El area del círculo es: " + areaCirculo(radio));
                    break;
                }
                    
                case 2: {
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    System.out.println("El area del cuadrado es: " + areaCuadrado(lado));
                    break;
                }
                    
                case 3: {
                    System.out.print("Ingrese la base del rectangulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectangulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("El area del rectángulo es: " + areaRectangulo(base, altura));
                    break;
                }
                    
                case 4: {
                    System.out.print("Introduce la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Introduce la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("El área del triángulo es: " + areaTriangulo(base, altura));
                    break;
                }
                    
                case 5: {
                    System.out.println("Que tenga buen dia.");
                    break;
                }
                    
                default:
                    System.out.println("Por favor ingrese una opcion valida.");
                    break;
            }
            
            System.out.println();
            
        } while (opcion != 5);

    }

    // Metodo para el area de un circulo
    public static double areaCirculo(double radio) {
    	double respuesta = Math.PI * radio * radio;
        return Double.parseDouble(formato.format(respuesta));
    }

    // Metodo para el area de un cuadrado
    public static double areaCuadrado(double lado) {
    	double respuesta = lado * lado;
        return Double.parseDouble(formato.format(respuesta));
    }

    // Metodo para el area de un rectangulo
    public static double areaRectangulo(double base, double altura) {
    	double respuesta = base * altura;
        return Double.parseDouble(formato.format(respuesta));
    }

    // Método para el area de un triangulo
    public static double areaTriangulo(double base, double altura) {
    	Double respuesta = (base * altura) / 2;
        return Double.parseDouble(formato.format(respuesta));
    }
}
