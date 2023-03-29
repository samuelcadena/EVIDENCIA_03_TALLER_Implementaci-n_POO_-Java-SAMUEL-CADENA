package figurasGeometricas;

import java.util.Scanner;

public class Figura {
    public static void main(String[] args) {
      float lado;
      Scanner captura=new Scanner(System.in);
      System.out.println("ingrese el valor del lado del rectangulo");
      lado=captura.nextFloat();

      System.out.println("ingrese el valor del triangulo");
      lado=captura.nextFloat();
      
        // crear el objeto de la subclase 
        Rectangulo c1=new Rectangulo(lado);
        Triangulo c2=new Triangulo();
        c1.calcularArea();
        c2.calcularArea();
       
        captura.close();

    }
}

